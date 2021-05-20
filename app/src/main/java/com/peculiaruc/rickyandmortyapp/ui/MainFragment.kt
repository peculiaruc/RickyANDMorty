package com.peculiaruc.rickyandmortyapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peculiaruc.rickyandmortyapp.R


class MainFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
//
//    class MainActivity : AppCompatActivity() {
//        private val viewModel by lazy {
//            ViewModelProviders.of(this)[MainActivityViewModel::class.java]
//        }
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_main)
//
//
//            val adapter = MainAdapter(object : OnItemClickedListener {
//                override fun onItemClicked(result: Result) {
//                    val selectedItem = result.id
//                    val intent = Intent(applicationContext, DetailActivity::class.java)
//                    intent.putExtra(MainAdapter.CHARACTER_ID, selectedItem)
//                    intent.putExtra(MainAdapter.CHARACTER_NAME, result.name)
//                    intent.putExtra(MainAdapter.CHARACTER_IMAGE, result.photoUrl)
//                    intent.putExtra(MainAdapter.CHARACTER_STATUS, result.status)
//                    intent.putExtra(MainAdapter.CHARACTER_SPECIE, result.species)
//                    intent.putExtra(MainAdapter.CHARACTER_GENDER, result.gender)
//                    intent.putExtra(MainAdapter.CHARACTER_ORIGIN_NAME,result.origin.name)
//                    intent.putExtra(MainAdapter.CHARACTER_ORIGIN_URL,result.origin.url)
//                    startActivity(intent)
//
//                }
//            })
//            recyclerView.adapter = adapter
//            recyclerView.layoutManager = GridLayoutManager(this, 2)
//            viewModel.getCharacters().observe(this, Observer {
//                adapter.setupData(it.results)
//                adapter.notifyDataSetChanged()
//            })
//
//        }
//    }
}