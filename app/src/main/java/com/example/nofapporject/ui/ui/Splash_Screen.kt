package com.example.nofapporject.ui.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.nofapporject.R

class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)


        val handler= Handler()

        handler.postDelayed(Runnable {

            val intent = Intent(this, HomeScreenn::class.java)
            startActivity(intent)
            finish()

        },2000)


    }
}