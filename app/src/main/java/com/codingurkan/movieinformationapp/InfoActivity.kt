package com.codingurkan.movieinformationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingurkan.movieinformationapp.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    lateinit var binding : ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val secilenFilmIsmi =intent.getStringExtra("name")
        val secilenFilmGorseli = intent.getIntExtra("image",0)
        val secilenFilmYili =intent.getIntExtra("year",1)

        binding.textView.text = secilenFilmIsmi
        binding.imageView.background = resources.getDrawable(secilenFilmGorseli,null)
        binding.textView2.text = secilenFilmYili.toString()




    }


}