package com.example.mvp.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("api/live")
    Call<String> convertVNDtoUSD(@Query("access_key") String access_key,
                                                 @Query("currencies") String currencies,
                                                 @Query("source") String source,
                                                 @Query("format") int format);
}
