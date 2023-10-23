package com.example.muhammadrifqifirdaus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.muhammadrifqifirdaus.R
import com.example.muhammadrifqifirdaus.RegActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        val textView1= findViewById<TextView>(R.id.btn_register)
        textView1.setOnClickListener {
            val intent = Intent(this, RegActivity::class.java)
            startActivity(intent)
        }

            val textView= findViewById<TextView>(R.id.forgot)
            textView.setOnClickListener {
                val intent = Intent(this, ForgotActivity::class.java)
                startActivity(intent)
            }

            val MainMenulogin= findViewById<Button>(R.id.btn_login)
            MainMenulogin.setOnClickListener {
                val intent = Intent(this, MainMenuActivity::class.java)
                startActivity(intent)
            }



            }
                }
