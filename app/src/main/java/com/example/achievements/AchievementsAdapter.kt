package com.example.achievements

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.achievements.databinding.AchievementsItemBinding
import com.example.achievements.model.AchievementsResponseModel

class AchievementsAdapter(private val list: List<AchievementsResponseModel?>?):RecyclerView.Adapter<AchievementsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AchievementsItemBinding.inflate(inflater, parent, false)
        return AchievementsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        list?.let { return list.size }
        return 0
    }

    override fun onBindViewHolder(holder: AchievementsViewHolder, position: Int) {
       list?.let{holder.bind(list[position]) }
    }
}