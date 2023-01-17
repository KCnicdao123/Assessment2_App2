package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backBtn = findViewById<TextView>(R.id.backBtn)

        backBtn.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            finish()
        }

        val logOut = findViewById<TextView>(R.id.logOut)

        logOut.setOnClickListener {
            val intent =Intent(this, LogIn::class.java)
            startActivity(intent)
            finish()
        }
    }
}