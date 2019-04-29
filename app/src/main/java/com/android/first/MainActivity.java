package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //PRIMEIRO
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //SEGUNDO
    @Override
    protected void onStart() {
        super.onStart();
    }

    //TERCEIRO
    @Override
    protected void onResume() {
        super.onResume();
    }
    //QUARTO
    @Override
    protected void onPause() {
        super.onPause();
    }

    //QUINTO
    @Override
    protected void onStop() {
        super.onStop();
    }

    //SEXTO
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    //DEPOIS DO ONSTOP()
    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
