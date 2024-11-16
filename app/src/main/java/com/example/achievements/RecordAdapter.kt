package com.example.achievements

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.achievements.databinding.RecordsItemBinding
import com.example.achievements.model.RecordModel

class RecordAdapter(private val list : List<RecordModel?>?):RecyclerView.Adapter<RecordViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val binding = RecordsItemBinding.inflate(inflater, parent , false)
        return RecordViewHolder(binding)
    }

    override fun getItemCount(): Int {
        list?.let {return list.size}
        return 0
    }

    override fun onBindViewHolder(holder: RecordViewHolder, position: Int) {
        list?.let {  holder.bind(list[position]) }

    }
}