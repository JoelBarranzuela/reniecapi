package com.everis.reniec.app.entity;

import lombok.Data;

@Data
public class PersonResponse {
  private Integer id;
  private String documentNumber;
  private Boolean fingerprint;
  private Boolean blacklist;

}
