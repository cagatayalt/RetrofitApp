package com.github.cagatayalt.retrofitapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.github.cagatayalt.retrofitapp.repository.Repository

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("Response", response.myUserId.toString())
            Log.d("Response",response.id.toString())
            Log.d("Response",response.title)
            Log.d("Response",response.body)


        })

        viewModel.getCryptoData()
        viewModel.cryptoResponse.observe(
            this, Observer { response ->
                Log.d("Crypto Response", "$response[0]")
            }
        )



    }






}