package com.currency_exchange.model;

import com.currency_exchange.model.audit.DateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by petr on 12.06.18.
 */

@Entity
@Table(name = "exchange_company", uniqueConstraints = {
    @UniqueConstraint(columnNames = {
        "uniqueId"
    }),
    @UniqueConstraint(columnNames = {
        "name"
    })
})
public class ExchangeCompany extends DateAudit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Size(max = 40)
  private String uniqueId;

  @NotBlank
  @Size(max = 120)
  private String name;

  @Size(max = 20)
  private String coordinateX;

  @Size(max = 20)
  private String coordinateY;

  @Size(max = 160)
  private String address;

  private Float rating;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "exchange_company_detail_id")
  private ExchangeCompanyDetail exchangeCompanyDetail;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "working_time_id")
  private WorkingTime workingTime;

  @OneToMany(mappedBy = "exchangeCompany", cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST})
  private List<Comment> comments;

  @OneToMany(mappedBy = "exchangeCompany", cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST})
  private List<CurrencyRate> currencyRates;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "exchange_company_parse_data_id")
  private ExchangeCompanyParseData exchangeCompanyParseData;

  public ExchangeCompany() {
    this.uniqueId = UUID.randomUUID().toString();
  }

  public ExchangeCompany(
      @NotBlank @Size(max = 120) String name,
      @Size(max = 14) String coordinateX,
      @Size(max = 14) String coordinateY,
      @Size(max = 160) String address,
      @Size(max = 4) Float rating
  ) {
    this.uniqueId = UUID.randomUUID().toString();
    this.name = name;
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
    this.address = address;
    this.rating = rating;
  }

  public void addComent(Comment tempComment) {
    if (comments == null) {
      comments = new ArrayList<>();
    }

    comments.add(tempComment);
    tempComment.setExchangeCompany(this);
  }

  public void addAllComent(List<Comment> tempComments) {
    if (comments == null) {
      comments = new ArrayList<>();
    }

    tempComments.stream().forEach(coment -> {
      comments.add(coment);
      coment.setExchangeCompany(this);
    });
  }

  public void addExRate(CurrencyRate tempCurrencyRate) {
    if (currencyRates == null) {
      currencyRates = new ArrayList<>();
    }

    currencyRates.add(tempCurrencyRate);
    tempCurrencyRate.setExchangeCompany(this);
  }

  public void addAllExRate(List<CurrencyRate> tempCurrencyRates) {
    if (currencyRates == null) {
      currencyRates = new ArrayList<>();
    }

    tempCurrencyRates.stream().forEach(exRate -> {
      currencyRates.add(exRate);
      exRate.setExchangeCompany(this);
    });
  }

  public void removeAllExRate(List<CurrencyRate> tempCurrencyRates) {
    tempCurrencyRates.stream().forEach(exRate -> {
      currencyRates.remove(exRate);
    });
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

  public WorkingTime getWorkingTime() {
    return workingTime;
  }

  public void setWorkingTime(WorkingTime workingTime) {
    this.workingTime = workingTime;
  }

  public Float getRating() {
    return rating;
  }

  public void setRating(Float rating) {
    this.rating = rating;
  }

  public ExchangeCompanyDetail getExchangeCompanyDetail() {
    return exchangeCompanyDetail;
  }

  public void setExchangeCompanyDetail(ExchangeCompanyDetail exchangeCompanyDetail) {
    this.exchangeCompanyDetail = exchangeCompanyDetail;
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

  public ExchangeCompanyParseData getExchangeCompanyParseData() {
    return exchangeCompanyParseData;
  }

  public void setExchangeCompanyParseData(ExchangeCompanyParseData exchangeCompanyParseData) {
    this.exchangeCompanyParseData = exchangeCompanyParseData;
  }

  @Override
  public String toString() {
    return "ExchangeCompany{" +
        "id=" + id +
        ", uniqueId='" + uniqueId + '\'' +
        ", name='" + name + '\'' +
        ", coordinateX='" + coordinateX + '\'' +
        ", coordinateY='" + coordinateY + '\'' +
        ", address='" + address + '\'' +
        ", workingTime='" + workingTime + '\'' +
        ", rating=" + rating +
        '}';
  }
}
