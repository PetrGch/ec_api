package com.currency_exchange.model;

import com.currency_exchange.model.audit.DateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "exchange_company", uniqueConstraints = {
    @UniqueConstraint(columnNames = {
        "uuid"
    }),
    @UniqueConstraint(columnNames = {
        "branch_name"
    })
})
public class ExchangeCompany extends DateAudit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @NotNull
  @Column(name = "uuid")
  private String uuid;

  @Column(name = "company_name")
  private String companyName;

  @NotNull
  @Column(name = "branch_name")
  private String branchName;

  @Column(name = "lat")
  private String lat;

  @Column(name = "lng")
  private String lng;

  @Column(name = "is_central_bank")
  private boolean isCentralBank = false;

  public ExchangeCompany() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getBranchName() {
    return branchName;
  }

  public void setBranchName(String branchName) {
    this.branchName = branchName;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLng() {
    return lng;
  }

  public void setLng(String lng) {
    this.lng = lng;
  }

  public boolean isCentralBank() {
    return isCentralBank;
  }

  public void setCentralBank(boolean centralBank) {
    isCentralBank = centralBank;
  }

  @Override
  public String toString() {
    return "ExchangeCompany{" +
        "uuid=" + uuid +
        ", companyName='" + companyName + '\'' +
        ", branchName='" + branchName + '\'' +
        ", lat='" + lat + '\'' +
        ", lng='" + lng + '\'' +
        ", isCentralBank=" + isCentralBank +
        '}';
  }
}
