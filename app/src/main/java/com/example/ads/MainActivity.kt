package com.example.ads

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Find buttons
        val btnBannerAd = findViewById<Button>(R.id.btnBannerAd)
        val btnInterstitialAd = findViewById<Button>(R.id.btnInterstitialAd)
        val btnRewardedAd = findViewById<Button>(R.id.btnRewardedAd)
        val btnRewardedInterstitialAd = findViewById<Button>(R.id.btnRewardedInterstitialAd)
        val btnnativead=findViewById<Button>(R.id.btnNativeAd)

        // Set up navigation
        btnBannerAd.setOnClickListener {
            startActivity(Intent(this, BannerAd::class.java))
        }

        btnInterstitialAd.setOnClickListener {
            startActivity(Intent(this, InterstitialAd::class.java))
        }

        btnRewardedAd.setOnClickListener {
            startActivity(Intent(this, RewardedAd::class.java))
        }

        btnnativead.setOnClickListener {
            startActivity(Intent(this, NativeAd::class.java))
        }

        btnRewardedInterstitialAd.setOnClickListener {
            startActivity(Intent(this, RewardedInterstitialAd::class.java))
        }
    }
}

