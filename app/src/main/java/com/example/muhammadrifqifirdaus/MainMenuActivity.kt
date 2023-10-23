package com.example.muhammadrifqifirdaus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beranda)

        val profile= findViewById<CardView>(R.id.profile)
        profile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val settings= findViewById<CardView>(R.id.settings)
        settings.setOnClickListener {
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }

        val rate= findViewById<CardView>(R.id.rate)
        rate.setOnClickListener {
            val intent = Intent(this,RatingActivity::class.java)
            startActivity(intent)
        }



    }
}