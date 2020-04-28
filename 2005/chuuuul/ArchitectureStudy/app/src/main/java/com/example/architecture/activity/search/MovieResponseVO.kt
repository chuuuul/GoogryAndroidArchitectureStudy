package com.example.architecture.activity.search

import com.google.gson.annotations.SerializedName


data class MovieResponseVO(
    val display: Int,
    @SerializedName("items")
    val movies: List<MovieVO>,
    val lastBuildDate: String,
    val start: Int,
    val total: Int
)