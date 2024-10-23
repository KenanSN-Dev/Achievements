package com.example.achievements.api

import com.example.achievements.model.WrappedAchievementsResponseModel
import retrofit2.http.GET

interface IProjectApi
{
    @GET("/achievements")
    suspend fun getAchievements():WrappedAchievementsResponseModel
}