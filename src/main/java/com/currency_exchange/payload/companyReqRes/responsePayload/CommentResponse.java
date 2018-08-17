package com.currency_exchange.payload.companyReqRes.responsePayload;

import com.currency_exchange.model.Comment;

import java.time.Instant;

/**
 * Created by petr on 17.06.18.
 */

public class CommentResponse {

  private Long id;
  private String name;
  private String title;
  private String text;
  private boolean isLiked;
  private boolean isDislike;
  private Instant createdAt;
  private Instant updatedAt;

  public CommentResponse(Comment comment) {
    this.id = comment.getId();
    this.name = comment.getName();
    this.title = comment.getTitle();
    this.text = comment.getText();
    this.isLiked = comment.isLiked();
    this.isDislike = comment.isDislike();
    this.createdAt = comment.getCreatedAt();
    this.updatedAt = comment.getUpdatedAt();
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
}
