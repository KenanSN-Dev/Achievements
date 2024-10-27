package com.example.achievements.core

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import java.net.URL
@BindingAdapter(value = ["app:imageUrl"])
fun ImageView.imageView(url:String?)
{
    Glide.with(this.context)
        .load(url)
        .into(this)
}