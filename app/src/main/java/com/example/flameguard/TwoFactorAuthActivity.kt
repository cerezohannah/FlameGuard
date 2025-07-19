package com.example.flameguard

import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TwoFactorAuthActivity : AppCompatActivity() {

    private lateinit var etTwoFactorCode: EditText
    private lateinit var btnVerify2FA: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        etTwoFactorCode = findViewById(R.id.etTwoFactorCode)
        btnVerify2FA = findViewById(R.id.btnVerify2FA)

        // Optional: enforce max length programmatically (in case XML doesn't work)
        etTwoFactorCode.filters = arrayOf(InputFilter.LengthFilter(6))

        btnVerify2FA.setOnClickListener {
            val code = etTwoFactorCode.text.toString().trim()

            if (code.length != 6) {
                Toast.makeText(this, "Enter a valid 6-digit code", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // TODO: Verify the code with your backend or local TOTP logic

            // For demonstration, assume the code is "123456"
            if (code == "123456") {
                Toast.makeText(this, "2FA Verified! Logging you in.", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Invalid 2FA code", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
