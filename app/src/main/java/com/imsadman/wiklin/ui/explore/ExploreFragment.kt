package com.imsadman.wiklin.ui.explore

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.imsadman.wiklin.R
import com.imsadman.wiklin.SearchActivity
import com.imsadman.wiklin.adapters.ArticleCardAdapter
import kotlinx.android.synthetic.main.fragment_explore.*

class ExploreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onClick()
        initRecyclerView()
    }

    private fun onClick() {
        search_cardview.setOnClickListener {
            startActivity(Intent(context, SearchActivity::class.java))
        }
    }

    private fun initRecyclerView() {
        explore_recyclerview.layoutManager = LinearLayoutManager(context)
        explore_recyclerview.adapter = ArticleCardAdapter()
    }
}
