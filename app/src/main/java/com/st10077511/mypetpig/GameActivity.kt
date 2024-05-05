package com.st10077511.mypetpig

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GameActivity : AppCompatActivity() {

    var tvFPoints: TextView? = null
    var tvWPoints: TextView? = null
    var tvPPoints: TextView? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        tvFPoints = findViewById(R.id.tvFPoints)
        tvWPoints = findViewById(R.id.tvWPoints)
        tvPPoints = findViewById(R.id.tvPPoints)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        btnFeed.setOnClickListener {
            //feed screen
            val intent = Intent (this,FeedActivity::class.java)
            startActivity(intent)
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
            val intent = Intent (this,PlayActivity::class.java)
            startActivity(intent)
        }

    }
}