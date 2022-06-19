package com.johnny.kotlin_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.johnny.kotlin_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHello.text = "Ola"



        supportActionBar!!.hide()




        //ViewBinding







    }
}