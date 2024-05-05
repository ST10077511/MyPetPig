package com.st10077511.mypetpig

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ToodirtyActivity : AppCompatActivity() {

    var tvNotification: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toodirty)

        tvNotification = findViewById(R.id.tvNotification)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        btnFeed.setOnClickListener {
            //feed screen
            tvNotification?.error = "Your pet is too dirty to eat."
        }

        val btnWash = findViewById<Button>(R.id.btnWash)
        btnWash.setOnClickListener{
            //wash screen
            val intent = Intent (this,WashActivity::class.java)
            startActivity(intent)

        }

        val btnPlay = findViewById<Button>(R.id.btnPlay)
        btnPlay.setOnClickListener{
            //play screen
            tvNotification?.text = "Your pet is too dirty to play again."
        }

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener() {
            //back to home screen
            var intent = Intent (this,GameActivity::class.java)
            startActivity(intent)
        }

    }
}