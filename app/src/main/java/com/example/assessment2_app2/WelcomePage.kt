package com.example.assessment2_app2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome_page.*

class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)

        val actionBar = supportActionBar
        actionBar!!.title = " "


        //value for user's name displayed
        val displayName = findViewById<TextView>(R.id.userNameDisplay2)
        val intent1 = intent
        //receives the data from the previous activity
        val Nameuser = intent1.getStringExtra("displayName")
        displayName.text = Nameuser

        //value for user's name displayed
        val displayName2 = findViewById<TextView>(R.id.userNameDisplay)
        val intent2 = intent
        //receives the data from the previous activity
        val Nameuser2 = intent2.getStringExtra("displayName")
        displayName2.text = Nameuser2

        nextBtn1.setOnClickListener {
            val intent = Intent(this, FeelingPage::class.java)
            startActivity(intent)
            finish()
        }


    }
}