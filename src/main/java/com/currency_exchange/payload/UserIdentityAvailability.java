package com.currency_exchange.payload;

/**
 * Created by petr on 03.06.18.
 */
public class UserIdentityAvailability {

  private Boolean available;

  public UserIdentityAvailability(Boolean available) {
    this.available = available;
  }

  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

}
