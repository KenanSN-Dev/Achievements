package com.example.achievements

import androidx.recyclerview.widget.RecyclerView
import com.example.achievements.databinding.RecordsItemBinding
import com.example.achievements.model.RecordModel

class RecordViewHolder(private val binding : RecordsItemBinding):RecyclerView.ViewHolder(binding.root)
{
    fun bind (recordModel: RecordModel?) {
        binding.model = recordModel
    }
}