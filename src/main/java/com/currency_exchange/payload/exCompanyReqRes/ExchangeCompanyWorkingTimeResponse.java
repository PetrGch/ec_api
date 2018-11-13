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

  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("updated_at")
  private String updatedAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
