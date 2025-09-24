package com.example.mysecondtry

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val buttonColor = findViewById<Button>(R.id.buttonColor)

        // Use hex color (AARRGGBB)
        val myGreen = 0xFF4CAF50.toInt() // FF = fully opaque, 4CAF50 = green shade

        // First button changes the TextView text
        button.setOnClickListener {
            textView.text = getString(R.string.button_clicked)
        }

        // Second button changes text color and button background to the hex green
        buttonColor.setOnClickListener {
            textView.setTextColor(myGreen)
            buttonColor.setBackgroundColor(myGreen)
        }
    }
}