package com.imsadman.wiklin.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.imsadman.wiklin.R
import com.imsadman.wiklin.viewholders.CardHolder
import com.imsadman.wiklin.viewholders.ListItemHolder

class ArticleListItemAdapter() : RecyclerView.Adapter<ListItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
        var listItem =
            LayoutInflater.from(parent?.context).inflate(R.layout.item_article_list, parent, false)
        return ListItemHolder(listItem)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {

    }
}

