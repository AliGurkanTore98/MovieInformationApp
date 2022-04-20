package com.codingurkan.movieinformationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.codingurkan.movieinformationapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateInit()

        //Data

        var filmIsimleri = ArrayList<String>()
        filmIsimleri.add("7.Koğuştaki Mucize")
        filmIsimleri.add("The Batman")
        filmIsimleri.add("Mad Max 5")
        filmIsimleri.add("World War Z")
        filmIsimleri.add("Arog")
        filmIsimleri.add("John Wick 1")

        var filmGorselleri = arrayListOf<Int>()
        filmGorselleri.add(R.drawable.yedincikogustakimucize)
        filmGorselleri.add(R.drawable.thebatman)
        filmGorselleri.add(R.drawable.madmax)
        filmGorselleri.add(R.drawable.wordlwarz)
        filmGorselleri.add(R.drawable.arog)
        filmGorselleri.add(R.drawable.johnwick)




        var filmCikisYili = ArrayList<Int>()
        filmCikisYili.add(2019)
        filmCikisYili.add(2022)
        filmCikisYili.add(2015)
        filmCikisYili.add(2013)
        filmCikisYili.add(2008)
        filmCikisYili.add(2014)


        //ADAPTER

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(filmIsimleri,filmGorselleri, filmCikisYili, object : RecyclerAdapter.ItemClickListener{
            override fun onClick(name: String , image: Int , year: Int) {
                val intent =Intent(this@MainActivity,InfoActivity::class.java)
                intent.putExtra("name",name)
                intent.putExtra("image",image)
                intent.putExtra("year",year)
                startActivity(intent)
            }
        })

        recyclerView.adapter = adapter
    }

    fun lateInit(){
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}