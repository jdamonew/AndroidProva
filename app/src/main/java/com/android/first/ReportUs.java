package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ReportUs extends AppCompatActivity {

    public static final int RESULT_REPORT_US_RECEIVED = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_us);
    }

    public void enviarDados(View view){

        EditText nome = (EditText) findViewById(R.id.txtNomeReport);
        EditText messagem = (EditText) findViewById(R.id.txtHow);
        EditText email = (EditText) findViewById(R.id.txtEmailReport);

        Bundle params = new Bundle();
        params.putString("nome", nome.getText().toString());
        params.putString("messagem", messagem.getText().toString());
        params.putString("email", email.getText().toString());

        Intent intent = new Intent(this, ReportUsReceived.class);
        intent.putExtras(params);


        startActivityForResult(intent, RESULT_REPORT_US_RECEIVED);


    }

    protected void onActivityResult(int codigo, int resultado, Intent intent){
         Bundle params = intent.getExtras();
            if (params != null){
                String msg = params.getString("msg");
                Toast.makeText(this, "Mensagem Enviada", Toast.LENGTH_LONG).show();
            }

    }
}
