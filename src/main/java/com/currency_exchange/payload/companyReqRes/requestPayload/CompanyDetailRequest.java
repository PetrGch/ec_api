package com.currency_exchange.payload.companyReqRes.requestPayload;

import com.currency_exchange.model.ExchangeCompany;
import com.currency_exchange.model.ExchangeCompanyDetail;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 * Created by petr on 16.06.18.
 */
public class CompanyDetailRequest {

  @Size(max = 400)
  private String description;

  @Size(max = 14)
  private String phone;

  @Size(max = 50)
  private String website;

  @Size(max = 50)
  @Email
  private String email;

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
}
