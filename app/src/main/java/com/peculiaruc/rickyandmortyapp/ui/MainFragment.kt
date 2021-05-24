package com.peculiaruc.rickyandmortyapp.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.peculiaruc.rickyandmortyapp.R
import com.peculiaruc.rickyandmortyapp.adapter.MainAdapter
import com.peculiaruc.rickyandmortyapp.api.Api
import com.peculiaruc.rickyandmortyapp.api.Repository
import com.peculiaruc.rickyandmortyapp.databinding.FragmentMainBinding
import com.peculiaruc.rickyandmortyapp.model.Result
import com.peculiaruc.rickyandmortyapp.viewModel.MainViewModel
import com.peculiaruc.rickyandmortyapp.viewModel.MainViewModelFactory


class MainFragment : Fragment() {


    private var binding: FragmentMainBinding? = null
    private var result = mutableListOf<Result>()
    private lateinit var adapter: MainAdapter

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this, MainViewModelFactory(Repository(Api.apiService)))
            .get(MainViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.chaLiveData.observe(viewLifecycleOwner, Observer {
            result.addAll(it)

            Log.e("HELP", it[0].name)
            binding?.recyclerView?.visibility = View.VISIBLE
        })

        val adapter = MainAdapter(result)
        binding?.recyclerView?.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding?.recyclerView?.adapter = adapter
    }

}
//
//    companion object {
//        val ID_ARGS = MainFragment::class.java.simpleName + "Result-id"
//    }

