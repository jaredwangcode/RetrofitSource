package com.example.paul.retrofitsource;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by MakerYan on 16/3/4 14:31.
 * Email: yanl@59store.com
 */
public class BaseHttp {

    protected static Retrofit retrofit = null;

    private BaseHttp() {
    }

    private static Retrofit getRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder().build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.API)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        
        return retrofit;
    }

    public static ApiService getAPIService() {
        ApiService service = getRetrofit().create(ApiService.class);
        return service;
    }
}
