package com.peculiaruc.rickyandmortyapp.api

class Repository(private val retrofitService: RetrofitService) {

    suspend fun fetchCharact(result:String) = retrofitService.fetchCharacters(result)

}