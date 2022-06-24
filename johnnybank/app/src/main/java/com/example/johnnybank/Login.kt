package com.example.johnnybank

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.johnnybank.databinding.ActivityLoginBinding

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)

        supportActionBar!!.hide()

        //Instanciando o View Binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener(this)


    }

    override fun onClick(view: View) {


        if (view.id == R.id.btn_login) {
            validaCampos()
        }

    }


    //Valida entrada Simples
    fun autenticacao() {

        val username = binding.editMail.text.toString()
        val password = binding.editPassword.text.toString()

        if (validaEntrada(username, password)) {
            Toast.makeText(this, "Bem Vindo", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Senha incorreta", Toast.LENGTH_SHORT).show()
        }
    }

    //valida entrada campos
    fun validaCampos() {

        val username = binding.editMail.text.toString()
        val password = binding.editPassword.text.toString()

        if (validaCampo(username, password)) {
            autenticacao()
        } else {
            Toast.makeText(this, "Preencha todos os Campos", Toast.LENGTH_SHORT).show()
        }
    }


}