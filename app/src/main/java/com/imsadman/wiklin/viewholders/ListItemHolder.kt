package com.imsadman.wiklin.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.imsadman.wiklin.R

class ListItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val articleImage: ImageView = itemView.findViewById(R.id.result_icon)
    private val articleTitle: TextView = itemView.findViewById(R.id.result_title)
}