package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener { rollDice()
        }
    }
    fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.hoan)
        resultText.text = randomInt.toString()

    }
}