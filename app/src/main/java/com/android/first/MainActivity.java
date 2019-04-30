package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //criamos uma variavel pra o botao
    private Button botao;
    EditText txtLogin;
    EditText txtPassword;

    //chamada assim que a activity é iniciada
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //associamos a variavel ao componente na activity
        botao = (Button) findViewById(R.id.btnEntrar);
        txtLogin = (EditText) findViewById(R.id.txtEmail);
        txtPassword=(EditText) findViewById(R.id.txtPassword);

        //corpo que é chamado assim que o botao é apertado
        botao.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    if(txtLogin.getText().toString().equals("teste")&& txtPassword.getText().toString().equals("teste00")){
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

    }


//    //SEGUNDO
//    @Override
//    protected void onStart() {
//        super.onStart();
//    }
//
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
}
