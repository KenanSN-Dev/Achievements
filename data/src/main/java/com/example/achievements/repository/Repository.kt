package com.example.achievements.repository

import com.example.achievements.api.IProjectApi
import com.example.achievements.model.AchievementsResponseModel
import com.example.achievements.network.RetrofitBuilder

class Repository
{
    val retrofit = RetrofitBuilder.getInstance().create(IProjectApi::class.java)
    suspend fun getAchievements():List<AchievementsResponseModel?>?
    {
        return retrofit.getAchievements().data
    }
}