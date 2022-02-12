package com.example.smartchess

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


const val MODE = "com.example.smartchess.MODE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val newGame: CardView = findViewById(R.id.new_game)

        newGame.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java).apply {
               /* val mood = it.id.toString()
                putExtra(MODE, mood)*/

            }
            startActivity(intent)

        }
    }



}