package com.currency_exchange.payload.companyReqRes.responsePayload;

import com.currency_exchange.model.ExchangeCompanyParseData;

/**
 * Created by petr on 17.06.18.
 */

public class CompanyParseDataResponse {

  private String url;
  private String parameters;
  private String rowSelector;
  private String currencyAmountSelector;
  private String currencyTypeSelector;
  private String buySelector;
  private String sellSelector;
  private boolean isActive;

  public CompanyParseDataResponse(ExchangeCompanyParseData c) {
    this.url = c.getUrl();
    this.parameters = c.getParameters();
    this.rowSelector = c.getRowSelector();
    this.currencyAmountSelector = c.getCurrencyAmountSelector();
    this.currencyTypeSelector = c.getCurrencyTypeSelector();
    this.buySelector = c.getBuySelector();
    this.sellSelector = c.getSellSelector();
    this.isActive = c.isActive();
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

}
