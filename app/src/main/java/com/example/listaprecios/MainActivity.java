package com.example.listaprecios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Pokemon> aPokemons;

    private Button oRegistro1;
    private Button oRegistro2;
    private Button oRegistro3;
    private Button oLoginButton;
    private EditText oUserLogin;
    private EditText oPassLogin;
    private Persona oUsuario;

    public static boolean IsRegistryCompleted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aPokemons = new ArrayList<>();

        oLoginButton = findViewById(R.id.idLogin);
        oRegistro1 = findViewById(R.id.idRegistro1);
        oRegistro2 = findViewById(R.id.idAgregarLista);
        oRegistro3 = findViewById(R.id.button2);

        oUserLogin = findViewById(R.id.idUserLogin);
        oPassLogin = findViewById(R.id.idPassLogin);

        oRegistro2.setEnabled(false);
        oRegistro3.setEnabled(false);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (IsRegistryCompleted)
        {
            IsRegistryCompleted = false;
            Toast.makeText(getApplicationContext(), "El usuario ha sido creado.", Toast.LENGTH_SHORT).show();
        }
    }

    public void LoguearUsuario(View v)
    {
        String currentUser = oUserLogin.getText().toString();
        String currentPass = oPassLogin.getText().toString();

        if (RegistroUsuarios.oUsuarios == null)
        {
            Toast.makeText(getApplicationContext(), "Aun no existe ningun usuario registrado", Toast.LENGTH_SHORT).show();
            return;
        }

        for (Persona p : RegistroUsuarios.oUsuarios)
        {
            String user = p.getUsuario();
            String pass = p.getContrasena();

            if (currentUser.equalsIgnoreCase(user) && currentPass.equalsIgnoreCase(pass))
            {
                //como estamos logueados, devolvemos el objeto para obtener todos los datos del usuario, id, user, pass.
                this.oUsuario = p;
                oLoginButton.setEnabled(false);
                oRegistro2.setEnabled(true);
                oRegistro3.setEnabled(true);
                Toast.makeText(getApplicationContext(), "Se ha iniciado sesion en el usuario " + user, Toast.LENGTH_SHORT).show();
                return;
            }
        }

        Toast.makeText(getApplicationContext(), "El usuario ingresado no existe o la contraseña no es valida", Toast.LENGTH_SHORT).show();
    }

    public void RegistroUsuario(View v)
    {
        Intent intento = new Intent(getApplicationContext(), RegistroUsuarios.class);
        startActivity(intento);
    }

    public void RegistroAves(View v)
    {
        Intent intento = new Intent(getApplicationContext(), RegistroPokemons.class);
        startActivity(intento);
    }

    public void MisAvistamientos(View v)
    {
        Intent intento = new Intent(getApplicationContext(), SecondActivity.class);
        intento.putExtra("aavistamientos", aPokemons);
        startActivity(intento);
    }
}