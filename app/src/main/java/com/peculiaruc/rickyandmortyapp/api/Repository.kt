package com.peculiaruc.rickyandmortyapp.api

class Repository(private val retrofitService: RetrofitService) {

    suspend fun getCharacters() = retrofitService.fetchCharacters()

}