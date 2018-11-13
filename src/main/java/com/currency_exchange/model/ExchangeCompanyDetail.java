package com.currency_exchange.model;

import com.currency_exchange.model.audit.DateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "exchange_company_detail")
public class ExchangeCompanyDetail extends DateAudit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "phone")
  private String phone;

  @Column(name = "website")
  private String website;

  @Column(name = "email")
  private String email;

  public ExchangeCompanyDetail() {}

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
