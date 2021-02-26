package com.ufc.beyourhero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.ufc.beyourhero.adapter.PostagensAdapter;

import java.util.ArrayList;

public class FeedActivity extends AppCompatActivity {

    ListView friendsPostList,indicatePostList;
    ArrayList<String> postagens = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        postagens.add("Postagem-1");
        postagens.add("Postagem-2");

        friendsPostList = findViewById(R.id.friends_post_list);
        indicatePostList = findViewById(R.id.indicate_post_list);

        PostagensAdapter postagensAdapter = new PostagensAdapter(this,R.layout.postagem,postagens);
        friendsPostList.setAdapter(postagensAdapter);
        indicatePostList.setAdapter(postagensAdapter);
    }
}