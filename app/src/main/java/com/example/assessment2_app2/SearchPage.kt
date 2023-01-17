package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_search_page.*

class SearchPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_page)

        val actionBar = supportActionBar
        actionBar!!.title = "Search Page"


        val userSearch = findViewById<EditText>(R.id.search)
        val btnSearch = findViewById<ImageButton>(R.id.searchBtn)

        btnSearch.setOnClickListener {
            // Showing the user input
            val message = userSearch.text
            Toast.makeText(this, "Search for $message", Toast.LENGTH_SHORT).show()
        }


        browseBtn1.setOnClickListener{
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            finish()
        }

        browseBtn2.setOnClickListener {
            val intent = Intent(this, HomePage_Sad::class.java)
            startActivity(intent)
            finish()
        }

        browseBtn3.setOnClickListener {
            val intent = Intent(this, HomePage_Anxious::class.java)
            startActivity(intent)
            finish()
        }

        browseBtn4.setOnClickListener {
            val intent = Intent(this, HomePage_Excited::class.java)
            startActivity(intent)
            finish()
        }

        homeIcon.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
            finish()
        }

        musicLibIcon.setOnClickListener {
            val intent = Intent(this, MusicLib::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.settings -> {
                val intent = Intent(this, Settings::class.java)
                startActivity(intent)
                return true
            }

            R.id.about -> {
                Toast.makeText(this, "About Us is copied", Toast.LENGTH_SHORT).show()
            }
            R.id.log_out -> {
                val intent = Intent(this, LogIn::class.java)
                startActivity(intent)
                return true
            }
        }
        return super.onOptionsItemSelected(item)

    }
}