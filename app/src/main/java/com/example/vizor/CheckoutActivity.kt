package com.example.vizor

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.vizor.R

class CheckoutActivity : AppCompatActivity() {

    private lateinit var tvTotalAmount: TextView
    private lateinit var btnPayNow: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        tvTotalAmount = findViewById(R.id.tvTotalAmount)
        btnPayNow = findViewById(R.id.btnPayNow)

        // Example Total Price
        tvTotalAmount.text = "Total Amount: $529.99"

        btnPayNow.setOnClickListener {
            // Payment process
            Toast.makeText(this, "Payment Successful!", Toast.LENGTH_SHORT).show()
        }
    }
}
