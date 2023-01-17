package com.example.assessment2_app2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_genre_page.*

class GenrePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genre_page)

        //value for the list of moods
        val genres = resources.getStringArray(R.array.Genre)
        //value for the dropdown spinner
        val spinner = findViewById<Spinner>(R.id.genreDrop)

        //if statement for spinner inputs
        if(spinner != null){
            val adapter = ArrayAdapter(this,
                R.layout.spinner_layout, genres) //customizes the layout of the chosen item
            spinner.adapter = adapter

            adapter.setDropDownViewResource(R.layout.spinner_dropdown_layout) //customizes the list in the spinner

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

                    Toast.makeText(this@GenrePage,
                        getString(R.string.selectItem) + " " +
                                "" + genres[position], Toast.LENGTH_SHORT).show()}



                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
        }

        //Next button to Genre Page
        nextBtn3.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }
}
