package com.erikriosetiawan.newsapp.util

import android.content.res.Resources
import com.erikriosetiawan.newsapp.R

object SocialMediaHelper {

    fun getId(socialMedia: SocialMedia): Int {
        return when (socialMedia) {
            SocialMedia.GITHUB -> R.id.tvGithub
            SocialMedia.LINKED_IN -> R.id.tvLinkedIn
            SocialMedia.FACEBOOK -> R.id.tvFacebook
            SocialMedia.INSTAGRAM -> R.id.tvInstagram
        }
    }

    fun getLink(socialMedia: SocialMedia): String {
        return when (socialMedia) {
            SocialMedia.GITHUB -> Resources.getSystem().getString(R.string.github_url)
            SocialMedia.LINKED_IN -> Resources.getSystem().getString(R.string.linkedin_url)
            SocialMedia.FACEBOOK -> Resources.getSystem().getString(R.string.facebook_url)
            SocialMedia.INSTAGRAM -> Resources.getSystem().getString(R.string.instagram_url)
        }
    }
}