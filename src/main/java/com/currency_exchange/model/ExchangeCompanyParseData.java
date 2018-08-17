package com.currency_exchange.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by petr on 15.06.18.
 */

@Entity
@Table(name = "exchange_company_parse_data")
public class ExchangeCompanyParseData {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Size(max = 120)
  @NotBlank
  private String url;

  @Size(max = 120)
  private String parameters;

  @Size(max = 60)
  private String rowSelector;

  @Size(max = 60)
  private String currencyAmountSelector;

  @Size(max = 60)
  private String currencyTypeSelector;

  @Size(max = 60)
  private String buySelector;

  @Size(max = 60)
  private String sellSelector;

  private boolean isActive;

  @OneToOne(mappedBy = "exchangeCompanyParseData", cascade = CascadeType.ALL)
  private ExchangeCompany exchangeCompany;

  public ExchangeCompanyParseData() {}

  public ExchangeCompanyParseData(
      @Size(max = 120) @NotBlank String url,
      @Size(max = 120) String parameters,
      @Size(max = 60) String rowSelector,
      @Size(max = 60) String currencyAmountSelector,
      @Size(max = 60) String currencyTypeSelector,
      @Size(max = 60) String buySelector,
      @Size(max = 60) String sellSelector,
      boolean isActive
  ) {
    this.url = url;
    this.parameters = parameters;
    this.rowSelector = rowSelector;
    this.currencyAmountSelector = currencyAmountSelector;
    this.currencyTypeSelector = currencyTypeSelector;
    this.buySelector = buySelector;
    this.sellSelector = sellSelector;
    this.isActive = isActive;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getParameters() {
    return parameters;
  }

  public void setParameters(String parameters) {
    this.parameters = parameters;
  }

  public String getRowSelector() {
    return rowSelector;
  }

  public void setRowSelector(String rowSelector) {
    this.rowSelector = rowSelector;
  }

  public String getCurrencyAmountSelector() {
    return currencyAmountSelector;
  }

  public void setCurrencyAmountSelector(String currencyAmountSelector) {
    this.currencyAmountSelector = currencyAmountSelector;
  }

  public String getCurrencyTypeSelector() {
    return currencyTypeSelector;
  }

  public void setCurrencyTypeSelector(String currencyTypeSelector) {
    this.currencyTypeSelector = currencyTypeSelector;
  }

  public String getBuySelector() {
    return buySelector;
  }

  public void setBuySelector(String buySelector) {
    this.buySelector = buySelector;
  }

  public String getSellSelector() {
    return sellSelector;
  }

  public void setSellSelector(String sellSelector) {
    this.sellSelector = sellSelector;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public ExchangeCompany getExchangeCompany() {
    return exchangeCompany;
  }

  public void setExchangeCompany(ExchangeCompany exchangeCompany) {
    this.exchangeCompany = exchangeCompany;
  }

  @Override
  public String toString() {
    return "ExchangeCompanyParseData{" +
        "id=" + id +
        ", url='" + url + '\'' +
        ", parameters='" + parameters + '\'' +
        ", rowSelector='" + rowSelector + '\'' +
        ", currencyAmountSelector='" + currencyAmountSelector + '\'' +
        ", currencyTypeSelector='" + currencyTypeSelector + '\'' +
        ", buySelector='" + buySelector + '\'' +
        ", sellSelector='" + sellSelector + '\'' +
        ", isActive=" + isActive +
        '}';
  }

}
