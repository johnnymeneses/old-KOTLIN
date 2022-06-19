package com.johnny.kotlin_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.johnny.kotlin_android.databinding.ActivityMainBinding;
import com.johnny.kotlin_android.databinding.ActivityMainJavaBinding;

public class MainActivityJava extends AppCompatActivity {


    private ActivityMainJavaBinding bindingJava;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main_java);

        bindingJava = ActivityMainJavaBinding.inflate(getLayoutInflater());
        setContentView(bindingJava.getRoot());


    }
}