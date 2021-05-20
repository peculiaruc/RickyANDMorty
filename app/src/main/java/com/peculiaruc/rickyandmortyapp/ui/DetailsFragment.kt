package com.peculiaruc.rickyandmortyapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.peculiaruc.rickyandmortyapp.R

class DetailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

//
//    class DetailActivity : AppCompatActivity() {
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_detail)
//
//            if(intent.hasExtra(MainAdapter.CHARACTER_ID)){
//                name.text = intent.getStringExtra(MainAdapter.CHARACTER_NAME)
//                status.text = intent.getStringExtra(MainAdapter.CHARACTER_STATUS)
//                specie.text = intent.getStringExtra(MainAdapter.CHARACTER_SPECIE)
//                gender.text = intent.getStringExtra(MainAdapter.CHARACTER_GENDER)
//                origin_name.text = intent.getStringExtra(MainAdapter.CHARACTER_ORIGIN_NAME)
//                origin_url.text = intent.getStringExtra(MainAdapter.CHARACTER_ORIGIN_URL)
//                Glide.with(this).load(intent.getStringExtra(MainAdapter.CHARACTER_IMAGE))
//                    .centerCrop().transform(CircleCrop()).into(photo)
//            }
//        }
//    }



//    class DetailActivity : AppCompatActivity() {
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_detail)
//
//            if(intent.hasExtra(MainAdapter.CHARACTER_ID)){
//                name.text = intent.getStringExtra(MainAdapter.CHARACTER_NAME)
//                status.text = intent.getStringExtra(MainAdapter.CHARACTER_STATUS)
//                specie.text = intent.getStringExtra(MainAdapter.CHARACTER_SPECIE)
//                gender.text = intent.getStringExtra(MainAdapter.CHARACTER_GENDER)
//                origin_name.text = intent.getStringExtra(MainAdapter.CHARACTER_ORIGIN_NAME)
//                origin_url.text = intent.getStringExtra(MainAdapter.CHARACTER_ORIGIN_URL)
//                Glide.with(this).load(intent.getStringExtra(MainAdapter.CHARACTER_IMAGE))
//                        .centerCrop().transform(CircleCrop()).into(photo)
//            }
//        }
//    }
}