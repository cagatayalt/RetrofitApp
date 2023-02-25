package com.github.cagatayalt.retrofitapp.api

import com.github.cagatayalt.retrofitapp.model.CryptoItem
import com.github.cagatayalt.retrofitapp.model.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Post // This function is suspend as we will use coroutines.

    @GET("api/v3/coins/markets?vs_currency=usd&order=market_cap_desc")
    suspend fun getCryptoData() : ArrayList<CryptoItem>

}