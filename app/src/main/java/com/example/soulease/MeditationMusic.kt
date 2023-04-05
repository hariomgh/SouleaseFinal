package com.example.soulease

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageView
import android.widget.SeekBar
import androidx.cardview.widget.CardView

class MeditationMusic : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation_music)

        val btnAmbient = findViewById<CardView>(R.id.ambientBtn)

        btnAmbient.setOnClickListener {
            intent = Intent(applicationContext, Ambient::class.java)
            startActivity(intent)
        }

        val btnShivay = findViewById<CardView>(R.id.shivayBtn)

        btnShivay.setOnClickListener {
            intent = Intent(applicationContext, Shivay::class.java)
            startActivity(intent)
        }

        val btnKrishna = findViewById<CardView>(R.id.rkBtn)

        btnKrishna.setOnClickListener {
            intent = Intent(applicationContext, HareKrishna::class.java)
            startActivity(intent)
        }

        val btnWaterfall = findViewById<CardView>(R.id.waterfallBtn)

        btnWaterfall.setOnClickListener {
            intent = Intent(applicationContext, WaterFall::class.java)
            startActivity(intent)
        }

        val btnHimalyas = findViewById<CardView>(R.id.himalyasBtn)

        btnHimalyas.setOnClickListener {
            intent = Intent(applicationContext, Himalyas::class.java)
            startActivity(intent)
        }

        val btnGarden = findViewById<CardView>(R.id.gardenBtn)

        btnGarden.setOnClickListener {
            intent = Intent(applicationContext, Garden::class.java)
            startActivity(intent)
        }

        val btnBirds = findViewById<CardView>(R.id.birdBtn)

        btnBirds.setOnClickListener {
            intent = Intent(applicationContext, Birds::class.java)
            startActivity(intent)
        }

        val btnGuidedMedi = findViewById<CardView>(R.id.guidedMediBtn)

        btnGuidedMedi.setOnClickListener {
            intent = Intent(applicationContext, GuidedMeditaion::class.java)
            startActivity(intent)
        }
    }
}