package com.erikriosetiawan.newsapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.erikriosetiawan.newsapp.repository.NewsRepository

@Suppress("UNCHECKED_CAST")
class NewsViewModelFactory(val newsRepository: NewsRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}