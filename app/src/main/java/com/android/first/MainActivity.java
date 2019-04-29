package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //criamos uma variavel pra o botao
    private Button botao;
    EditText txtLogin;
    EditText txtPassword;

    //PRIMEIRO
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //associamos a variavel ao componente na activity
        botao = (Button) findViewById(R.id.btnEntrar);
        txtLogin = (EditText) findViewById(R.id.txtEmail);
        txtPassword=(EditText) findViewById(R.id.txtPassword);

        //metodo para realizar a acao
        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            startActivity(new Intent(MainActivity.this, SegundaActivity.class));
            }
        });
    }
//    //SEGUNDO
//    @Override
//    protected void onStart() {
//        super.onStart();
//    }
//
//    //TERCEIRO
//    @Override
//    protected void onResume() {
//        super.onResume();
//    }
//    //QUARTO
//    @Override
//    protected void onPause() {
//        super.onPause();
//    }
//
//    //QUINTO
//    @Override
//    protected void onStop() {
//        super.onStop();
//    }
//
//    //SEXTO
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }


//     protected void onResult(){
//        super.onResult();
//     }

    }
