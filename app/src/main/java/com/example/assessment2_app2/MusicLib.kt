package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_music_lib.*
import kotlinx.android.synthetic.main.activity_music_lib.searchIcon

class MusicLib : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_lib)

        val actionBar = supportActionBar
        actionBar!!.title = "You Library"


        playlist1.setOnClickListener {
            Toast.makeText(this, "Playlist Selected", Toast.LENGTH_LONG).show()
        }

        playlist2.setOnClickListener {
            Toast.makeText(this, "Playlist Selected", Toast.LENGTH_LONG).show()
        }

        playlist3.setOnClickListener {
            Toast.makeText(this, "Playlist Selected", Toast.LENGTH_LONG).show()
        }

        searchIcon.setOnClickListener {
            val intent = Intent(this, SearchPage::class.java)
            startActivity(intent)
        }

        val homeBtn = findViewById<ImageButton>(R.id.homeIcon)

        homeBtn.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
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