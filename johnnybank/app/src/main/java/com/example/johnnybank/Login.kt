package com.example.johnnybank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.johnnybank.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)

        supportActionBar!!.hide()

        //Instanciando o View Binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}