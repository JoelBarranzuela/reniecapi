package com.everis.reniec.app.clients;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AccountsClientApi {

  @GET("/core/accounts")
  Single<AccountResponse> getAccounts(@Query("cardNumber")String documentNumber);
}
