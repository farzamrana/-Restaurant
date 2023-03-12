package com.example.restaurant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val `butt-menu2`: Button = findViewById(R.id.button3)
        `butt-menu2`.setOnClickListener {
            val intents = Intent(this, MainActivity::class.java)
            startActivity(intents)
        }
    }
}