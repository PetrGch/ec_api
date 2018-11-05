package com.currency_exchange.service;

import com.currency_exchange.payload.exCompanyReqRes.ExchangeCompanyResponse;
import com.currency_exchange.util.UrlRequest;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Component
public class ExchangeCompanyService {

  @Value("scraper.serverUrl")
  private String url;

  private ObjectMapper objectMapper;

  public List<ExchangeCompanyResponse> getAllCompany() {
    UrlRequest content = null;
    try {
      content = new UrlRequest
          .UrlRequestBuilder()
          .createConnection(url + "/exCompany")
          .createParameters("GET")
          .makeRequest()
          .build();
    } catch (IOException e) {
      e.printStackTrace();
    }

    objectMapper = new ObjectMapper();

    if (content != null) {
      try {
        String json = content.getResponseContent().toString();
        return objectMapper.readValue(json, new TypeReference<List<ExchangeCompanyResponse>>(){});
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return Collections.emptyList();
  }

  public ExchangeCompanyResponse getCompanyById(Long id) {
    UrlRequest content = null;
    try {
      content = new UrlRequest
          .UrlRequestBuilder()
          .createConnection(url + "/exCompany/" + id)
          .createParameters("GET")
          .makeRequest()
          .build();
    } catch (IOException e) {
      e.printStackTrace();
    }

    objectMapper = new ObjectMapper();

    if (content != null) {
      try {
        String json = content.getResponseContent().toString();
        return objectMapper.readValue(json, ExchangeCompanyResponse.class);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return null;
  }

}
