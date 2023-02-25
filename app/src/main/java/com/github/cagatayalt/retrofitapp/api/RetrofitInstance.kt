package com.github.cagatayalt.retrofitapp.api

import com.github.cagatayalt.retrofitapp.util.Constants.Companion.BASE_URL
import com.github.cagatayalt.retrofitapp.util.Constants.Companion.CRYPTO_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance { // We used object keyword because we want to make RetrofitInstance a singleton.

    private val retrofit by lazy { // Initialization (lazily)
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: SimpleApi by lazy {
        retrofit.create(SimpleApi::class.java)
    }

    private val cryptoRetrofit by lazy {
        Retrofit.Builder()
            .baseUrl(CRYPTO_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val cryptoApi : SimpleApi by lazy {
        cryptoRetrofit.create(SimpleApi::class.java)
    }


}