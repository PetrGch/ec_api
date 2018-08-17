package com.currency_exchange.payload.companyReqRes.requestPayload;

import com.currency_exchange.model.CurrencyRate;
import com.currency_exchange.model.CurrencyType;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * Created by petr on 17.06.18.
 */

public class CurrencyRateRequest {

  private Long id;
  private String currencyName;

  @Enumerated(EnumType.STRING)
  @Column(length = 4)
  private CurrencyType currencyType;

  @Digits(integer=5, fraction=3)
  @NotNull
  private BigDecimal buyPrice;

  @Digits(integer=5, fraction=3)
  @NotNull
  private BigDecimal sellPrice;

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
}
