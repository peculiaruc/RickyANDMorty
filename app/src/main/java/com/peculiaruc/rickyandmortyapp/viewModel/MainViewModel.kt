package com.peculiaruc.rickyandmortyapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.request.Disposable
import com.peculiaruc.rickyandmortyapp.api.Repository
import com.peculiaruc.rickyandmortyapp.api.RetrofitService
import com.peculiaruc.rickyandmortyapp.model.Data
import com.peculiaruc.rickyandmortyapp.model.Result
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel (private val repository: Repository) : ViewModel() {

//    private val characters: MutableLiveData<Data> by lazy {
//        MutableLiveData<Data>().also {
//            fetchCharact()
//        }
//
//    }
//
//    fun getCharacters(): LiveData<Data> {
//        return characters
//    }

    private val TAG = MainViewModel::class.java.simpleName

    private val _charLiveData = MutableLiveData<List<Result>>()

    val chaLiveData: LiveData<List<Result>>

        get() = _charLiveData

    init {
        fetchCharact()
    }

    private fun fetchCharact() {


        viewModelScope.launch {
            try {
                _charLiveData.value = repository.fetchCharact().result
                Log.d(TAG, "${_charLiveData.value}")
            } catch (e: Exception) {
                Log.d(TAG, e.toString())
            }
        }
 }
}