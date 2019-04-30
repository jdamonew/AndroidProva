package com.android.first.model;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.first.R;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter {

    private List<Filme> dados;

    public FilmeAdapter(){}

    public FilmeAdapter(List<Filme> dados){
        this.dados = dados;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class ViewHolderFilme extends  RecyclerView.ViewHolder{

       public TextView txtTitulo;
       public TextView txtAno;
       public TextView txtGenero;
       public ImageView img;

        public ViewHolderFilme( View itemView) {
            super(itemView);

            txtTitulo = itemView.findViewById(R.id.txtNome);

        }




    }

}
