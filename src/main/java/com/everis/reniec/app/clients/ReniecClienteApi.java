package com.everis.reniec.app.clients;

import com.everis.reniec.app.entity.ATMDepositRequest;
import com.everis.reniec.app.entity.ReniecResponse;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ReniecClienteApi {
  @POST("/external/reniec/validate")
  Single<ReniecResponse> validateReniec(@Body ATMDepositRequest atmDepositRequest);

}
