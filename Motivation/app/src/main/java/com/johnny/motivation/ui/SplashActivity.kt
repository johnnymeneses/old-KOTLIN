package com.johnny.motivation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.johnny.motivation.R
import com.johnny.motivation.infra.MotivationConstants
import com.johnny.motivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityPreferences: SecurityPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //o contexto só é valido à partir da criação desta linha
        setContentView(R.layout.activity_splash) // e desta linha

        mSecurityPreferences = SecurityPreferences(this)


        //Qual impacto de não fazer essa verificação?
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        btn_save.setOnClickListener(this)




    }

    override fun onClick(view: View) {
        val id = view.id

        if (id == R.id.btn_save) { validaCampoNome() }


    }

    private fun validaCampoNome() {

        val name = editname.text.toString()

        if (name != "") {
            mSecurityPreferences.storeString(MotivationConstants.KEY.PERSON_NAME, name)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Preencha seu nome", Toast.LENGTH_SHORT).show()
            //contexto é a aplicação em si
        }
    }
}



/*
Shared Preferences: obtido atreavés do contexto da aplicação
Uso: Acessos rápidos, dados que não mudam com frequencia e que sejam poucos dados.



 */