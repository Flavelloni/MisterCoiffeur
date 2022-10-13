package com.example.misterstrm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // link elements on the app to variables
        val rollButton = findViewById<Button>(R.id.rollButton)

        val row1 = findViewById<TextView>(R.id.row1)
        val row2 = findViewById<TextView>(R.id.row2)
        val row3 = findViewById<TextView>(R.id.row3)
        val row4 = findViewById<TextView>(R.id.row4)
        val row5 = findViewById<TextView>(R.id.row5)
        val row6 = findViewById<TextView>(R.id.row6)
        val row7 = findViewById<TextView>(R.id.row7)
        val row8 = findViewById<TextView>(R.id.row8)
        val row9 = findViewById<TextView>(R.id.row9)
        val row10 = findViewById<TextView>(R.id.row10)

        // All Jass disciplines for Coiffeur
        var disciplines = listOf("Eichle", "Rose", "Schelle", "Schlitte", "Uneufe", "Obenabe", "6 - 6", "4 - 4 - 4", "Mizzeria", "Salmon")

        // define what happens when button is clicked
        rollButton.setOnClickListener {

            disciplines = disciplines.shuffled()

            row1.text = disciplines.elementAt(0).toString()
            row2.text = disciplines.elementAt(1).toString()
            row3.text = disciplines.elementAt(2).toString()
            row4.text = disciplines.elementAt(3).toString()
            row5.text = disciplines.elementAt(4).toString()
            row6.text = disciplines.elementAt(5).toString()
            row7.text = disciplines.elementAt(6).toString()
            row8.text = disciplines.elementAt(7).toString()
            row9.text = disciplines.elementAt(8).toString()
            row10.text = disciplines.elementAt(9).toString()
        }
    }
}