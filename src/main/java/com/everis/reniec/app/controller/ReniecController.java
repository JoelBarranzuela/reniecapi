package com.everis.reniec.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.reniec.app.entity.PersonResponse;
import com.everis.reniec.app.entity.ReniecResponse;

import io.reactivex.Single;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/external/reniec")
@Api("/external/reniec")
public class ReniecController {

  @ApiOperation(value = "Validacion por DNI", response = ReniecResponse.class)
  @ApiResponse(code = 200, message = "Api ok", response = ReniecResponse.class)
  @PostMapping("/validate")
  public Single<ReniecResponse> validate(@RequestBody PersonResponse request) {
    return Single.just(new ReniecResponse("Reniec", true));
  }

}
