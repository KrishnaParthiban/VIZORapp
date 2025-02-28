package com.example.vizor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.vizor.R

class FurnitureAdapter(private val context: Context, private val furnitureList: List<FurnitureItem>) :
    RecyclerView.Adapter<FurnitureAdapter.FurnitureViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FurnitureViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_furniture_item, parent, false)
        return FurnitureViewHolder(view)
    }

    override fun onBindViewHolder(holder: FurnitureViewHolder, position: Int) {
        val furniture = furnitureList[position]
        holder.tvFurnitureName.text = furniture.name
        holder.tvFurniturePrice.text = "$${furniture.price}"
        holder.ivFurnitureImage.setImageResource(furniture.imageResId)

        holder.btnWishlist.setOnClickListener {
            // Handle Wishlist action
        }

        holder.btnBuy.setOnClickListener {
            // Handle Buy action
        }
    }

    override fun getItemCount(): Int {
        return furnitureList.size
    }

    class FurnitureViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFurnitureName: TextView = itemView.findViewById(R.id.tvFurnitureName)
        val tvFurniturePrice: TextView = itemView.findViewById(R.id.tvFurniturePrice)
        val ivFurnitureImage: ImageView = itemView.findViewById(R.id.ivFurnitureImage)
        val btnWishlist: Button = itemView.findViewById(R.id.btnWishlist)
        val btnBuy: Button = itemView.findViewById(R.id.btnBuy)
    }
}
