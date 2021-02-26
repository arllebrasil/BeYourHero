package com.ufc.beyourhero.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ufc.beyourhero.R;
import java.util.List;

public class CondecoracoesAdapter extends RecyclerView.Adapter<CondecoracoesAdapter.CondecoracaoHolder> {

    private List<String> localDataSet;

    public class CondecoracaoHolder extends RecyclerView.ViewHolder {
        private TextView sig;
        private CardView mainCard;

        public CondecoracaoHolder(View view) {

            super(view);

            mainCard = (CardView)  view;
            sig = (TextView) view.findViewById(R.id.ass);
        }

        public CardView getMainCard(){ return mainCard; }
        public TextView getTextView() {
            return sig;
        }
    }
    public CondecoracoesAdapter(List<String> dataSet) {
        localDataSet = dataSet;
    }

    @Override
    public CondecoracaoHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_condecoracao, viewGroup, false);
        return new CondecoracaoHolder(view);
    }

    @Override
    public void onBindViewHolder(CondecoracaoHolder viewHolder, final int position) {
        viewHolder.getTextView().setText(localDataSet.get(position));
        viewHolder.getMainCard().setOnClickListener(view -> {
            Toast.makeText(view.getContext(),"Clicked Position"+position,Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}