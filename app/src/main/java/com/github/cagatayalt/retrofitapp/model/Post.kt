package com.github.cagatayalt.retrofitapp.model

import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("userId")
    val myUserId: Int,  // The json data has userId but I wanted to use myUserId, that's why I use @SeralizedName annotation
    val id:Int,
    val title:String,
    val body:String
)



/*
Try the following:
@SerializedName("userId")
    val myUserId: Int,


 */