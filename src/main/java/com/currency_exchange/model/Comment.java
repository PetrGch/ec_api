package com.currency_exchange.model;

import com.currency_exchange.model.audit.DateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created by petr on 14.06.18.
 */

@Entity
@Table(name = "comments")
public class Comment extends DateAudit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Size(max = 40)
  private String name;

  @Size(max = 100)
  @NotBlank
  private String title;

  @Size(max = 500)
  @NotBlank
  private String text;

  private boolean isLiked;

  private boolean isDislike;

  @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE, CascadeType.PERSIST})
  @JoinColumn(name = "exchange_company_id")
  private ExchangeCompany exchangeCompany;

  public Comment() {}

  public Comment(
      @Size(max = 40) String name,
      @Size(max = 100) String title,
      @Size(max = 500) String text,
      boolean isLiked,
      boolean isDislike
  ) {
    this.name = name;
    this.title = title;
    this.text = text;
    this.isLiked = isLiked;
    this.isDislike = isDislike;
  }

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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ExchangeCompany getExchangeCompany() {
    return exchangeCompany;
  }

  public void setExchangeCompany(ExchangeCompany exchangeCompany) {
    this.exchangeCompany = exchangeCompany;
  }

  public boolean isLiked() {
    return isLiked;
  }

  public void setLiked(boolean liked) {
    isLiked = liked;
  }

  public boolean isDislike() {
    return isDislike;
  }

  public void setDislike(boolean dislike) {
    isDislike = dislike;
  }

  @Override
  public String toString() {
    return "Comment{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", title='" + title + '\'' +
        ", text='" + text + '\'' +
        ", exchangeCompany=" + exchangeCompany +
        ", isLiked=" + isLiked +
        ", isDislike=" + isDislike +
        '}';
  }
}
