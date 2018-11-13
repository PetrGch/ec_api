package com.currency_exchange.payload.exCompanyReqRes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeCompanyDetailResponse {

  private Long id;
  private String phone;
  private String website;
  private String email;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
