package com.johnny.kotlin_android.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.johnny.kotlin_android.databinding.ActivityMainJavaBinding;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainJavaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainJavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();


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