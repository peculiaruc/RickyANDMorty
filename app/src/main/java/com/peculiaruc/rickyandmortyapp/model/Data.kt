package com.peculiaruc.rickyandmortyapp.model

import com.squareup.moshi.Json

data class Data(


    @Json(name = "result")
    val results: List<Result>
)

