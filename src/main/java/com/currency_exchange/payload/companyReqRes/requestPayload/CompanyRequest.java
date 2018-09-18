package com.currency_exchange.payload.companyReqRes.requestPayload;

import com.currency_exchange.model.Comment;
import com.currency_exchange.model.CurrencyRate;
import com.currency_exchange.model.WorkingTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by petr on 16.06.18.
 */

public class CompanyRequest {

  private Long id;

  @NotBlank
  @Size(max = 120)
  @Valid
  private String name;

  @Size(max = 14)
  private String coordinateX;

  @Size(max = 14)
  private String coordinateY;

  @Size(max = 160)
  private String address;

  @Size(max = 4)
  private Float rating;

  private Boolean isCentralBank;

  @NotNull
  private WorkingTimeRequest workingTime;

  private CompanyDetailRequest exchangeCompanyDetail;
  private CompanyParseDataRequest exchangeCompanyParseData;
  private List<Comment> comments;
  private List<CurrencyRate> currencyRates;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCoordinateX() {
    return coordinateX;
  }

  public void setCoordinateX(String coordinateX) {
    this.coordinateX = coordinateX;
  }

  public String getCoordinateY() {
    return coordinateY;
  }

  public void setCoordinateY(String coordinateY) {
    this.coordinateY = coordinateY;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }

  public CompanyDetailRequest getExchangeCompanyDetail() {
    return exchangeCompanyDetail;
  }

  public void setExchangeCompanyDetail(CompanyDetailRequest exchangeCompanyDetail) {
    this.exchangeCompanyDetail = exchangeCompanyDetail;
  }

  public CompanyParseDataRequest getExchangeCompanyParseData() {
    return exchangeCompanyParseData;
  }

  public void setExchangeCompanyParseData(CompanyParseDataRequest exchangeCompanyParseData) {
    this.exchangeCompanyParseData = exchangeCompanyParseData;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public List<CurrencyRate> getCurrencyRates() {
    return currencyRates;
  }

  public void setCurrencyRates(List<CurrencyRate> currencyRates) {
    this.currencyRates = currencyRates;
  }

  public WorkingTimeRequest getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(WorkingTimeRequest workingTimeRequest) {
    this.workingTime = workingTimeRequest;
  }

  public Boolean getCentralBank() {
    return isCentralBank;
  }

  public void setCentralBank(Boolean centralBank) {
    isCentralBank = centralBank;
  }
}
