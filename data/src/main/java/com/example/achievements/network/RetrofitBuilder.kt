package com.example.achievements.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder
{
    val url = "https://786b905e-735c-4be6-adfb-949d5dadee32.mock.pstmn.io/"
    fun getInstance():Retrofit
    {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}