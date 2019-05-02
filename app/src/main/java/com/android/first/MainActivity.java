package com.android.first;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.first.adapter.RecycleViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //criamos uma variavel pra o botao
    private Button botao;
    EditText txtLogin;
    EditText txtPassword;
    ImageButton warning;
    ImageButton drawMenu;




    //chamada assim que a activity é iniciada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //associamos a variavel ao componente na activity
        botao = (Button) findViewById(R.id.btnEntrar);
        txtLogin = (EditText) findViewById(R.id.txtEmail);
        txtPassword=(EditText) findViewById(R.id.txtPassword);
        warning = (ImageButton) findViewById(R.id.warning);
        drawMenu = (ImageButton) findViewById(R.id.menuIcon);

        //corpo que é chamado assim que o botao ENTRAR NO LAYOUT MAINMENU é apertado
        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(txtLogin.getText().toString().equals("123")&& txtPassword.getText().toString().equals("123")){
                    //intente explicita
                    startActivity(new Intent(MainActivity.this, SegundaActivity.class));
                }else{
                    AlertDialog.Builder messageBox = new AlertDialog.Builder(MainActivity.this);
                    messageBox.setTitle("Email/Senha Incorretos");
                    messageBox.setMessage("\nPor favor digite Email e Senha correspondentes.");
                    messageBox.setNeutralButton("OK",null);
                    messageBox.show();
                    //teste

                }

            }
        });

        warning.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent implicita = new Intent();
                implicita.setAction(Intent.ACTION_SEND);
                implicita.putExtra(Intent.EXTRA_TEXT, "Estou compartinhando meu APP.");
                implicita.setType("text/plain");
                v.getContext().startActivity(implicita);
            }
        });



    }

    //quando a activity é iniciada ou retornada.
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Iniciando/Retornando a Activity.",Toast.LENGTH_LONG).show();
    }

    //activity é pausada - perde o foco quando minimiza a activity
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Activity Minimizada.",Toast.LENGTH_LONG).show();
    }

    //    //SEGUNDO
//    @Override
//    protected void onStart() {
//        super.onStart();
//    }
//

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
