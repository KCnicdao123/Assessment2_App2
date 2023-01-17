package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_feeling_page.*

class FeelingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feeling_page)

        val actionBar = supportActionBar
        actionBar!!.title = " "

        //value for the list of moods
        val moods = resources.getStringArray(R.array.Moods)
        //value for the dropdown spinner
        val spinner = findViewById<Spinner>(R.id.feelingDrop)

        //if statement for spinner inputs
        if(spinner != null){
            val adapter = ArrayAdapter(this,
                 R.layout.spinner_layout, moods) //customizes the layout of the chosen item
            spinner.adapter = adapter

            adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout) //customizes the list in the spinner


              }


        //Next button to Genre Page
        nextBtn2.setOnClickListener {

            val index = spinner.selectedItemPosition;
            if(index == 0){
                val intent = Intent(this, HomePage::class.java)
                startActivity(intent)
                finish()
            }else if(index == 1){
                val intent = Intent(this, HomePage_Sad::class.java)
                startActivity(intent)
                finish()
            }else if(index == 2){
                val intent = Intent(this, HomePage_Anxious::class.java)
                startActivity(intent)
                finish()
            }else if(index == 3){
                val intent = Intent(this, HomePage_Excited::class.java)
                startActivity(intent)
                finish()
            }
        }

        }
    }
