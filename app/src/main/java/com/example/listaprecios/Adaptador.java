package com.example.listaprecios;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderAdaptador> {

    ArrayList<Pokemon> aProductos;

    public Adaptador(ArrayList<Pokemon> aProductos) {
        this.aProductos = aProductos;
    }

    @NonNull
    @Override
    public ViewHolderAdaptador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vw = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adatador,null,false);
        return new ViewHolderAdaptador(vw);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdaptador holder, int position) {
        holder.asignarDatos(aProductos.get(position));
    }

    @Override
    public int getItemCount() {
        return aProductos.size();
    }

    public class ViewHolderAdaptador extends RecyclerView.ViewHolder {

        TextView tv;
        TextView tv2;
        TextView tv3;
        TextView tv4;
        TextView tv5;

        public ViewHolderAdaptador(@NonNull View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.idTextViewAdaptador);
            tv2 = (TextView) itemView.findViewById(R.id.idTextViewAdaptador2);
            tv3 = (TextView) itemView.findViewById(R.id.idTextViewAdaptador3);
            tv4 = (TextView) itemView.findViewById(R.id.idTextViewAdaptador4);
            tv5 = (TextView) itemView.findViewById(R.id.idTextViewAdaptador5);
        }

        public void asignarDatos(Pokemon producto) {
            tv.setText("Nombre Pokémon: " + producto.getNombre());
            tv2.setText("Vida: " + producto.getVida());
            tv3.setText("Ataque: " + producto.getAtaque());
            tv4.setText("Defensa: " + producto.getDefensa());
            tv5.setText("Total Capturados: " + getCountOfPokemon(producto.getNombre()));
        }

        public int getCountOfPokemon(String nombre)
        {
            int count = 0;
            for (Pokemon p : MainActivity.aPokemons)
            {
                if (nombre.equalsIgnoreCase(p.getNombre()))
                {
                    count++;
                }
            }
            return count;
        }
    }
}
