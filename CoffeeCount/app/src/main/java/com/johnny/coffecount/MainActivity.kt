package com.johnny.coffecount

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var contador: Int = 0
    var contadorAgua: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        iniciaQtde()

        img_coffee.setOnClickListener() { botaoCafe() }

        img_coffee.setOnLongClickListener() { zeraCafe() }

        img_agua.setOnClickListener() { botaoAgua() }

        img_agua.setOnLongClickListener() { zeraAgua() }


    }

    fun iniciaQtde() {
        qtde_agua.text = "Nenhum copo de água"
        qtde_cafee.text = "Nenhum copo de café"
    }


    fun botaoCafe() {
        contador += 1
        when {
            contador == 1 -> "$contador cafe".also { qtde_cafee.text = it }
            contador > 1 -> "$contador cafés".also { qtde_cafee.text = it }
        }
    }

    fun zeraCafe(): Boolean {
        contador = 0
        qtde_cafee.text = "Nenhum copo de café"
        return true
    }

    fun botaoAgua() {
        contadorAgua += 1
        when {
            contadorAgua == 1 -> qtde_agua.text = "$contadorAgua copo de água"
            contadorAgua > 1 -> qtde_agua.text = "$contadorAgua copos de água"
        }
    }

    fun zeraAgua(): Boolean {
        contadorAgua = 0
        qtde_agua.text = "Nenhum copo de água"
        return true
    }


}