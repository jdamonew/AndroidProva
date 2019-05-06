package com.android.first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
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
        txtPassword =(EditText) findViewById(R.id.txtPassword);
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
                    finish();
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
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Iniciando a Activity. - OnStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Retornando a Activity. - OnResume",Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        notificacaoPause();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Activity Fechada - OnDestroy",Toast.LENGTH_LONG).show();
    }

    //geração de notificação
    public void notificacaoPause(){
        NotificationManager notificacao = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        PendingIntent p = PendingIntent.getActivity(this,0,new Intent(this, SplashScreen.class), 0);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setTicker("Aplicativo Minimizado");
        builder.setContentTitle("JobFlix");
        builder.setContentText("Aplicativo foi minimizado.");
        builder.setSmallIcon(R.drawable.jf);
        builder.setContentIntent(p);

        Notification n = builder.build();
        n.vibrate = new long[]{150, 300, 150, 600};
        n.flags = Notification.FLAG_AUTO_CANCEL;
        notificacao.notify(R.drawable.jf,n);

    }
}
