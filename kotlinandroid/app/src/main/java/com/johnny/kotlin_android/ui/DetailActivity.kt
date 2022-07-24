package com.johnny.kotlin_android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.johnny.kotlin_android.databinding.ActivityDetailBinding
import com.johnny.kotlin_android.databinding.ActivityMainBinding
import com.johnny.kotlin_android.domain.Match

class DetailActivity : AppCompatActivity() {

    object Extras {
        const val MATCH = "EXTRA_MATCH"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        supportActionBar!!.hide()
        setSupportActionBar(binding.toolbar) //Define a toolbar personalizada
        supportActionBar?.setDisplayHomeAsUpEnabled(true) // Incluir na tela de detalhes os botões de voltar. Característicias da Home.

        loadMatchFromExtra()

    }

    private fun loadMatchFromExtra(){
        intent?.extras?.getParcelable<Match>(Extras.MATCH)?.let{

            //Estadio
            Glide.with(this).load(it.place.image).into(binding.ivPlace)

            //Times
            Glide.with(this).load(it.homeTeam.image).into(binding.ivHomeTeam)
            binding.tvHomeTeamName.text = it.homeTeam.name
            binding.rbHomeTeamStars.rating = it.homeTeam.stars.toFloat()

            if(it.homeTeam.score != null){
                binding.tvHomeTeamScore.text = it.homeTeam.score.toString()
            }

            Glide.with(this).load(it.awayTeam.image).into(binding.ivAwayTeam)
            binding.tvAwayTeamName.text = it.awayTeam.name
            binding.rbAwayTeamStars.rating = it.awayTeam.stars.toFloat()

            if(it.awayTeam.score != null){
                binding.tvAwayTeamScore.text = it.awayTeam.score.toString()
            }
            supportActionBar?.title = it.place.name

            binding.tvDescription.text = it.description
        }
    }
}





