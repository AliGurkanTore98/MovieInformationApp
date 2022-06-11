package com.codingurkan.movieinformationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingurkan.movieinformationapp.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    lateinit var binding : ActivityInfoBinding
    private lateinit var args: InformationItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getArgs()
        initUi()
    }
    private fun getArgs(){
       args = intent.getSerializableExtra("data") as InformationItem
    }
    private fun initUi(){
        binding.apply {
            textView.text = args.filmListesi
            imageView.setImageResource(args.filmGorselleri)
            textView2.text = args.yilListesi.toString()
            textView3.text = args.basrolOyuncu
            textView4.text = args.imdbScore.toString()
        }
    }
}