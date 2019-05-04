package com.android.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
                int ticket = random.nextInt(99999);

               // ticket = params.getInt("ticket");
                String nome = params.getString("nome");
                String messagem = params.getString("messagem");
                String email = params.getString("email");

                TextView vTicket = (TextView) findViewById(R.id.vTicket);
                TextView vNome = (TextView) findViewById(R.id.vNome);
                TextView vMenssagem = (TextView) findViewById(R.id.vMsg);
                TextView vEmail = (TextView) findViewById(R.id.vEmail);

                vTicket.setText(Integer.toString(ticket));
                vNome.setText(nome);
                vEmail.setText(email);
                vMenssagem.setText(messagem);



            }
        }
    }


    public void aceitou(View view){

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        String dataEnvio = dateFormat.format(date);

        Intent intent = new Intent();
        intent.putExtra("msg", dataEnvio);

        setResult(1, intent);
        finish();

    }

    public void voltarTela(View view){

        Intent intent = new Intent();

        setResult(1, intent);
        finish();

    }

    public void cancelou(View view){

        Intent intent = new Intent();

        startActivity(new Intent(this, ReportUs.class));
        finish();

    }

}
