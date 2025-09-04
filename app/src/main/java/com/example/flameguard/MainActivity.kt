package com.example.flameguard

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set full screen
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // Link the activity to the layout
        setContentView(R.layout.activity_main)

        // Find buttons by ID
        val accountButton = findViewById<LinearLayout>(R.id.accountButton)
        val safeButton =findViewById<LinearLayout>(R.id.safeButton)
       // val contactButton = findViewById<LinearLayout>(R.id.contactButton)
      //  val fireBoxLayout = findViewById<LinearLayout>(R.id.fireBoxLayout)
      //  val contactBoxLayout = findViewById<LinearLayout>(R.id.contactBoxLayout)
      //  val fireactionBoxLayout = findViewById<LinearLayout>(R.id.fireactionBoxLayout)
       // val safetytipsBoxLayout = findViewById<LinearLayout>(R.id.safetytipsLayout)


        // Set click listener for Account
        accountButton.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }

        safeButton.setOnClickListener {
            val intent = Intent(this, SafetyTipsActivity::class.java)
            startActivity(intent)
        }

        // Set click listener for Contact
       // contactButton.setOnClickListener {
       //     val intent = Intent(this, ContactActivity::class.java)
       //     startActivity(intent)
       // }

        // ✅ Set click listener for Fire Box
       // fireBoxLayout.setOnClickListener {
       //     val intent = Intent(this, FireActivity::class.java) // replace with your real target activity
     //       startActivity(intent)
     //   }

       // contactBoxLayout.setOnClickListener {
       //     val intent = Intent(this, ContactActivity::class.java) // replace with your real target activity
       //     startActivity(intent)
      //  }

      //  fireactionBoxLayout.setOnClickListener {
       //     val intent = Intent(this, FireactionActivity::class.java) // replace with your real target activity
       //     startActivity(intent)
     //   }

      //  safetytipsBoxLayout.setOnClickListener {
       //     val intent = Intent(this, SafetyTipsActivity::class.java) // replace with your real target activity
       //     startActivity(intent)
       // }
    }
}
