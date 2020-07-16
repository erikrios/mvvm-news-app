package com.erikriosetiawan.newsapp.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.erikriosetiawan.newsapp.R
import com.erikriosetiawan.newsapp.util.SocialMedia
import com.erikriosetiawan.newsapp.util.SocialMediaHelper

class BiodataActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            SocialMediaHelper.getId(SocialMedia.GITHUB) -> openUrl(
                SocialMediaHelper.getLink(
                    SocialMedia.GITHUB
                )
            )
            SocialMediaHelper.getId(SocialMedia.LINKED_IN) -> openUrl(
                SocialMediaHelper.getLink(
                    SocialMedia.LINKED_IN
                )
            )
            SocialMediaHelper.getId(SocialMedia.FACEBOOK) -> openUrl(
                SocialMediaHelper.getLink(
                    SocialMedia.FACEBOOK
                )
            )
            SocialMediaHelper.getId(SocialMedia.INSTAGRAM) -> openUrl(
                SocialMediaHelper.getLink(
                    SocialMedia.INSTAGRAM
                )
            )
        }
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}