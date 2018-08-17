package com.currency_exchange.payload.companyReqRes.responsePayload;

import com.currency_exchange.model.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by petr on 16.06.18.
 */
public class CompanyResponse {

  private Long id;
  private String uniqueId;
  private String name;
  private String coordinateX;
  private String coordinateY;
  private String address;
  private Float rating;
  private Instant createdAt;
  private Instant updatedAt;

  private CompanyDetailResponse exchangeCompanyDetail;
  private WorkingTimeResponse workingTime;
  private List<CommentResponse> comments;
  private List<CurrencyRateResponse> currencyRates;
  private CompanyParseDataResponse exchangeCompanyParseData;

  public CompanyResponse(ExchangeCompany e) {
    this.id = e.getId();
    this.uniqueId = e.getUniqueId();
    this.name = e.getName();
    this.coordinateX = e.getCoordinateX();
    this.coordinateY = e.getCoordinateY();
    this.address = e.getAddress();
    this.rating = e.getRating();
    this.createdAt = e.getCreatedAt();
    this.updatedAt = e.getUpdatedAt();
    this.exchangeCompanyDetail = e.getExchangeCompanyDetail() != null
        ? new CompanyDetailResponse(e.getExchangeCompanyDetail()) : null;
    this.workingTime = e.getWorkingTime() != null
        ? new WorkingTimeResponse(e.getWorkingTime()) : null;
    this.comments = this.parseComentsList(e.getComments());
    this.currencyRates = this.parseCurrencyRateList(e.getCurrencyRates());
    this.exchangeCompanyParseData = e.getExchangeCompanyParseData() != null
        ? new CompanyParseDataResponse(e.getExchangeCompanyParseData()) : null;
  }

  private List<CommentResponse> parseComentsList(List<Comment> comments) {
    if (comments != null && !comments.isEmpty()) {
      List<CommentResponse> commentResponses = new ArrayList<>();
      comments.stream().forEach((c) -> {
        commentResponses.add(new CommentResponse(c));
      });

      return commentResponses;
    }

    return Collections.emptyList();
  }

  private List<CurrencyRateResponse> parseCurrencyRateList(List<CurrencyRate> currencyRates) {
    if (currencyRates != null && !currencyRates.isEmpty()) {
      List<CurrencyRateResponse> currencyRateResponses = new ArrayList<>();
      currencyRates.stream().forEach((c) -> {
        currencyRateResponses.add(new CurrencyRateResponse(c));
      });

      return currencyRateResponses;
    }

    return Collections.emptyList();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
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

  public WorkingTimeResponse getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(WorkingTimeResponse workingTime) {
    this.workingTime = workingTime;
  }

  public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
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

  public CompanyDetailResponse getExchangeCompanyDetail() {
    return exchangeCompanyDetail;
  }

  public void setExchangeCompanyDetail(CompanyDetailResponse companyDetail) {
    this.exchangeCompanyDetail = companyDetail;
  }

  public List<CommentResponse> getComments() {
    return comments;
  }

  public void setComments(List<CommentResponse> comments) {
    this.comments = comments;
  }

  public List<CurrencyRateResponse> getCurrencyRates() {
    return currencyRates;
  }

  public void setCurrencyRates(List<CurrencyRateResponse> currencyRates) {
    this.currencyRates = currencyRates;
  }

  public CompanyParseDataResponse getExchangeCompanyParseData() {
    return exchangeCompanyParseData;
  }

  public void setExchangeCompanyParseData(CompanyParseDataResponse exchangeCompanyParseData) {
    this.exchangeCompanyParseData = exchangeCompanyParseData;
  }
}
