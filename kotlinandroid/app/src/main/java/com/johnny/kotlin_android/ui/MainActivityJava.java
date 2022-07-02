package com.johnny.kotlin_android.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.snackbar.Snackbar;
import com.johnny.kotlin_android.data.MatchesAPI;
import com.johnny.kotlin_android.databinding.ActivityMainJavaBinding;
import com.johnny.kotlin_android.domain.Match;
import com.johnny.kotlin_android.ui.adapter.MatchesAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivityJava extends AppCompatActivity {

    private ActivityMainJavaBinding binding;
    private MatchesAPI matchesApi;
    private RecyclerView.Adapter matchesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainJavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupHttpClient();
        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();

        System.out.println("windows");


    }



    private void setupHttpClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://johnnymeneses.github.io/matches-simulator-api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        matchesApi = retrofit.create(MatchesAPI.class);
    }

    private void setupMatchesList() {

       binding.rvMatches.setHasFixedSize(true);
       binding.rvMatches.setLayoutManager(new LinearLayoutManager(this));
       matchesApi.getMatches().enqueue(new Callback<List<Match>>() {
            @Override
            public void onResponse(Call<List<Match>> call, Response<List<Match>> response) {
                if (response.isSuccessful()) {
                    List<Match> matches = response.body();

                    matchesAdapter = new MatchesAdapter(matches);

                    binding.rvMatches.setAdapter(matchesAdapter);
                } else {
                    showErrorMessage();

                }
            }

            @Override
            public void onFailure(Call<List<Match>> call, Throwable t) {
                showErrorMessage();
            }
        });
    }


    private void setupMatchesRefresh() {
        //TODO: Atualizar as partidas na ação de swipe
    }

    private void setupFloatingActionButton() {
        //TODO: Criar evento de click e simulação de partidas
    }

    private void showErrorMessage() {
        Snackbar.make(binding.fabSimulation, "erro",Snackbar.LENGTH_LONG).show();
    }


}