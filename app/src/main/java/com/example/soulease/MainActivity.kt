package com.example.soulease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        val btnIntent = findViewById<ImageView>(R.id.nextButton)

        btnIntent.setOnClickListener {
            intent = Intent(applicationContext, Home::class.java)
            startActivity(intent)
        }
    }
}