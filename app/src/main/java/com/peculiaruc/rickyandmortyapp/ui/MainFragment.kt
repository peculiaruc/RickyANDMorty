package com.peculiaruc.rickyandmortyapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peculiaruc.rickyandmortyapp.R
import com.peculiaruc.rickyandmortyapp.adapter.MainAdapter
import com.peculiaruc.rickyandmortyapp.databinding.FragmentMainBinding
import com.peculiaruc.rickyandmortyapp.model.Result


class MainFragment : Fragment() {


    private var binding: FragmentMainBinding? = null
    private var result = mutableListOf< Result>()
    private lateinit var adapter: MainAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

}