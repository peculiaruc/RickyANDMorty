package com.peculiaruc.rickyandmortyapp.api

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.w3c.dom.CharacterData
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.net.URI.create

class RetrofitService {

    private val BASE_URL = "https://rickandmortyapi.com/api/character/"

    interface RetrofitService {

        @GET("api/character/")
        suspend fun fetchCharatername(): CharacterData
    }

    //add retrofit library
    val moshi = Moshi.Builder().build()


    val retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL).build()

    //create a signton for easily accessing the api service
    object Api {
//        val retrofitService: RetrofitService by lazy {
//            retrofit.create(RetrofitService::class.java)
//        }
    }
}