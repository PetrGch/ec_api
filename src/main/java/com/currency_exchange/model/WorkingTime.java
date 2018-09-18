package com.currency_exchange.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "working_time")
public class WorkingTime {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date mnFrom;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date mnTo;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date tuFrom;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date tuTo;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date weFrom;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date weTo;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date thFrom;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date thTo;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date frFrom;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date frTo;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date stFrom;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date stTo;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date snFrom;

  @Basic
  @Temporal(TemporalType.TIME)
  private Date snTo;

  @OneToOne(mappedBy = "workingTime", cascade = CascadeType.ALL)
  private ExchangeCompany exchangeCompany;

  public WorkingTime() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
