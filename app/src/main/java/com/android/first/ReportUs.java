package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class ReportUs extends AppCompatActivity {

    public static final int RESULT_REPORT_US_RECEIVED = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_us);

        ImageButton botaoVoltar = (ImageButton) findViewById(R.id.backIcon);

        botaoVoltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReportUs.this, MainActivity.class));
            }
        });
    }

    public void enviarDados(View view){

        EditText nome = (EditText) findViewById(R.id.txtNomeReport);
        EditText messagem = (EditText) findViewById(R.id.txtHow);
        EditText email = (EditText) findViewById(R.id.txtEmailReport);

        Bundle params = new Bundle();

        params.putString("nome", nome.getText().toString());
        params.putString("messagem", messagem.getText().toString());
        params.putString("email", email.getText().toString());


        if  (nome.getText().toString().isEmpty()){
             Toast.makeText(getApplicationContext(), "Nome Invalido", Toast.LENGTH_LONG).show();
        }else if(messagem.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Menssagem Invalida", Toast.LENGTH_LONG).show();
        }else if(email.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Email Invalio", Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(this, ReportUsReceived.class);
            intent.putExtras(params);

            startActivityForResult(intent, RESULT_REPORT_US_RECEIVED);
        }
    }

    protected void onActivityResult(int codigo, int resultado, Intent intent){

        if(codigo == RESULT_REPORT_US_RECEIVED) {
            Bundle params = intent.getExtras();
            if (params != null) {
                String msg = params.getString("msg");
                Toast.makeText(this, "Mensagem Enviada - " + msg, Toast.LENGTH_LONG).show();
            }
        }

    }
}
