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
        listaHoteles.add(new MoldeHotel("Hotel 1", "descripción" ,"250000", R.drawable.hotel01));
        listaHoteles.add(new MoldeHotel("Hotel 2", "descripción" ,"250000", R.drawable.hotel01));
        listaHoteles.add(new MoldeHotel("Hotel 3", "descripción" ,"250000", R.drawable.hotel01));
        listaHoteles.add(new MoldeHotel("Hotel 4", "descripción" ,"250000", R.drawable.hotel01));
        listaHoteles.add(new MoldeHotel("Hotel 5", "descripción" ,"250000", R.drawable.hotel01));
    }
}