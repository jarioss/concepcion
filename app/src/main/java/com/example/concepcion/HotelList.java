package com.example.concepcion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concepcion.adaptadores.HotelAdaptador;
import com.example.concepcion.moldes.MoldeHotel;

import java.util.ArrayList;

public class HotelList extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles = new ArrayList<>();
    RecyclerView recyclerHoteles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);
        recyclerHoteles = findViewById(R.id.listahotelesdinamica);
        recyclerHoteles.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearLista();
        HotelAdaptador adaptador = new HotelAdaptador(listaHoteles);
        recyclerHoteles.setAdapter(adaptador);
    }

    public void crearLista(){
        listaHoteles.add(new MoldeHotel("Hotel El Pulguero", "Una experiencia inigualable con la mejor compañia entre amigos" ,"50000", R.drawable.hostal));
        listaHoteles.add(new MoldeHotel("Hotel El Veraniego", "La mejor piscina junto al mar" ,"250000", R.drawable.hotelpiscina));
        listaHoteles.add(new MoldeHotel("Hotel Cabaña Embrujada", "Apenas para descansar del ruido de la ciudad" ,"95000", R.drawable.cabana));
        listaHoteles.add(new MoldeHotel("Glamping El Amorío", "Pasa una estancia romantica a lado de tu amor" ,"560000", R.drawable.glamping));
        listaHoteles.add(new MoldeHotel("Suite Doble", "Ideal para descansar en tus viajes de negocio" ,"100000", R.drawable.camadoble));
    }
}