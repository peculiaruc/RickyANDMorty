package com.peculiaruc.rickyandmortyapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.peculiaruc.rickyandmortyapp.R
import com.peculiaruc.rickyandmortyapp.databinding.ActivityMainBinding
import java.lang.reflect.Array.newInstance
import java.net.URLClassLoader.newInstance

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        // 1
//        if (savedInstanceState == null) {
//            // 2
//            supportFragmentManager
//                // 3
//                .beginTransaction()
//                // 4
//                .add(R.id.mainFragment, MainFragment.newInstance(), "charactList")
//                // 5
//                .commit()
//        }
    }
}