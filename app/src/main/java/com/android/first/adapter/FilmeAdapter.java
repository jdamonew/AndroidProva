package com.android.first.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.first.R;
import com.android.first.model.Filme;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.ViewHolderFilme> {
    @NonNull
    @Override
    public FilmeAdapter.ViewHolderFilme onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeAdapter.ViewHolderFilme holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

//    private List<Filme> dados;
//
//    public FilmeAdapter(){}
//
//    public FilmeAdapter(List<Filme> dados){
//        this.dados = dados;
//    }
//
//        @Override
//    public FilmeAdapter.ViewHolderFilme onCreateViewHolder(ViewGroup parent, int viewType) {
//
//            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//
//            View view = layoutInflater.inflate(R.layout.activity_segunda, parent,false);
//
//            ViewHolderFilme holderFilme = new ViewHolderFilme(view);
//
//        return holderFilme;
//    }
//
//    @Override
//    public void onBindViewHolder (FilmeAdapter.ViewHolderFilme holder, int position) {
//
//        Filme filme = dados.get(position);
//
//        holder.txtTitulo.setText(filme.nome);
//        holder.txtGenero.setText(filme.genero);
//        holder.txtAno.setText(filme.genero);
//        //holder.img.setImageBitmap(filme.photo);
//    }
//
//    @Override
//    public int getItemCount() {
//        return dados.size();
//    }
//
    public class ViewHolderFilme extends  RecyclerView.ViewHolder{
//
//       public TextView txtTitulo;
//       public TextView txtAno;
//       public TextView txtGenero;
//       public ImageView img;
//
        public ViewHolderFilme( View itemView) {
            super(itemView);
//
//            txtTitulo = (TextView) itemView.findViewById(R.id.txtNome);
//            txtAno = (TextView)itemView.findViewById(R.id.txtAno);
//            txtGenero = (TextView)itemView.findViewById(R.id.txtGenero);
//            img = (ImageView) itemView.findViewById(R.id.imgCentral);
//
      }
//
//
//
//
  }

}
