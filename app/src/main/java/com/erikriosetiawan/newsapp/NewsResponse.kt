package com.erikriosetiawan.newsapp

import com.erikriosetiawan.newsapp.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)