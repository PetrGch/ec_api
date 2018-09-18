package com.currency_exchange.payload.companyReqRes.requestPayload;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 * Created by petr on 16.06.18.
 */
public class CompanyDetailRequest {

  @Size(max = 14)
  private String phone;

  @Size(max = 50)
  private String website;

  @Size(max = 50)
  @Email
  private String email;

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
