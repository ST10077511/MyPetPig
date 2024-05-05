package com.st10077511.mypetpig

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WashActivity : AppCompatActivity() {

    var tvNotification: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wash)

        tvNotification = findViewById(R.id.tvNotification)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        btnFeed.setOnClickListener {
            //feed screen
            val intent = Intent (this,FeedActivity::class.java)
            startActivity(intent)
        }

        val btnWash = findViewById<Button>(R.id.btnWash)
        btnWash.setOnClickListener{
            //if pet is washed twice
            tvNotification?.text = "Your pet is clean."

        }

        val btnPlay = findViewById<Button>(R.id.btnPlay)
        btnPlay.setOnClickListener{
            //play screen
            val intent = Intent (this,PlayActivity::class.java)
            startActivity(intent)
        }

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener() {
            //back to home screen
            var intent = Intent (this,GameActivity::class.java)
            startActivity(intent)
        }

    }
}