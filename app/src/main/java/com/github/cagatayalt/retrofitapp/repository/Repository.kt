package com.github.cagatayalt.retrofitapp.repository

import com.github.cagatayalt.retrofitapp.api.RetrofitInstance
import com.github.cagatayalt.retrofitapp.model.CryptoItem
import com.github.cagatayalt.retrofitapp.model.Post

class Repository {

    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getCryptoData() : ArrayList<CryptoItem> {
        return RetrofitInstance.cryptoApi.getCryptoData()
    }
}