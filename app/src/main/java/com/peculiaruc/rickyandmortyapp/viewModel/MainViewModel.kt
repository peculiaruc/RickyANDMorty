package com.peculiaruc.rickyandmortyapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import coil.request.Disposable
import com.peculiaruc.rickyandmortyapp.api.Repository
import com.peculiaruc.rickyandmortyapp.api.RetrofitService
import com.peculiaruc.rickyandmortyapp.model.Data
import retrofit2.Response

class MainViewModel (private val repository: Repository) : ViewModel() {

    private val characters: MutableLiveData<Data> by lazy {
        MutableLiveData<Data>().also {
            fetchCharact()
        }

    }

    fun getCharacters(): LiveData<Data> {
        return characters
    }

    private val TAG = MainViewModel::class.java.simpleName

    private val _charLiveData = MutableLiveData<List<Result>>()

    val chaLiveData: LiveData<List<Result>>

        get() = _charLiveData

//    init {
//        fetchCharact()
//    }

    private fun fetchCharact() {


//        viewModelScope.launch {
//            try {
//                _characterLiveData.value = repository.fetchCharacters().results
//                Log.d(TAG, "${_characterLiveData.value}")
//            } catch (e: Exception) {
//                Log.d(TAG, e.stackTraceToString())
//            }
//        }
 }
}