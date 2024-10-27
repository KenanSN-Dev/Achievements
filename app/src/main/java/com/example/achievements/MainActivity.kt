package com.example.achievements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
        initObserver()

    }

    private fun initObserver() {
        mainViewModel.achievementsSuccessfulResponse.observe(this){response ->
            Toast.makeText(this,"Response : ${response}", Toast.LENGTH_LONG).show()
            }
        mainViewModel.achievementsErrorResponse.observe(this){error ->
            Toast.makeText(this,"Error : ${error}", Toast.LENGTH_LONG).show()
        }

    }

    private fun initViewModel() {
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }
}