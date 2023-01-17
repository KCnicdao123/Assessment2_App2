package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage_Anxious : AppCompatActivity() {

    val anxPopSongs = arrayOf<String>("Song1","Song2","Song3")
    val anxPopSongDes = arrayOf<String>(
        "Song1 description",
        "Song2 description",
        "Song3 description",)

    val anxPopSongThumb = arrayOf<Int>(
        R.drawable.anxious_pop_square__background,R.drawable.anxious_pop_square__background,R.drawable.anxious_pop_square__background
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val actionBar = supportActionBar
        actionBar!!.title = "Home Page"


        val listView = findViewById(R.id.songList) as ListView
        val myListAdapter = MyListAdapter(this,anxPopSongs,anxPopSongDes,anxPopSongThumb)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->


            Toast.makeText(this, "Anxious Song Selected", Toast.LENGTH_LONG).show()
        }

        searchIcon.setOnClickListener {
            val intent = Intent(this, SearchPage::class.java)
            startActivity(intent)
        }

        musicLibIcon.setOnClickListener {
            val intent = Intent(this, MusicLib::class.java)
            startActivity(intent)
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