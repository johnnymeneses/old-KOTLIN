package com.johnny.kotlin_android.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.johnny.kotlin_android.data.MatchesAPI;
import com.johnny.kotlin_android.databinding.ActivityMainJavaBinding;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainJavaBinding binding;
    private MatchesAPI matchesApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainJavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();


    }

    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/johnnymeneses/matches-simulator-api/main/matches.json")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        matchesApi = retrofit.create(MatchesAPI.class);
    }

    private void setupMatchesList() {
        //TODO Listar as partidas, consumindo nossa API
    }

    private void setupMatchesRefresh() {
        //TODO: Atualizar as partidas na ação de swipe
    }

    private void setupFloatingActionButton() {
        //TODO: Criar evento de click e simulação de partidas
    }




}