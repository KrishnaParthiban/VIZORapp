package com.example.vizor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.vizor.R

class CustomerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)

        val scanRoomBtn = findViewById<Button>(R.id.btnScanRoom)
        scanRoomBtn.setOnClickListener {
            startActivity(Intent(this, CameraActivity::class.java))
        }
    }
}
