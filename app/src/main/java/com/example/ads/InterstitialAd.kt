package com.example.ads

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class InterstitialAd : AppCompatActivity() {

    private var interstitialAd: InterstitialAd? = null
    private lateinit var showAdButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interstitial_ad_layout)

        showAdButton = findViewById(R.id.showAdButton)

        // Initialize the AdMob SDK
        loadInterstitialAd()

        // Show the ad when the button is clicked
        showAdButton.setOnClickListener {
            if (interstitialAd != null) {
                interstitialAd?.show(this)
            } else {
                Log.d("AdMob", "The interstitial ad wasn't ready yet.")
            }
        }
    }

    private fun loadInterstitialAd() {
        val adRequest = AdRequest.Builder().build()

        InterstitialAd.load(
            this,
            "ca-app-pub-3940256099942544/1033173712", // Test Ad Unit ID
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(ad: InterstitialAd) {
                    interstitialAd = ad
                    Log.d("AdMob", "Interstitial ad loaded.")
                }

                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.e("AdMob", "Failed to load interstitial ad: ${adError.message}")
                    interstitialAd = null
                }
            }
        )
    }
}
