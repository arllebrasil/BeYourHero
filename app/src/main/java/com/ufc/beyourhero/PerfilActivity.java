package com.ufc.beyourhero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.ufc.beyourhero.adapter.CondecoracoesAdapter;
import com.ufc.beyourhero.adapter.PostagensAdapter;

import java.util.ArrayList;

public class PerfilActivity extends AppCompatActivity {

    ListView postList;
    RecyclerView condecoracoesList;
    ArrayList<String> postagens = new ArrayList<String>();
    ArrayList<String> condecoracoes = new ArrayList<String>();
    PostagensAdapter postagensAdapter;
    CondecoracoesAdapter  condecoracoesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        postList = findViewById(R.id.perfil_postagens);
        condecoracoesList = findViewById(R.id.codecoracoes_list);

        postagens.add("Postagem-1");
        postagens.add("Postagem-2");

        condecoracoes.add("c1");
        condecoracoes.add("c2");
        condecoracoes.add("c3");
        condecoracoes.add("c4");
        condecoracoes.add("c5");
        condecoracoes.add("c6");


        postagensAdapter = new PostagensAdapter(this,R.layout.postagem,postagens);
        postList.setAdapter(postagensAdapter);



        condecoracoesAdapter = new CondecoracoesAdapter(condecoracoes);
        condecoracoesList.setAdapter(condecoracoesAdapter);
    }
}