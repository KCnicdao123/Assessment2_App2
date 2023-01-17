package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading_screen)

        val actionBar = supportActionBar
        actionBar!!.title = " "

        //displays Splash Screen as full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({//delays the screen for a few moments
        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
        finish()
        }, 4000)//splash screen is displayed for 4 milliseconds
    }
}