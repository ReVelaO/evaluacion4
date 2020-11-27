package com.example.listaprecios;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String Nombre;
    private int Vida;
    private int Ataque;
    private int Defensa;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int defensa) {
        Defensa = defensa;
    }

    public Pokemon() {
        this.Nombre = "Sin Nombre";
        this.Vida = 1;
        this.Ataque = 1;
        this.Defensa = 1;
    }

    public Pokemon(String nombre, int vida, int ataque, int defensa) {
        this.Nombre = nombre;
        this.Vida = vida;
        this.Ataque = ataque;
        this.Defensa = defensa;
    }
}
