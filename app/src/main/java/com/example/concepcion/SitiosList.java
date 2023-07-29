package com.example.concepcion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concepcion.adaptadores.AdaptadorSitio;
import com.example.concepcion.moldes.MoldeSitios;

import java.util.ArrayList;

public class SitiosList extends AppCompatActivity {


    ArrayList<MoldeSitios> listaSitios = new ArrayList<>();
    RecyclerView recyclerSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_list);
        recyclerSitios = findViewById(R.id.listasitiosdinamicos);
        recyclerSitios.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearLista();
        AdaptadorSitio adaptador = new AdaptadorSitio(listaSitios);
        recyclerSitios.setAdapter(adaptador);
    }

    public void crearLista(){
        listaSitios.add(new MoldeSitios("Páramo del Sol", "450000", R.drawable.paramosol));
        listaSitios.add(new MoldeSitios("Isla Paraíso", "1500000", R.drawable.polynesia));
        listaSitios.add(new MoldeSitios("Concepción", "120000" , R.drawable.concepcion));
        listaSitios.add(new MoldeSitios("Jardín", "150000" , R.drawable.jardin));
        listaSitios.add(new MoldeSitios("Medellín", "80000" , R.drawable.metroclabel));
    }
}