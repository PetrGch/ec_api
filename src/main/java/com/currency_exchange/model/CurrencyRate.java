package com.currency_exchange.model;

import com.currency_exchange.model.audit.DateAudit;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * Created by petr on 15.06.18.
 */

@Entity
@Table(name = "currency_rate")
public class CurrencyRate extends DateAudit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Size(max = 50)
  private String currencyName;

  @Enumerated(EnumType.STRING)
  @Column(length = 5)
  private CurrencyType currencyType;

  @Digits(integer=6, fraction=3)
  @NotNull
  private BigDecimal buyPrice;

  @Digits(integer=6, fraction=3)
  @NotNull
  private BigDecimal sellPrice;

  @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST})
  @JoinColumn(name = "exchange_company_id")
  private ExchangeCompany exchangeCompany;

  public CurrencyRate() {}

  public CurrencyRate(
      @Size(max = 20) String currencyName,
      CurrencyType currencyType,
      @Digits(integer=5, fraction=3) BigDecimal buyPrice,
      @Digits(integer=5, fraction=3) BigDecimal sellPrice
  ) {
    this.currencyName = currencyName;
    this.currencyType = currencyType;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
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

  public ExchangeCompany getExchangeCompany() {
    return exchangeCompany;
  }

  public void setExchangeCompany(ExchangeCompany exchangeCompany) {
    this.exchangeCompany = exchangeCompany;
  }

  @Override
  public String toString() {
    return "CurrencyRate{" +
        "id=" + id +
        ", currencyName='" + currencyName + '\'' +
        ", currencyType=" + currencyType +
        ", buyPrice=" + buyPrice +
        ", sellPrice=" + sellPrice +
        ", exchangeCompany=" + exchangeCompany +
        '}';
  }

}
