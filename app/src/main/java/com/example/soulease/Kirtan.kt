package com.example.soulease

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class Kirtan : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirtan)

        val kirtanViewVariable = findViewById<WebView>(R.id.Kirtan)
        webViewSetUp(kirtanViewVariable)
    }
    @SuppressLint("SetJavaScriptEnabled")

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(kirtan: WebView){
        kirtan.webViewClient = WebViewClient()

        kirtan.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://www.youtube.com/watch?v=2ntenE9Fn5c")
        }


    }


}