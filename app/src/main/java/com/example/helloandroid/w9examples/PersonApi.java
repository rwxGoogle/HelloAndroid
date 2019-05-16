package com.example.helloandroid.w9examples;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by roxanan on 15,May,2019
 */
public interface PersonApi {

    @GET("/rwxGoogle/HelloAndroid/week8-examples/{fileName}")
    Call<List<Person>> getPersons(@Path("fileName") String jsonToFetch);
}
