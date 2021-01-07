package com.everis.reniec.app.clients;

import com.everis.reniec.app.entity.PersonResponse;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PersonsClientApi {
  
  @GET("/core/persons")
  Single<PersonResponse> getPersonInfo(@Query("documentNumber")String documentNumber);

}
