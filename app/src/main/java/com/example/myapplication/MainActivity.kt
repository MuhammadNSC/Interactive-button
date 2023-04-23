package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ourTextView: TextView = findViewById(R.id.welcome_textView)
        ourTextView.text = ""

        val ourButton: Button = findViewById(R.id.hi_button)
        ourButton.setOnClickListener {
            ourTextView.setText("Welcome")
            val text = "Hey Whats up"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()


        }
    }
}