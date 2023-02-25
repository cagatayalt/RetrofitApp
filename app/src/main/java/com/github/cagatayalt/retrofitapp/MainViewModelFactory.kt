package com.github.cagatayalt.retrofitapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.cagatayalt.retrofitapp.repository.Repository

class MainViewModelFactory(
    private val repository: Repository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }
}