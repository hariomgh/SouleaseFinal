package com.example.soulease

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import de.hdodenhof.circleimageview.CircleImageView

class Yoga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)

        val btnSukha = findViewById<CardView>(R.id.sukhaBtn)

        btnSukha.setOnClickListener {
            intent = Intent(applicationContext, Sukhasana::class.java)
            startActivity(intent)
        }

        val btnBalas = findViewById<CardView>(R.id.balaBtn)

        btnBalas.setOnClickListener {
            intent = Intent(applicationContext, Balasana::class.java)
            startActivity(intent)
        }

        val btnAdho = findViewById<CardView>(R.id.andhoBtn)

        btnAdho.setOnClickListener {
            intent = Intent(applicationContext, AndhoMukha::class.java)
            startActivity(intent)
        }

        val btnSalamba = findViewById<CardView>(R.id.salambaBtn)

        btnSalamba.setOnClickListener {
            intent = Intent(applicationContext, SalambaSarvangasana::class.java)
            startActivity(intent)
        }

        val btnSavasana = findViewById<CardView>(R.id.savasanaBtn)

        btnSavasana.setOnClickListener {
            intent = Intent(applicationContext, Savasana::class.java)
            startActivity(intent)
        }

        val btnAnjanasana = findViewById<CardView>(R.id.anjaneyasanaBtn)

        btnAnjanasana.setOnClickListener {
            intent = Intent(applicationContext, Anjaneyasana::class.java)
            startActivity(intent)
        }

        val btnGarudasana = findViewById<CardView>(R.id.garudasanaBtn)

        btnGarudasana.setOnClickListener {
            intent = Intent(applicationContext, Garudasana::class.java)
            startActivity(intent)
        }

        val btnNatrajasana = findViewById<CardView>(R.id.natarajasanaBtn)

        btnNatrajasana.setOnClickListener {
            intent = Intent(applicationContext, Natarajasana::class.java)
            startActivity(intent)
        }

        val btnVirbhadrasana = findViewById<CardView>(R.id.virabhadrasanaBtn)

        btnVirbhadrasana.setOnClickListener {
            intent = Intent(applicationContext, Virabhadrasana::class.java)
            startActivity(intent)
        }

        val btnAdhomukha = findViewById<CardView>(R.id.adhoMukhaVrksasanaBtn)

        btnAdhomukha.setOnClickListener {
            intent = Intent(applicationContext, Adho_Mukha_Vrksasana::class.java)
            startActivity(intent)
        }

        val btnVajrasana = findViewById<CardView>(R.id.vajrasanaBtn)

        btnVajrasana.setOnClickListener {
            intent = Intent(applicationContext, Vajrasana::class.java)
            startActivity(intent)
        }
    }
}