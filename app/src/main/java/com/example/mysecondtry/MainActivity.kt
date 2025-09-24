package com.example.mysecondtry

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val buttonColor = findViewById<Button>(R.id.buttonColor)
        val buttonBackground = findViewById<Button>(R.id.buttonBackground)
        val mainLayout = findViewById<ConstraintLayout>(R.id.main)

        // Hex colors
        val myGreen = 0xFF4CAF50.toInt()      // green for text and button
        val bgColor = 0xFFFFC0CB.toInt()      // pink for background

        // First button changes the TextView text
        button.setOnClickListener {
            textView.text = getString(R.string.button_clicked)
        }

        // Second button changes TextView text color and button background
        buttonColor.setOnClickListener {
            textView.setTextColor(myGreen)
            buttonColor.setBackgroundColor(myGreen)
        }

        // Third button changes the background color of the layout
        buttonBackground.setOnClickListener {
            mainLayout.setBackgroundColor(bgColor)
        }
    }
}