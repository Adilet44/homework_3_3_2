package com.example.homework_3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> AnimalList;
    private AnimalsAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_animals);
        loadAnimal();
        adapter = new AnimalsAdapter(AnimalList);
        recyclerView.setAdapter(adapter);
    }

    private void loadAnimal() {
        AnimalList = new ArrayList<>();
        AnimalList.add("Cat");
        AnimalList.add("Dog");
        AnimalList.add("Fox");
        AnimalList.add("crocodile");
        AnimalList.add("deer ");
        AnimalList.add("elephant ");
        AnimalList.add("giraffe ");
        AnimalList.add("hippopotamus ");
        AnimalList.add("lion ");
        AnimalList.add("mongoose ");

    }
}