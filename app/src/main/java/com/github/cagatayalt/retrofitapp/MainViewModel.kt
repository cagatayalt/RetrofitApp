package com.github.cagatayalt.retrofitapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.cagatayalt.retrofitapp.model.CryptoItem
import com.github.cagatayalt.retrofitapp.model.Post
import com.github.cagatayalt.retrofitapp.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Post> = MutableLiveData()
    val cryptoResponse : MutableLiveData<ArrayList<CryptoItem>> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value  = response // mutable live data object ??
        }
    }

    fun getCryptoData() {
        viewModelScope.launch {
            val response = repository.getCryptoData()
            cryptoResponse.value = response
        }
    }

}