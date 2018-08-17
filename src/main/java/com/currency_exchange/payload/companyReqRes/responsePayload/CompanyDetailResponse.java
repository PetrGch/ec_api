package com.currency_exchange.payload.companyReqRes.responsePayload;

import com.currency_exchange.model.ExchangeCompany;
import com.currency_exchange.model.ExchangeCompanyDetail;

/**
 * Created by petr on 16.06.18.
 */
public class CompanyDetailResponse {

  private String description;
  private String phone;
  private String website;
  private String email;
  private ExchangeCompany exchangeCompany;

  public CompanyDetailResponse(ExchangeCompanyDetail e) {
    this.description = e.getDescription();
    this.phone = e.getPhone();
    this.website = e.getWebsite();
    this.email = e.getEmail();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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

  public ExchangeCompany getExchangeCompany() {
    return exchangeCompany;
  }

  public void setExchangeCompany(ExchangeCompany exchangeCompany) {
    this.exchangeCompany = exchangeCompany;
  }
}
