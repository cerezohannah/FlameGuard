package com.example.flameguard

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class SafetyTipsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_safety_tips) // create this XML layout


        //find button by ID
        val fireBoxLayout = findViewById<LinearLayout>(R.id.fireBoxLayout)
        val contactBoxLayout = findViewById<LinearLayout>(R.id.contactBoxLayout)
        val fireactionBoxLayout = findViewById<LinearLayout>(R.id.fireactionBoxLayout)
        val safetytipsBoxLayout = findViewById<LinearLayout>(R.id.safetytipsLayout)



        // ✅ Set click listener for Fire Box
        fireBoxLayout.setOnClickListener {
            val intent = Intent(this, FireActivity::class.java) // replace with your real target activity
            startActivity(intent)
        }

        contactBoxLayout.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java) // replace with your real target activity
            startActivity(intent)
        }

        fireactionBoxLayout.setOnClickListener {
            val intent = Intent(this, FireactionActivity::class.java) // replace with your real target activity
            startActivity(intent)
        }

        safetytipsBoxLayout.setOnClickListener {
            val intent = Intent(this, SafetyTipsActivity::class.java) // replace with your real target activity
            startActivity(intent)
        }
    }
}