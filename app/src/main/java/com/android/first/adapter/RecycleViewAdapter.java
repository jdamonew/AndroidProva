package com.android.first.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.first.R;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private static final String TAG = "RecycleViewAdapter";

    private ArrayList<Integer> mImagens = new ArrayList<>();
    private ArrayList<String> mTitulos = new ArrayList<>();
    private ArrayList<String> mGenero = new ArrayList<>();
    private ArrayList<String> mAno = new ArrayList<>();
    private ArrayList<String> mOriginal = new ArrayList<>();
    private Context mContext;

    //CONSTRUTOR
    public RecycleViewAdapter(Context mContext, ArrayList<Integer> mImagens, ArrayList<String> mTitulos, ArrayList<String> mGenero, ArrayList<String> mAno, ArrayList<String> mOriginal) {
        this.mImagens = mImagens;
        this.mTitulos = mTitulos;
        this.mContext = mContext;
        this.mGenero = mGenero;
        this.mAno = mAno;
        this.mOriginal = mOriginal;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_filmes, parent, false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
//        Glide.with(mContext)
//                .asBitmap()
//                .load(mImagens.get(position))
//                .into(holder.imagem);

        holder.titulo.setText(mTitulos.get(position));
        holder.genero.setText(mGenero.get(position));
        holder.ano.setText(mAno.get(position));
        holder.tituloOriginal.setText(mOriginal.get(position));
        holder.imagem.setImageResource(mImagens.get(position));
        holder.listaFilmes.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Log.d(TAG, "OnClick: on clicked on: " + mTitulos.get(position));

        Toast.makeText(mContext, mTitulos.get(position), Toast.LENGTH_LONG).show();
    }
    });
}



    @Override
    public int getItemCount() {
        return mTitulos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imagem;
        TextView titulo;
        TextView genero;
        TextView ano;
        TextView tituloOriginal;
        RelativeLayout listaFilmes;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagem = (ImageView) itemView.findViewById(R.id.imageIcon);
            titulo = (TextView) itemView.findViewById(R.id.titulo);
            listaFilmes = (RelativeLayout) itemView.findViewById(R.id.lista_filmes);
            genero = (TextView) itemView.findViewById(R.id.genero);
            ano = (TextView) itemView.findViewById(R.id.ano);
            tituloOriginal = (TextView) itemView.findViewById(R.id.original);

        }
    }
}
