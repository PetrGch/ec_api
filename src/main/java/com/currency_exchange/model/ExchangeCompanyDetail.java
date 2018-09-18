package com.currency_exchange.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

/**
 * Created by petr on 14.06.18.
 */

@Entity
@Table(name = "exchange_company_detail")
public class ExchangeCompanyDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Size(max = 20)
  private String phone;

  @Size(max = 50)
  private String website;

  @Size(max = 50)
  @Email
  private String email;

  @OneToOne(mappedBy = "exchangeCompanyDetail", cascade = CascadeType.ALL)
  private ExchangeCompany exchangeCompany;

  public ExchangeCompanyDetail() {}

  public ExchangeCompanyDetail(
      @Size(max = 14) String phone,
      @Size(max = 50) String website,
      @Size(max = 50) String email
  ) {
    this.phone = phone;
    this.website = website;
    this.email = email;
  }

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

  public ExchangeCompany getExchangeCompany() {
    return exchangeCompany;
  }

  public void setExchangeCompany(ExchangeCompany exchangeCompany) {
    this.exchangeCompany = exchangeCompany;
  }

  @Override
  public String toString() {
    return "ExchangeCompanyDetail{" +
        "id=" + id +
        ", phone='" + phone + '\'' +
        ", website='" + website + '\'' +
        ", email='" + email + '\'' +
        '}';
  }

}
