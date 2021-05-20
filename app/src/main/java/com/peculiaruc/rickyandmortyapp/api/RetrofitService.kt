package com.peculiaruc.rickyandmortyapp.api

//class RetrofitService {
//    interface RetrofitService {
//
//        @GET("api/character/")
//        fun fetchCharacterName(): Single<Response<CharacterData>>
//
//
//        companion object {
//            fun getRetrofitInstance(): RetrofitService {
//                val retrofit: Retrofit = Retrofit.Builder()
//                        .baseUrl("https://rickandmortyapi.com/")
//                        .addConverterFactory(GsonConverterFactory.create())
//                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                        .build()
//                return retrofit.create(RetrofitService::class.java)
//            }
//        }
//    }
//}