package com.everis.reniec.app.clients;

import io.reactivex.Single;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface FingerPrintsClientApi {
  @POST("/core/fingerprints/validate")
  Single<FingerprintResponse> validateFingerprints(@Body ATMDepositRequest atmDepositRequest);

}
