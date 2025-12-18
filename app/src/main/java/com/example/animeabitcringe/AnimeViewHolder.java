package com.example.animeabitcringe;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class AnimeViewHolder extends RecyclerView.ViewHolder {
    TextView tvAnime;
    public AnimeViewHolder(@NonNull View itemView) {
        super(itemView);

        tvAnime = itemView.findViewById(R.id.tv_anime);
    }


    public void bind (String move){
        tvAnime.setText(move);
    }
}

