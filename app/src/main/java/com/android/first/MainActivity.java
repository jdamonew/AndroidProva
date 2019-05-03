package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button botao;
    EditText txtLogin;
    EditText txtPassword;
    ImageButton share;
    ImageButton drawMenu;
    ImageButton reportUs;




    //chamada assim que a activity é iniciada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //associamos a variavel ao componente na activity
        botao = (Button) findViewById(R.id.btnEntrar);
        txtLogin = (EditText) findViewById(R.id.txtEmail);
        txtPassword=(EditText) findViewById(R.id.txtPassword);
        share = (ImageButton) findViewById(R.id.share);
        drawMenu = (ImageButton) findViewById(R.id.menuIcon);
        reportUs = (ImageButton) findViewById(R.id.report);

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

                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent implicita = new Intent();
                implicita.setAction(Intent.ACTION_SEND);
                implicita.putExtra(Intent.EXTRA_TEXT, "Estou compartinhando meu APP.");
                implicita.setType("text/plain");
                v.getContext().startActivity(implicita);
            }
        });

        reportUs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ReportUs.class));
            }
        });

    }


//    //SEGUNDO
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(getApplicationContext(), "Iniciando a Activity. - OnStart",Toast.LENGTH_LONG).show();
//    }
//
//    //quando a activity é iniciada ou retornada.
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(getApplicationContext(), "Iniciando/Retornando a Activity. - OnResume",Toast.LENGTH_LONG).show();
//    }
//
//    //activity é pausada - perde o foco quando minimiza a activity
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(getApplicationContext(), "Activity Minimizada.",Toast.LENGTH_LONG).show();
//    }

//    //QUINTO
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(getApplicationContext(), "Activity Parada - OnStop",Toast.LENGTH_LONG).show();
//    }
//
//    //SEXTO
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(getApplicationContext(), "Activity Fechada - OnDestroy",Toast.LENGTH_LONG).show();
//    }




}
