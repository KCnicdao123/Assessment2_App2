package com.example.assessment2_app2


import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(private val context: Activity, private val title: Array<String>, private val description: Array<String>, private val thumbnail: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.custom_list, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_list, null, true)

        val titleText = rowView.findViewById(R.id.songTitle) as TextView
        val imageView = rowView.findViewById(R.id.thumbnailSquare) as ImageView
        val subtitleText = rowView.findViewById(R.id.songDes) as TextView

        titleText.text = title[position]
        imageView.setImageResource(thumbnail[position])
        subtitleText.text = description[position]

        return rowView
    }
}