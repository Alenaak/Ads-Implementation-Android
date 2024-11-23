package com.example.ads

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class BannerAd : AppCompatActivity() {
    private lateinit var adView: AdView
        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.banner_ad_layout)


            // Reference the AdView from the layout
            adView = findViewById(R.id.adView)

            // Load a banner ad
            val adRequest = AdRequest.Builder().build()
            adView.loadAd(adRequest)
        }

        override fun onDestroy() {
            super.onDestroy()
            // Destroy the AdView when the activity is destroyed
            adView.destroy()
        }

        override fun onPause() {
            super.onPause()
            // Pause the AdView when the activity is paused
            adView.pause()
        }

        override fun onResume() {
            super.onResume()
            // Resume the AdView when the activity is resumed
            adView.resume()
        }
    }