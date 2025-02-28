package com.example.vizor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.vizor.R

class FurnitureCatalogActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var btnGoToCart: Button
    private lateinit var furnitureAdapter: FurnitureAdapter
    private val furnitureList = mutableListOf<FurnitureItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_furniture_catalog)

        recyclerView = findViewById(R.id.recyclerFurniture)
        btnGoToCart = findViewById(R.id.btnGoToCart)

        // Sample Furniture Data
        furnitureList.add(FurnitureItem("Sofa", 9999.99, R.drawable.sofa))
        furnitureList.add(FurnitureItem("Table", 1999.99, R.drawable.table))
        furnitureList.add(FurnitureItem("Chair", 399.99, R.drawable.chair))

        // Set up RecyclerView
        furnitureAdapter = FurnitureAdapter(this, furnitureList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = furnitureAdapter

        // Navigate to Checkout
        btnGoToCart.setOnClickListener {
            startActivity(Intent(this, CheckoutActivity::class.java))
        }
    }
}
