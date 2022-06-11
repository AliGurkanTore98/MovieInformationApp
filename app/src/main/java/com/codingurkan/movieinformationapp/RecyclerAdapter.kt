package com.codingurkan.movieinformationapp


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codingurkan.movieinformationapp.databinding.RecyclerRowBinding

class RecyclerAdapter(private var movieList: List<InformationItem>,
                      private val itemClickListener: ItemClickListener) : RecyclerView.Adapter<RecyclerAdapter.FilmVH>() {

    class FilmVH(val binding: RecyclerRowBinding): RecyclerView.ViewHolder(binding.root){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmVH {
        val binding =RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FilmVH(binding)
    }
    override fun onBindViewHolder(holder: FilmVH, position: Int) {
        holder.binding.apply {
            recyclerViewTextView.text = movieList[position].filmListesi
            recyclerViewTextView.setOnClickListener {
                itemClickListener.onClick(movieList[position])
            }
        }
    }
    override fun getItemCount(): Int {
        return movieList.size
    }
    interface ItemClickListener{
        fun onClick(list : InformationItem )
    }
}