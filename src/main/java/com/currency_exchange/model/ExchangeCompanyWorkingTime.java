package com.currency_exchange.model;

import com.currency_exchange.model.audit.DateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "exchange_company_working_time")
public class ExchangeCompanyWorkingTime extends DateAudit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "mn_from")
  private String mnFrom;

  @Column(name = "mn_to")
  private String mnTo;

  @Column(name = "tu_from")
  private String tuFrom;

  @Column(name = "tu_to")
  private String tuTo;

  @Column(name = "we_from")
  private String weFrom;

  @Column(name = "we_to")
  private String weTo;

  @Column(name = "th_from")
  private String thFrom;

  @Column(name = "th_to")
  private String thTo;

  @Column(name = "fr_from")
  private String frFrom;

  @Column(name = "fr_to")
  private String frTo;

  @Column(name = "st_from")
  private String stFrom;

  @Column(name = "st_to")
  private String stTo;

  @Column(name = "sn_from")
  private String snFrom;

  @Column(name = "sn_to")
  private String snTo;

  public ExchangeCompanyWorkingTime() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMnFrom() {
    return mnFrom;
  }

  public void setMnFrom(String mnFrom) {
    this.mnFrom = mnFrom;
  }

  public String getMnTo() {
    return mnTo;
  }

  public void setMnTo(String mnTo) {
    this.mnTo = mnTo;
  }

  public String getTuFrom() {
    return tuFrom;
  }

  public void setTuFrom(String tuFrom) {
    this.tuFrom = tuFrom;
  }

  public String getTuTo() {
    return tuTo;
  }

  public void setTuTo(String tuTo) {
    this.tuTo = tuTo;
  }

  public String getWeFrom() {
    return weFrom;
  }

  public void setWeFrom(String weFrom) {
    this.weFrom = weFrom;
  }

  public String getWeTo() {
    return weTo;
  }

  public void setWeTo(String weTo) {
    this.weTo = weTo;
  }

  public String getThFrom() {
    return thFrom;
  }

  public void setThFrom(String thFrom) {
    this.thFrom = thFrom;
  }

  public String getThTo() {
    return thTo;
  }

  public void setThTo(String thTo) {
    this.thTo = thTo;
  }

  public String getFrFrom() {
    return frFrom;
  }

  public void setFrFrom(String frFrom) {
    this.frFrom = frFrom;
  }

  public String getFrTo() {
    return frTo;
  }

  public void setFrTo(String frTo) {
    this.frTo = frTo;
  }

  public String getStFrom() {
    return stFrom;
  }

  public void setStFrom(String stFrom) {
    this.stFrom = stFrom;
  }

  public String getStTo() {
    return stTo;
  }

  public void setStTo(String stTo) {
    this.stTo = stTo;
  }

  public String getSnFrom() {
    return snFrom;
  }

  public void setSnFrom(String snFrom) {
    this.snFrom = snFrom;
  }

  public String getSnTo() {
    return snTo;
  }

  public void setSnTo(String snTo) {
    this.snTo = snTo;
  }

  @Override
  public String toString() {
    return "ExchangeCompanyWorkingTime{" +
        "id=" + id +
        ", mnFrom='" + mnFrom + '\'' +
        ", mnTo='" + mnTo + '\'' +
        ", tuFrom='" + tuFrom + '\'' +
        ", tuTo='" + tuTo + '\'' +
        ", weFrom='" + weFrom + '\'' +
        ", weTo='" + weTo + '\'' +
        ", thFrom='" + thFrom + '\'' +
        ", thTo='" + thTo + '\'' +
        ", frFrom='" + frFrom + '\'' +
        ", frTo='" + frTo + '\'' +
        ", stFrom='" + stFrom + '\'' +
        ", stTo='" + stTo + '\'' +
        ", snFrom='" + snFrom + '\'' +
        ", snTo='" + snTo + '\'' +
        '}';
  }
}
