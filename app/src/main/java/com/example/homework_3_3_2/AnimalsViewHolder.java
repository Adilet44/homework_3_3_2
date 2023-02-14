package com.example.homework_3_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvAnimals;

    public AnimalsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvAnimals = itemView.findViewById(R.id.tv_animal);

    }
    void bind(String animal){
        tvAnimals.setText(animal);
    }
}
