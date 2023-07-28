package com.example.concepcion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concepcion.adaptadores.AdaptadorRestau;
import com.example.concepcion.moldes.MoldeRestau;

import java.util.ArrayList;

public class RestaurantList extends AppCompatActivity {

    ArrayList<MoldeRestau> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerRestau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);
        recyclerRestau = findViewById(R.id.listarestaurantesdinamica);
        recyclerRestau.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearLista();
        AdaptadorRestau adaptador = new AdaptadorRestau(listaRestaurantes);
        recyclerRestau.setAdapter(adaptador);
    }

    public void crearLista(){
        listaRestaurantes.add(new MoldeRestau("El Corrientazo", "Bocachico" ,"35000", R.drawable.pescado));
        listaRestaurantes.add(new MoldeRestau("Deja y sobra", "Sancocho Criollo" ,"25000", R.drawable.sancocho));
        listaRestaurantes.add(new MoldeRestau("La Curva del Gordo", "Tacos Castilla" ,"28000", R.drawable.tacos));
        listaRestaurantes.add(new MoldeRestau("Doña Ruby", "Desayuno fitness" ,"15000", R.drawable.desayuno));
        listaRestaurantes.add(new MoldeRestau("Coma y me deja", "Carbonara" ,"30000", R.drawable.carbonara));
    }
}