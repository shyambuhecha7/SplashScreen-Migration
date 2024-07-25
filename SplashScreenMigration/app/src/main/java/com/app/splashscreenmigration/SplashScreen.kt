package com.app.splashscreenmigration

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.splashscreenmigration.databinding.ActivitySplashScreenBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Thread {
            Thread.sleep(2000) // Show splash screen for 2 seconds
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }.start()
    }
}
