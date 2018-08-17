package com.currency_exchange.payload.companyReqRes.responsePayload;

import com.currency_exchange.model.CurrencyRate;
import com.currency_exchange.model.CurrencyType;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Created by petr on 17.06.18.
 */

public class CurrencyRateResponse {

  private Long id;
  private String currencyName;
  private CurrencyType currencyType;
  private BigDecimal buyPrice;
  private BigDecimal sellPrice;
  private Instant createdAt;
  private Instant updatedAt;

  public CurrencyRateResponse(CurrencyRate c) {
    this.id = c.getId();
    this.currencyName = c.getCurrencyName();
    this.currencyType = c.getCurrencyType();
    this.buyPrice = c.getBuyPrice();
    this.sellPrice = c.getSellPrice();
    this.createdAt = c.getCreatedAt();
    this.updatedAt = c.getUpdatedAt();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  public CurrencyType getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(CurrencyType currencyType) {
    this.currencyType = currencyType;
  }

  public BigDecimal getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(BigDecimal buyPrice) {
    this.buyPrice = buyPrice;
  }

  public BigDecimal getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(BigDecimal sellPrice) {
    this.sellPrice = sellPrice;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
