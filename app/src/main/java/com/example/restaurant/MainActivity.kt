package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val `butt-menu`: Button = findViewById(R.id.button)
        `butt-menu`.setOnClickListener {
            val intents = Intent(this, menu::class.java)
            startActivity(intents)
        }
    }
}