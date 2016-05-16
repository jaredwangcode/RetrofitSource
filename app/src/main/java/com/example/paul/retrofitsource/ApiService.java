package com.example.paul.retrofitsource;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by paul on 16/5/16.
 */
public interface ApiService {

    @GET("api/lore/list")
    Observable<TgouResponse> getResponse(@QueryMap Map<String,String> param);
}
