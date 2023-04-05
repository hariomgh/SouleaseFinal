package com.example.soulease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.soulease.databinding.ActivityMainBinding

class Login : AppCompatActivity() {

//    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()
        val btnIntent = findViewById<Button>(R.id.login_button)

        btnIntent.setOnClickListener {
            intent = Intent(applicationContext, Home::class.java)
            startActivity(intent)
        }


    }
}