package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class ReportUsReceived extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_us_received);

        Intent intent = getIntent();
        if (intent!= null){
            Bundle params = intent.getExtras();
            if(params != null){

                Random random = new Random();
                int ticket = random.nextInt(1000);

                ticket = params.getInt("ticket");
                String nome = params.getString("nome");
                String messagem = params.getString("messagem");
                String email = params.getString("email");

                TextView vTicket = (TextView) findViewById(R.id.vTicket);
                TextView vNome = (TextView) findViewById(R.id.vNome);
                TextView vMenssagem = (TextView) findViewById(R.id.vMsg);
                TextView vEmail = (TextView) findViewById(R.id.vEmail);

                vTicket.setText("Ticket" + vTicket);
                vNome.setText(nome);
                vEmail.setText(email);
                vMenssagem.setText(messagem);



            }
        }
    }


    public void aceitou(View view){

        Intent intent = new Intent();
        intent.putExtra("msg","Aceitou");

        setResult(1, intent);
        finish();

    }

    public void cancelou(View view){

        Intent intent = new Intent();
        intent.putExtra("msg","Cancelou");

        setResult(2, intent);
        finish();

    }
}
