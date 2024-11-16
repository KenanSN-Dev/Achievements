package com.example.achievements.repository

import com.example.achievements.api.IProjectApi
import com.example.achievements.model.AchievementsResponseModel
import javax.inject.Inject

class Repository @Inject constructor(private val projectApi: IProjectApi)
{
    suspend fun getAchievements():List<AchievementsResponseModel?>?{
        return projectApi.getAchievements().data
    }
}