package com.example.achievements.model


import com.google.gson.annotations.SerializedName

data class WrappedAchievementsResponseModel(
    @SerializedName("data")
    val `data`: List<AchievementsResponseModel?>?
)