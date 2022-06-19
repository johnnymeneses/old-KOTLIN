package com.johnny.nzpassport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.johnny.nzpassport.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Instanciar ViewBinging
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        //Instanciando a ViewModel
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        binding.btnOk.setOnClickListener(this)

        setObserver()

    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_ok) {
            val name = binding.editFirstName.text.toString()
            val lastname = binding.editLastName.text.toString()

            viewModel.getInfo(name, lastname)

        }
    }


    //Observer para alterar a msg de Ola
    fun setObserver() {
        viewModel.welcome().observe(this, {
            binding.textWelcome.text = it
        })



        viewModel.enterCountry().observe(this, {
            if (it) {
                binding.textWelcome.text = "Kia - Ora - Welcome to NZ"
            } else {
                Toast.makeText(applicationContext, "Falha", Toast.LENGTH_SHORT).show()
            }
        })
    }
}

