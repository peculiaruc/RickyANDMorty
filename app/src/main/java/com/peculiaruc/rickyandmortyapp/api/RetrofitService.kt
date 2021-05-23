package com.peculiaruc.rickyandmortyapp.api

import com.peculiaruc.rickyandmortyapp.model.CharaterResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


   private val BASE_URL = "https://rickandmortyapi.com/"

    interface RetrofitService {
        @GET("api/character")
        suspend fun fetchCharacters(result: String): CharaterResponse
    }

    //add retrofit library
    val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()


    val retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL).build()

    //create a signton for easily accessing the api service
    object Api {

        val apiService: RetrofitService by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()
                .create(RetrofitService::class.java)
        }

    }


