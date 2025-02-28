package com.example.vizor

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.vizor.R

class ForgotPasswordActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val btnResetPassword = findViewById<Button>(R.id.btnResetPassword)

        btnResetPassword.setOnClickListener {
            val email = etEmail.text.toString()

            if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Password reset link sent!", Toast.LENGTH_SHORT).show()
                // TODO: Implement forgot password logic
                finish()
            }
        }
    }
}
