package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        //sets value for instructional modal
        val insPopup = ModalPopUp()
        //shows the instructional pop-up modal at the start of the app
        insPopup.show(supportFragmentManager, "InstructionModal")

        val actionBar = supportActionBar
        actionBar!!.title = "Log-in"


        //value for user's username input
        val userName = findViewById<EditText>(R.id.enterUsername)

        //value for log-in button
        val LogIn = findViewById<Button>(R.id.loginBtn)


        //Listener for log-in button
        LogIn.setOnClickListener {
            val Nameuser = userName.text.toString() //converts user's input to text view string

            val intent = Intent(applicationContext, WelcomePage::class.java) //opens next activity and gets data from current activity
            intent.putExtra("displayName", Nameuser) //sends user input to next activity
            startActivity(intent)
        }

    }
}

