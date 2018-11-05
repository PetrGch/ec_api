package com.currency_exchange.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class UrlRequest {

  private StringBuffer responseContent;

  public StringBuffer getResponseContent() {
    return responseContent;
  }

  private UrlRequest(StringBuffer responseContent) {
    this.responseContent = responseContent;
  }

  public static class UrlRequestBuilder {

    private HttpURLConnection connection;
    private StringBuffer responseContent;

    public UrlRequestBuilder() {}

    public UrlRequestBuilder createConnection(String urlString) {
      URL url = null;
      try {
        url = new URL(urlString);
        connection = (HttpURLConnection) url.openConnection();
      } catch (IOException e) {
        e.printStackTrace();
      }

      return this;
    }

    public UrlRequestBuilder createParameters(String methodType) {
      try {
        connection.setRequestMethod(methodType);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
      } catch (ProtocolException e) {
        e.printStackTrace();
      }

      return this;
    }

    public UrlRequestBuilder makeRequest() throws IOException {
      String inputLine;
      BufferedReader in = null;
      if (connection != null) {
        try {
          in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (in != null) {
          responseContent = new StringBuffer();
          while ((inputLine = in.readLine()) != null) {
            responseContent.append(inputLine);
          }
          in.close();
        }
        connection.disconnect();
      }

      return this;
    }

    public UrlRequest build() {
      return new UrlRequest(responseContent);
    }

  }

}
