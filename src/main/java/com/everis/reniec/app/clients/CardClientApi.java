package com.everis.reniec.app.clients;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CardClientApi {
  @GET("/core/cards")
  Single<CardsResponse> getCards(@Query("documentNumber") String documentNumber);
}
