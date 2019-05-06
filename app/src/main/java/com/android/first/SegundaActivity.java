package com.android.first;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.android.first.Fragment.MovieFragment;
import com.android.first.Fragment.SerieFragment;
import com.android.first.adapter.RecycleViewAdapter;
import com.android.first.adapter.ViewPageAdapter;
import com.android.first.model.Filme;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class SegundaActivity extends AppCompatActivity {

    private ArrayList<String> fNome= new ArrayList<>();
    private ArrayList<Integer> fImage = new ArrayList<>();
    private ArrayList<String> fGenero = new ArrayList<>();
    private ArrayList<String> fAno = new ArrayList<>();
    private ArrayList<String> fOriginal = new ArrayList<>();


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);
        initImageBitmaps();

//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabMenuTeste);
//        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_viewpager);
//        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
//        adapter.AddFragment( new MovieFragment(),"Filmes");
//        adapter.AddFragment(new SerieFragment(), "Series");
//
//        viewPager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(viewPager);



    }



    public void initImageBitmaps(){


        fNome.add("O Fabuloso Destino de Amelie");
        fOriginal.add("Le fabuleux destin d'Amélie Poulain");
        fGenero.add("Fantasia/Romance");
        fAno.add("2001");
        fImage.add(R.drawable.amelie_loulain);

        fNome.add("O Iluminado");
        fOriginal.add("The Shining");
        fGenero.add("Horror/Terror/Suspense");
        fAno.add("1980");
        fImage.add(R.drawable.iluminado);

        fNome.add("Toy Story");
        fOriginal.add("ToyStory");
        fGenero.add("Animação");
        fAno.add("1995");
        fImage.add(R.drawable.toy_story);

        fNome.add("Zodiaco");
        fOriginal.add("Zodiac");
        fGenero.add("Drama/Suspense");
        fAno.add("2007");
        fImage.add(R.drawable.zodiaco);

        fNome.add("Homem-Aranha");
        fOriginal.add("Spider Man");
        fGenero.add("Ação");
        fAno.add("2002");
        fImage.add(R.drawable.miranha);

        fNome.add("Grease - Nos Tempos da Brilhantina");
        fOriginal.add("Grease");
        fGenero.add("Musical");
        fAno.add("1978");
        fImage.add(R.drawable.grease);

        recycleViewClass();

    }

    public void recycleViewClass(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.lista_filmesRecycle);
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, fImage, fNome, fGenero, fAno, fOriginal);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
