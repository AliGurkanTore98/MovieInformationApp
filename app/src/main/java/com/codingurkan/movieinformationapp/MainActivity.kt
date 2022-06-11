package com.codingurkan.movieinformationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.codingurkan.movieinformationapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var adapter : RecyclerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateInit()
        setupAdapter()
    }
    private fun lateInit() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }
    private fun setupAdapter() {
       adapter = RecyclerAdapter(SetData.setMovies(), object : RecyclerAdapter.ItemClickListener{
            override fun onClick(list: InformationItem) {
                Intent(this@MainActivity, InfoActivity::class.java).apply {
                    putExtra("data",list)
                    startActivity(this)
                }
            }
        })
        binding?.recyclerView?.adapter = adapter
    }
}