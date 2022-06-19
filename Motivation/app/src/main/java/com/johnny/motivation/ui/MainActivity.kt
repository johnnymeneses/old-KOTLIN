package com.johnny.motivation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.johnny.motivation.R
import com.johnny.motivation.infra.MotivationConstants
import com.johnny.motivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSecurityPreferences = SecurityPreferences(this)

        text_name.text = "Olá, ${mSecurityPreferences.getString(MotivationConstants.KEY.PERSON_NAME)}!"



        supportActionBar!!.hide()
    }
}