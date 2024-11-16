package com.example.achievements

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.achievements.model.AchievementsResponseModel
import com.example.achievements.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {


    private val _achievementsSuccessfulResponse: MutableLiveData<List<AchievementsResponseModel?>?> =
        MutableLiveData()
    val achievementsSuccessfulResponse: LiveData<List<AchievementsResponseModel?>?> =
        _achievementsSuccessfulResponse

    private val _achievementsErrorResponse: MutableLiveData<Exception> = MutableLiveData()
    val achievementsErrorResponse: LiveData<Exception> = _achievementsErrorResponse

    private val _achievementsLoadingBar: MutableLiveData<Boolean> = MutableLiveData()
    val achievementsLoadingBar: LiveData<Boolean> = _achievementsLoadingBar

    init {
        getAchievements()
    }

    private fun getAchievements() {
        viewModelScope.launch {
            _achievementsLoadingBar.postValue(true)
            try {
                val response = repository.getAchievements()
                _achievementsSuccessfulResponse.postValue(response)
            } catch (e: Exception) {
                _achievementsErrorResponse.postValue(e)
            }
            _achievementsLoadingBar.postValue(false)
        }
    }
}