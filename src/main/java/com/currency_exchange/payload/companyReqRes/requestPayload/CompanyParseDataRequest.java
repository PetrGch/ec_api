package com.currency_exchange.payload.companyReqRes.requestPayload;

import com.currency_exchange.model.ExchangeCompanyParseData;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by petr on 17.06.18.
 */

public class CompanyParseDataRequest {

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

  @Override
  public String toString() {
    return "CompanyParseDataRequest{" +
        "url='" + url + '\'' +
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
