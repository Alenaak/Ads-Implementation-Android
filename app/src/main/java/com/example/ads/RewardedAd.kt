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

import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback

class RewardedAd : AppCompatActivity() {

    private var rewardedAd: RewardedAd? = null
    private lateinit var showRewardedAdButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rewarded_ad_layout)

        showRewardedAdButton = findViewById(R.id.showRewardedAdButton)

        // Load the Rewarded Ad
        loadRewardedAd()

        // Show the Rewarded Ad when the button is clicked
        showRewardedAdButton.setOnClickListener {
            if (rewardedAd != null) {
                rewardedAd?.show(this, OnUserEarnedRewardListener { rewardItem ->
                    val rewardAmount = rewardItem.amount
                    val rewardType = rewardItem.type
                    Toast.makeText(this, "Reward Earned: $rewardAmount $rewardType", Toast.LENGTH_SHORT).show()
                    Log.d("AdMob", "User earned the reward: $rewardAmount $rewardType")
                })
            } else {
                Toast.makeText(this, "Rewarded ad is not ready yet", Toast.LENGTH_SHORT).show()
                Log.d("AdMob", "The rewarded ad wasn't ready yet.")
            }
        }
    }

    private fun loadRewardedAd() {
        val adRequest = AdRequest.Builder().build()

        RewardedAd.load(
            this,
            "ca-app-pub-3940256099942544/5224354917", // Test Ad Unit ID,add your own
            adRequest,
            object : RewardedAdLoadCallback() {
                override fun onAdLoaded(ad: RewardedAd) {
                    rewardedAd = ad
                    Log.d("AdMob", "Rewarded ad loaded.")
                }

                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.e("AdMob", "Failed to load rewarded ad: ${adError.message}")
                    rewardedAd = null
                }
            }
        )
    }
}
