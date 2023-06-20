package com.example.retrofitnewsapp.models

import com.example.retrofitnewsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)