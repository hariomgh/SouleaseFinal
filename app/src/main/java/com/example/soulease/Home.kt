package com.example.soulease

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class Home : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        supportActionBar?.hide()
        val btnProfile = findViewById<CircleImageView>(R.id.profile_image)

        btnProfile.setOnClickListener {
            intent = Intent(applicationContext, Profile::class.java)
            startActivity(intent)
        }

        val btnMeditation = findViewById<CardView>(R.id.meditaionBtn)

        btnMeditation.setOnClickListener{
            intent = Intent(applicationContext, MeditationMusic::class.java)
            startActivity(intent)
        }

        val btnMeditationCard = findViewById<ImageView>(R.id.meditaionCard)

        btnMeditationCard.setOnClickListener{
            intent = Intent(applicationContext, GuidedMeditaion::class.java)
            startActivity(intent)
        }

        val btnMusicCard2 = findViewById<ImageView>(R.id.musicCard)

        btnMusicCard2.setOnClickListener{
            intent = Intent(applicationContext, MeditationMusic::class.java)
            startActivity(intent)
        }

        val btnYoga = findViewById<CardView>(R.id.yogaBtn)

        btnYoga.setOnClickListener{
            intent = Intent(applicationContext, Yoga::class.java)
            startActivity(intent)
        }

        val btnYogaCard = findViewById<ImageView>(R.id.yogaCard)

        btnYogaCard.setOnClickListener{
            intent = Intent(applicationContext, Yoga::class.java)
            startActivity(intent)
        }
//intent to redirect to dialer with our contact number
        val talkBtn = findViewById<CardView>(R.id.talkBtn)

        talkBtn.setOnClickListener{
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "9119619850")
            startActivity(dialIntent)
        }

        val btnPositive = findViewById<CardView>(R.id.positiveAffirmationBtn)

        btnPositive.setOnClickListener{
            intent = Intent(applicationContext, PositiveAffermation::class.java)
            startActivity(intent)
        }



    }
}