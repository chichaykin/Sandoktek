package com.sandoktek.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.sandoktek.R
import com.sandoktek.ui.login.LoginViewModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this, HomeViewModelFactory())
                .get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.Amount)
        homeViewModel.data.observe(this, Observer { list->
            recyclerView.apply {
                adapter = HomeArrayAdapter(list, context)
            }
        })
        homeViewModel.amount.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}