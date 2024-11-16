package com.example.achievements.di

import com.example.achievements.api.IProjectApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    val url = "https://786b905e-735c-4be6-adfb-949d5dadee32.mock.pstmn.io/"

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideProjectApi(retrofit: Retrofit): IProjectApi {
        return retrofit.create(IProjectApi::class.java)
    }

}