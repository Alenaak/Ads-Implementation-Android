package com.example.ads

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.OnUserEarnedRewardListener
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback

class RewardedInterstitialAd : AppCompatActivity() {

    private var rewardedInterstitialAd: RewardedInterstitialAd? = null
    private lateinit var showRewardedInterstitialAdButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rewarded_interstitial_ad_layout)

        showRewardedInterstitialAdButton = findViewById(R.id.showRewardedInterstitialAdButton)

        // Load the Rewarded Interstitial Ad
        loadRewardedInterstitialAd()

        // Show the ad when the button is clicked
        showRewardedInterstitialAdButton.setOnClickListener {
            if (rewardedInterstitialAd != null) {
                rewardedInterstitialAd?.show(this, OnUserEarnedRewardListener { rewardItem ->
                    val rewardAmount = rewardItem.amount
                    val rewardType = rewardItem.type
                    Toast.makeText(this, "Reward Earned: $rewardAmount $rewardType", Toast.LENGTH_SHORT).show()
                    Log.d("AdMob", "User earned the reward: $rewardAmount $rewardType")
                })
            } else {
                Toast.makeText(this, "Rewarded interstitial ad is not ready yet", Toast.LENGTH_SHORT).show()
                Log.d("AdMob", "The rewarded interstitial ad wasn't ready yet.")
            }
        }
    }

    private fun loadRewardedInterstitialAd() {
        val adRequest = AdRequest.Builder().build()

        RewardedInterstitialAd.load(
            this,
            "ca-app-pub-3940256099942544/5354046379", // Test Ad Unit ID
            adRequest,
            object : RewardedInterstitialAdLoadCallback() {
                override fun onAdLoaded(ad: RewardedInterstitialAd) {
                    rewardedInterstitialAd = ad
                    Log.d("AdMob", "Rewarded Interstitial ad loaded.")
                    setupAdCallbacks()
                }

                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.e("AdMob", "Failed to load rewarded interstitial ad: ${adError.message}")
                    rewardedInterstitialAd = null
                }
            }
        )
    }

    private fun setupAdCallbacks() {
        rewardedInterstitialAd?.fullScreenContentCallback = object : com.google.android.gms.ads.FullScreenContentCallback() {
            override fun onAdDismissedFullScreenContent() {
                Log.d("AdMob", "Ad was dismissed.")
                // Reload the ad after it has been shown
                loadRewardedInterstitialAd()
            }

            override fun onAdFailedToShowFullScreenContent(adError: com.google.android.gms.ads.AdError) {
                Log.e("AdMob", "Ad failed to show: ${adError.message}")
                rewardedInterstitialAd = null
            }

            override fun onAdShowedFullScreenContent() {
                Log.d("AdMob", "Ad showed fullscreen content.")
                rewardedInterstitialAd = null // Prevent reuse of the ad
            }
        }
    }
}
