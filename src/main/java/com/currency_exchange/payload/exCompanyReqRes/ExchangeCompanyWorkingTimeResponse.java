package com.currency_exchange.payload.exCompanyReqRes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExchangeCompanyWorkingTimeResponse {

  private Long id;

  @JsonProperty("mn_from")
  private String mnFrom;

  @JsonProperty("mn_to")
  private String mnTo;

  @JsonProperty("tu_from")
  private String tuFrom;

  @JsonProperty("tu_to")
  private String tuTo;

  @JsonProperty("we_from")
  private String weFrom;

  @JsonProperty("we_to")
  private String weTo;

  @JsonProperty("th_from")
  private String thFrom;

  @JsonProperty("th_to")
  private String thTo;

  @JsonProperty("fr_from")
  private String frFrom;

  @JsonProperty("fr_to")
  private String frTo;

  @JsonProperty("st_from")
  private String stFrom;

  @JsonProperty("st_to")
  private String stTo;

  @JsonProperty("sn_from")
  private String snFrom;

  @JsonProperty("sn_to")
  private String snTo;

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

}
