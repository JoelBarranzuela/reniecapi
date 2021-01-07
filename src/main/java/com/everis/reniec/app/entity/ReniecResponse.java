package com.everis.reniec.app.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Api("Response Reniec")
public class ReniecResponse {
  @ApiModelProperty(example = "Reniec")
  private String entityName;
  @ApiModelProperty(example = "true")
  private Boolean success;

}
