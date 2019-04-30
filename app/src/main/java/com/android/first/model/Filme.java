package com.android.first.model;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Filme{

    //ATRIBUTOS
   private String nome;
   private String genero;
   private String ano;
   private int photo;

   //CONSTRUTOR VAZIO
   public Filme(){}

   //CONSTRUTOR
    public Filme(String nome, String genero, String ano, int photo) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.photo = photo;
   }

   //GETTER AND SETTER
   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        this.nome = nome;
   }

   public String getGenero() {
        return genero;
   }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}
