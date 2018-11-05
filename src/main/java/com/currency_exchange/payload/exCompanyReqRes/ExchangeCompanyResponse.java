package com.currency_exchange.payload.exCompanyReqRes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExchangeCompanyResponse {

  private Long id;
  private String uuid;

  @JsonProperty("company_name")
  private String companyName;

  @JsonProperty("branch_name")
  private String branchName;
  private String lat;
  private String lng;
  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("updated_at")
  private String updatedAt;
  @JsonProperty("is_central_bank")
  private boolean isCentralBank = false;

  @JsonProperty("exchange_currencies")
  private List<?> exchangeCurrencies;

  public ExchangeCompanyResponse() {}

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

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public boolean isCentralBank() {
    return isCentralBank;
  }

  public void setCentralBank(boolean centralBank) {
    isCentralBank = centralBank;
  }

  public List<?> getExchangeCurrencies() {
    return exchangeCurrencies;
  }

  public void setExchangeCurrencies(List<?> exchangeCurrencies) {
    this.exchangeCurrencies = exchangeCurrencies;
  }
}
