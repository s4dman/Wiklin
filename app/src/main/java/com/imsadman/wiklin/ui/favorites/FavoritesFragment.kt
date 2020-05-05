package com.imsadman.wiklin.ui.favorites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.imsadman.wiklin.R
import com.imsadman.wiklin.adapters.ArticleCardAdapter
import kotlinx.android.synthetic.main.fragment_favorites.*

class FavoritesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClick()
        initRecyclerView()
    }

    private fun onClick() {

    }

    private fun initRecyclerView() {
        favorites_recyclerview.layoutManager = LinearLayoutManager(context)
        favorites_recyclerview.adapter = ArticleCardAdapter()
    }
}
