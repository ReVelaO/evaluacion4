package com.example.listaprecios;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ArrayList<Pokemon> aProductos = new ArrayList<Pokemon>();
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        aProductos = (ArrayList<Pokemon>) getIntent().getSerializableExtra("aavistamientos");

        rv = findViewById(R.id.idRecyclerView);
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        Adaptador adp = new Adaptador(aProductos);

        rv.setAdapter(adp);
    }
}
