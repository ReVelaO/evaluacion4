package com.example.listaprecios;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RegistroUsuarios extends AppCompatActivity {

    private static int IndexCounter;
    private EditText oRegName1;
    private EditText oRegName2;
    public static ArrayList<Persona> oUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);

        IndexCounter = 0;
        oUsuarios = new ArrayList<>();
        oRegName1 = findViewById(R.id.idRegUser);
        oRegName2 = findViewById(R.id.idRegPass);
    }

    public void Crear(View v)
    {
        //obtenemos un id para identificarlo
        IndexCounter++;
        Persona nueva = new Persona();
        nueva.setId(IndexCounter);
        nueva.setUsuario(oRegName1.getText().toString());
        nueva.setContrasena(oRegName2.getText().toString());
        oUsuarios.add(nueva);
        //avisamos que ya existe el usuario
        MainActivity.IsRegistryCompleted = true;
        //regresamos el usuario al menu principal
        onBackPressed();
    }
}
