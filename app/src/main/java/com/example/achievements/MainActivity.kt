package com.example.achievements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.achievements.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {
    private val mainViewModel:MainViewModel by viewModels()

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        initObserver()

    }

    private fun initObserver() {
        mainViewModel.achievementsLoadingBar.observe(this){show ->
            binding.progressBar.isVisible = show
        }
        mainViewModel.achievementsSuccessfulResponse.observe(this){response ->
            binding.rvAchievements.adapter = AchievementsAdapter(response)
            }
        mainViewModel.achievementsErrorResponse.observe(this){error ->
            Toast.makeText(this,"Error : ${error}", Toast.LENGTH_LONG).show()
        }


    }


}