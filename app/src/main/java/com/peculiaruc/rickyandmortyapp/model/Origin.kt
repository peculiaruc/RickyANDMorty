package com.peculiaruc.rickyandmortyapp.model

import com.squareup.moshi.Json


data class Origin(
    @Json(name = "name")
    val name:String,
    @Json(name = "url")
    val url:String
)
