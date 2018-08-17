package com.currency_exchange.payload.companyReqRes.requestPayload;

import javax.validation.constraints.NotNull;

/**
 * Created by petr on 16.06.18.
 */
public class WorkingTimeRequest {

  @NotNull
  private String mnFrom;

  @NotNull
  private String mnTo;

  @NotNull
  private String tuFrom;

  @NotNull
  private String  tuTo;

  @NotNull
  private String weFrom;

  @NotNull
  private String weTo;

  @NotNull
  private String thFrom;

  @NotNull
  private String thTo;

  @NotNull
  private String frFrom;

  @NotNull
  private String frTo;
  private String stFrom;
  private String stTo;
  private String snFrom;
  private String snTo;

  public WorkingTimeRequest() {}

  public WorkingTimeRequest(
      @NotNull String mnFrom,
      @NotNull String mnTo,
      @NotNull String tuFrom,
      @NotNull String tuTo,
      @NotNull String weFrom,
      @NotNull String weTo,
      @NotNull String thFrom,
      @NotNull String thTo,
      @NotNull String frFrom,
      @NotNull String frTo,
      String stFrom,
      String stTo,
      String snFrom,
      String snTo
  ) {
    this.mnFrom = mnFrom;
    this.mnTo = mnTo;
    this.tuFrom = tuFrom;
    this.tuTo = tuTo;
    this.weFrom = weFrom;
    this.weTo = weTo;
    this.thFrom = thFrom;
    this.thTo = thTo;
    this.frFrom = frFrom;
    this.frTo = frTo;
    this.stFrom = stFrom;
    this.stTo = stTo;
    this.snFrom = snFrom;
    this.snTo = snTo;
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
