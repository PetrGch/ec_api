package com.currency_exchange.scriper;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpHost;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Scriper {

  @Value("${unirest.proxy.ip}")
  private String ip;
  @Value("${unirest.proxy.port}")
  private int port;
  @Value("${unirest.user-agent.name}")
  private String userAgentName;
  @Value("${unirest.user-agent.value}")
  private String userAgentValue;

  private Document makeRequest() throws UnirestException {
    Unirest.setDefaultHeader(userAgentName, userAgentValue);
    Unirest.setProxy(new HttpHost(ip, port));


    HttpResponse<String> response = Unirest
        .get("http://www.kantor-exchange.pl/")
        .asString();

    Document document = Jsoup.parseBodyFragment(response.getBody());

    return document;
  }

}
