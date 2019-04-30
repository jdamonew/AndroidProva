package com.android.first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.first.model.Filme;

import java.util.List;

public class SegundaActivity extends AppCompatActivity {



        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }












    public List<Filme> getSetFilmeList(int qtd){

        String[] nome = new String[]{"O Fabuloso Destino de Amelie Poulain","O Iluminado","Toy Story","Zodiaco"};
        String[] ano = new String[]{"2001","1980","1995","2007"};
        String[] genero = new String[]{"Fantasia","Horror","Animação","Suspense"};
        int[] photo = new int[]{R.drawable.amelie_loulain, R.drawable.iluminado, R.drawable.toy_story, R.drawable.zodiaco};

        return null;
    }
}
