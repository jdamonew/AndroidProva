package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botao;

    //PRIMEIRO
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btnEntrar);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, SegundaActivity.class));
            }
        });
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


//     protected void onResult(){
//        super.onResult();
//     }

    }
