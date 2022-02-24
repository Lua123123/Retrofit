package com.example.mvp.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    public static APIService getService(){
        return new Retrofit.Builder()
                .baseUrl("http://apilayer.net/") // API base url
                .addConverterFactory(GsonConverterFactory.create()) // Factory phụ thuộc vào format JSON trả về
                .build()
                .create(APIService.class);
    }

}
