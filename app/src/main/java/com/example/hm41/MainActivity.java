package com.example.hm41;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private ArrayList<Model> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecycler();
        loadData();
    }

    private void initRecycler() {
        recycler = findViewById(R.id.recycler);
        Adapter adapter = new Adapter(data);
        recycler.setAdapter(adapter);

    }
    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model(R.drawable.img_1,"C"));
        data.add(new Model(R.drawable.img_2,"C++"));
        data.add(new Model(R.drawable.img_3,"Java"));
        data.add(new Model(R.drawable.img,"Android"));
        data.add(new Model(R.drawable.img_4,"Kotlin"));
        data.add(new Model(R.drawable.img_5,"HTML"));
    }
}