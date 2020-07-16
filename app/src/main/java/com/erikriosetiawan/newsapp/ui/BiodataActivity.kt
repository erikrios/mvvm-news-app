package com.erikriosetiawan.newsapp.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.erikriosetiawan.newsapp.R

class BiodataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)
    }

    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    fun openGithub(view: View) {
        openUrl(getString(R.string.github_url))
    }

    fun openLinkedIn(view: View) {
        openUrl(getString(R.string.linkedin_url))
    }

    fun openFacebook(view: View) {
        openUrl(getString(R.string.facebook_url))
    }

    fun openInstagram(view: View) {
        openUrl(getString(R.string.instagram_url))
    }
}