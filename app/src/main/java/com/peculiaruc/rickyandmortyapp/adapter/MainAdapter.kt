package com.peculiaruc.rickyandmortyapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.peculiaruc.rickyandmortyapp.databinding.ListItemBinding
import com.peculiaruc.rickyandmortyapp.model.Result

class MainAdapter(private val characterlist: List<Result>): RecyclerView
.Adapter<MainAdapter.MainViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
       return MainViewHolder(ListItemBinding.inflate(
           LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
       return characterlist.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindItem(characterlist[position])
    }


    inner class MainViewHolder(private val binding: ListItemBinding): RecyclerView
    .ViewHolder(binding.root) {
        fun bindItem(result: Result){
            binding.imageView2.load(result.image)
            binding.textName.text = result.name
            binding.textViewSpices.text = result.species
            binding.textViewStatus.text = result.status

        }
    }
}