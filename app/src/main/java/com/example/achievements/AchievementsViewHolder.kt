package com.example.achievements

import androidx.recyclerview.widget.RecyclerView
import com.example.achievements.databinding.AchievementsItemBinding
import com.example.achievements.model.AchievementsResponseModel

class AchievementsViewHolder(private val binding: AchievementsItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(achievementsResponseModel: AchievementsResponseModel?) {
        binding.model = achievementsResponseModel
        binding.rvRecords.adapter = RecordAdapter(achievementsResponseModel?.records)

    }
}