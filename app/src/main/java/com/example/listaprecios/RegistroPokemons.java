package com.example.listaprecios;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegistroPokemons extends AppCompatActivity {

    private EditText oVisName;
    private EditText oVisHP;
    private EditText oVisATK;
    private EditText oVisDEF;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_pokemons);

        oVisName = findViewById(R.id.idVisName);
        oVisHP = findViewById(R.id.idVisHP);
        oVisATK = findViewById(R.id.idVisATK);
        oVisDEF = findViewById(R.id.idVisDEF);

    }

    public void Añadir(View v)
    {
        Pokemon pokemon = new Pokemon();
        pokemon.setNombre(oVisName.getText().toString());
        pokemon.setVida(Integer.parseInt(oVisHP.getText().toString()));
        pokemon.setAtaque(Integer.parseInt(oVisATK.getText().toString()));
        pokemon.setDefensa(Integer.parseInt(oVisDEF.getText().toString()));

        MainActivity.aPokemons.add(pokemon);
        Toast.makeText(getApplicationContext(), "Se agregó " + pokemon.getNombre(), Toast.LENGTH_SHORT).show();
        onBackPressed();
    }
}
