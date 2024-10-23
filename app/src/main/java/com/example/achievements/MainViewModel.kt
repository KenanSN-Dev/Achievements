package com.example.achievements

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.achievements.model.AchievementsResponseModel
import com.example.achievements.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel:ViewModel()
{
    val repository = Repository()

    val achievementsSuccessfulResponse:MutableLiveData<List<AchievementsResponseModel?>?> = MutableLiveData()
    val achievementsErrorResponse:MutableLiveData<Exception> = MutableLiveData()
   init {
       getAchievements()
   }

    private fun getAchievements() {
        viewModelScope.launch {
           try {
               val response = repository.getAchievements()
               achievementsSuccessfulResponse.postValue(response)
           }
           catch (e:Exception)
           {
               achievementsErrorResponse.postValue(e)
           }
        }
    }
}