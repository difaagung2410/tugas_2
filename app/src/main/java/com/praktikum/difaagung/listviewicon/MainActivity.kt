package com.praktikum.difaagung.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import example.javatpoint.com.kotlincustomlistview.MyListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val language = arrayOf<String>("Kotlin","Ruby","Rails","Python","Java Script","Php")
    val description = arrayOf<String>(
        "Kotlin is a open-source programming language, used to develop Android apps and much more.",
        "Ruby is an open-source and fully object-oriented programming language.",
        "Ruby on Rails is a server-side web application development framework written in Ruby language.",
        "Python is interpreted scripting  and object-oriented programming language.",
        "JavaScript is an object-based scripting language.",
        "PHP is an interpreted language, i.e., there is no need for compilation."
    )

    val imageId = arrayOf<Int>(
        R.drawable.kotlin,R.drawable.ruby,R.drawable.rails,
        R.drawable.python,R.drawable.java,R.drawable.php
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(this,language,description,imageId)
        list_view.adapter = myListAdapter

        list_view.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }
    }
}
