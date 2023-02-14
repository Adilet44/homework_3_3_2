package com.example.homework_3_3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsViewHolder> {

    private ArrayList<String> animalList;

    public AnimalsAdapter(ArrayList<String> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public AnimalsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalsViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_animals,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalsViewHolder holder, int position) {
       holder.bind(animalList.get(position));
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
