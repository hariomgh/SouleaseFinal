package com.example.soulease

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.SeekBar

class GuidedMeditaion : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer
    var totalTime : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guided_meditaion)

        mediaPlayer = MediaPlayer.create(this,R.raw.guidedmedi)
        mediaPlayer.setVolume(1f,1f)
        totalTime = mediaPlayer.duration

        val btnPlay = findViewById<ImageView>(R.id.play)
        val btnPause = findViewById<ImageView>(R.id.pause)
        val btnStop = findViewById<ImageView>(R.id.stop)
        val seekBarMusic = findViewById<SeekBar>(R.id.seekBar)

        btnPlay.setOnClickListener {
            mediaPlayer.start()
        }

        btnPause.setOnClickListener {
            mediaPlayer.pause()
        }

        btnStop.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer.reset()
            mediaPlayer.release()
        }

        // seekBar changes time when user moves seekBar
        seekBarMusic.max = totalTime
        seekBarMusic.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                if(fromUser){
                    mediaPlayer.seekTo(progress)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        } )

        // changing the seekbar position based on music time with handler method(alternate method is execution)
        val handler = Handler()
        handler.postDelayed(object : Runnable{
            override fun run(){
                try {


                    seekBarMusic.progress =
                        mediaPlayer.currentPosition
                    handler.postDelayed(this, 1000)
                } catch (exception : java.lang.Exception){
                    seekBarMusic.progress = 0
                }
            }
        }, 0)
    }
}