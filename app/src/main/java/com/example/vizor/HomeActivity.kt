package com.example.vizor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.vizor.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val customerBtn = findViewById<Button>(R.id.btnCustomer)
        val retailerBtn = findViewById<Button>(R.id.btnRetailer)

        customerBtn.setOnClickListener {
            startActivity(Intent(this, CustomerActivity::class.java))
        }

        retailerBtn.setOnClickListener {
            startActivity(Intent(this, RetailerActivity::class.java))
        }
    }
}
