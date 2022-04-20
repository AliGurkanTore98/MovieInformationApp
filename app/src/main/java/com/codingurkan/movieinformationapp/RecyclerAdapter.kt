package com.codingurkan.movieinformationapp


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codingurkan.movieinformationapp.databinding.RecyclerRowBinding

class RecyclerAdapter(val filmListesi : ArrayList<String>,
                      val filmGorselleri : ArrayList<Int>,
                      val yilListesi : ArrayList<Int>,
                      private val itemClickListener : ItemClickListener) : RecyclerView.Adapter<RecyclerAdapter.FilmVH>() {

    class FilmVH(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmVH {
        val binding =RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FilmVH(binding)
    }

    override fun onBindViewHolder(holder: FilmVH, position: Int) {
        holder.binding.apply {
            recyclerViewTextView.text = filmListesi[position]
            recyclerViewTextView.setOnClickListener {
                itemClickListener.onClick(filmListesi[position],filmGorselleri[position],yilListesi[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return filmListesi.size
    }

    interface ItemClickListener{
        fun onClick(name : String,image : Int , year : Int )
    }
}