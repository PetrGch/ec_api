package com.currency_exchange.payload.companyReqRes.responsePayload;

import com.currency_exchange.model.WorkingTime;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by petr on 16.06.18.
 */
public class WorkingTimeResponse {

  @NotNull
  private Date mnFrom;

  @NotNull
  private Date mnTo;

  @NotNull
  private Date tuFrom;

  @NotNull
  private Date  tuTo;

  @NotNull
  private Date weFrom;

  @NotNull
  private Date weTo;

  @NotNull
  private Date thFrom;

  @NotNull
  private Date thTo;

  @NotNull
  private Date frFrom;

  @NotNull
  private Date frTo;
  private Date stFrom;
  private Date stTo;
  private Date snFrom;
  private Date snTo;

  public WorkingTimeResponse() {}

  public WorkingTimeResponse(WorkingTime wt) {
    this.mnFrom = wt.getMnFrom();
    this.mnTo = wt.getMnTo();
    this.tuFrom = wt.getTuFrom();
    this.tuTo = wt.getTuTo();
    this.weFrom = wt.getWeFrom();
    this.weTo = wt.getWeTo();
    this.thFrom = wt.getThFrom();
    this.thTo = wt.getThTo();
    this.frFrom = wt.getFrFrom();
    this.frTo = wt.getFrTo();
    this.stFrom = wt.getStFrom();
    this.stTo = wt.getStTo();
    this.snFrom = wt.getSnFrom();
    this.snTo = wt.getSnTo();
  }

  public Date getMnFrom() {
    return mnFrom;
  }

  public void setMnFrom(Date mnFrom) {
    this.mnFrom = mnFrom;
  }

  public Date getMnTo() {
    return mnTo;
  }

  public void setMnTo(Date mnTo) {
    this.mnTo = mnTo;
  }

  public Date getTuFrom() {
    return tuFrom;
  }

  public void setTuFrom(Date tuFrom) {
    this.tuFrom = tuFrom;
  }

  public Date getTuTo() {
    return tuTo;
  }

  public void setTuTo(Date tuTo) {
    this.tuTo = tuTo;
  }

  public Date getWeFrom() {
    return weFrom;
  }

  public void setWeFrom(Date weFrom) {
    this.weFrom = weFrom;
  }

  public Date getWeTo() {
    return weTo;
  }

  public void setWeTo(Date weTo) {
    this.weTo = weTo;
  }

  public Date getThFrom() {
    return thFrom;
  }

  public void setThFrom(Date thFrom) {
    this.thFrom = thFrom;
  }

  public Date getThTo() {
    return thTo;
  }

  public void setThTo(Date thTo) {
    this.thTo = thTo;
  }

  public Date getFrFrom() {
    return frFrom;
  }

  public void setFrFrom(Date frFrom) {
    this.frFrom = frFrom;
  }

  public Date getFrTo() {
    return frTo;
  }

  public void setFrTo(Date frTo) {
    this.frTo = frTo;
  }

  public Date getStFrom() {
    return stFrom;
  }

  public void setStFrom(Date stFrom) {
    this.stFrom = stFrom;
  }

  public Date getStTo() {
    return stTo;
  }

  public void setStTo(Date stTo) {
    this.stTo = stTo;
  }

  public Date getSnFrom() {
    return snFrom;
  }

  public void setSnFrom(Date snFrom) {
    this.snFrom = snFrom;
  }

  public Date getSnTo() {
    return snTo;
  }

  public void setSnTo(Date snTo) {
    this.snTo = snTo;
  }
}
