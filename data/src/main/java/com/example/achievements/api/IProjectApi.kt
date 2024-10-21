package com.example.achievements.api

import com.example.achievements.model.WrappedAchievementsResponseModel

interface IProjectApi
{
    fun getAchievements():WrappedAchievementsResponseModel
}