package com.peculiaruc.rickyandmortyapp.api

import com.peculiaruc.rickyandmortyapp.model.CharaterResponse

class Repository(private val retrofitService: RetrofitService) {

    suspend fun fetchCharact(result:String) = retrofitService.fetchCharacters(result)
//
//    fun fetchCharact(): CharaterResponse {
//
//    }

}