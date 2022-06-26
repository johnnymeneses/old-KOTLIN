package com.johnny.kotlin_android;

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




    }
}