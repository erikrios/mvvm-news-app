package com.erikriosetiawan.newsapp.models

import com.erikriosetiawan.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)