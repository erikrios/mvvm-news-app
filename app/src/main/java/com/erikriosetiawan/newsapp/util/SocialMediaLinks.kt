package com.erikriosetiawan.newsapp.util

import com.erikriosetiawan.newsapp.R

object SocialMediaLinks {

    fun getLinks(socialMedia: SocialMedia): Int {
        return when (socialMedia) {
            SocialMedia.GITHUB -> R.id.tvGithub
            SocialMedia.LINKED_IN -> R.id.tvLinkedIn
            SocialMedia.FACEBOOK -> R.id.tvFacebook
            SocialMedia.INSTAGRAM -> R.id.tvInstagram
        }
    }
}