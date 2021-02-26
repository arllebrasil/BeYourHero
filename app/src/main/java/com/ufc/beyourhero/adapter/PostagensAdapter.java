package com.ufc.beyourhero.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.ufc.beyourhero.MainActivity;
import com.ufc.beyourhero.PerfilActivity;
import com.ufc.beyourhero.R;
import java.util.List;

public class PostagensAdapter extends ArrayAdapter<String> {
    private int mLayout;

    public PostagensAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        mLayout = resource;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View postagem = inflater.inflate(mLayout,parent,false);
        TextView ouner = postagem.findViewById(R.id.poster_pessoa);
        ouner.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), PerfilActivity.class);
            getContext().startActivity(intent);
        });
//        View view =
        return postagem;
    }
}
