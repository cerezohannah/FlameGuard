package com.example.flameguard

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.flameguard.databinding.ActivityAccountBinding
import com.google.firebase.auth.FirebaseAuth

class AccountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root) // <-- Use binding.root here!

        val user = FirebaseAuth.getInstance().currentUser

        if (user != null) {
            binding.textEmail.text = "Email: ${user.email}"
            binding.textUserName.text = "Name: ${user.displayName}"
        } else {
            binding.textEmail.text = "No user logged in"
            binding.textUserName.text = ""
        }

        binding.btnLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
