package com.peculiaruc.rickyandmortyapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.peculiaruc.rickyandmortyapp.api.Repository

class MainViewModel (private val repository: Repository) : ViewModel() {
    private val TAG = "MainViewModel"
    private val _characterLiveData = MutableLiveData<List<Result>>()
    val characterLiveData: LiveData<List<Result>>
        get() = _characterLiveData

    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
//        viewModelScope.launch {
//            try {
//                _characterLiveData.value = repository.getCharacters().results
//                Log.d(TAG, "${_characterLiveData.value}")
//            } catch (e: Exception) {
//                Log.d(TAG, e.stackTraceToString())
//            }
//        }
 }
}