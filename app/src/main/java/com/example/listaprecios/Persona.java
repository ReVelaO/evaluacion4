package com.example.listaprecios;

public class Persona {
    private int Id;
    private String Usuario;
    private String Contrasena;

    public Persona() {
        this.Id = -1;
        this.Usuario = "Sin Nombre";
        this.Contrasena = "Sin Contraseña";
    }

    public Persona(int id, String usuario, String contrasena) {
        this.Id = id;
        this.Usuario = usuario;
        this.Contrasena = contrasena;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) { Id = id; }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }
}
