package com.currency_exchange.payload.companyReqRes.responsePayload;

import com.currency_exchange.model.WorkingTime;

import java.text.SimpleDateFormat;

/**
 * Created by petr on 16.06.18.
 */
public class WorkingTimeResponse {

  private String mnFrom;
  private String mnTo;
  private String tuFrom;
  private String tuTo;
  private String weFrom;
  private String weTo;
  private String thFrom;
  private String thTo;
  private String frFrom;
  private String frTo;
  private String stFrom;
  private String stTo;
  private String snFrom;
  private String snTo;

  public WorkingTimeResponse() {}

  public WorkingTimeResponse(WorkingTime wt) {
    this.mnFrom = new SimpleDateFormat("HH:mm").format(wt.getMnFrom());
    this.mnTo = new SimpleDateFormat("HH:mm").format(wt.getMnTo());
    this.tuFrom = new SimpleDateFormat("HH:mm").format(wt.getTuFrom());
    this.tuTo = new SimpleDateFormat("HH:mm").format(wt.getTuTo());
    this.weFrom = new SimpleDateFormat("HH:mm").format(wt.getWeFrom());
    this.weTo = new SimpleDateFormat("HH:mm").format(wt.getWeTo());
    this.thFrom = new SimpleDateFormat("HH:mm").format(wt.getThFrom());
    this.thTo = new SimpleDateFormat("HH:mm").format(wt.getThTo());
    this.frFrom = new SimpleDateFormat("HH:mm").format(wt.getFrFrom());
    this.frTo = new SimpleDateFormat("HH:mm").format(wt.getFrTo());
    this.stFrom = wt.getStFrom() != null
        ? new SimpleDateFormat("HH:mm").format(wt.getStFrom()) : null;
    this.stTo = wt.getStTo() != null
        ? new SimpleDateFormat("HH:mm").format(wt.getStTo()) : null;
    this.snFrom = wt.getSnFrom() != null
        ? new SimpleDateFormat("HH:mm").format(wt.getSnFrom()) : null;
    this.snTo = wt.getSnTo() != null
        ? new SimpleDateFormat("HH:mm").format(wt.getSnTo()) : null;
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
