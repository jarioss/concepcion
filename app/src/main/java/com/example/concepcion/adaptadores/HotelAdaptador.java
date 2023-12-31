package com.example.concepcion.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.concepcion.R;
import com.example.concepcion.moldes.MoldeHotel;

import java.util.ArrayList;

public class HotelAdaptador extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {

    //ATRIBUTOS
    public ArrayList<MoldeHotel> listaHoteles;

    //CONSTRUCTOR

    public HotelAdaptador(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molde_hotel, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaHoteles.get(i));

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreHotel;
        TextView descHotel;
        TextView precioHotel;
        ImageView fotoHotel;

        public viewHolder(View item){
            super(item);
            fotoHotel = item.findViewById(R.id.fotoitem);
            nombreHotel = item.findViewById(R.id.nombrehotel);
            descHotel = item.findViewById(R.id.deschotellistitem);
            precioHotel = item.findViewById(R.id.preciohotelitem);
        }

        public void actualizarDatos(MoldeHotel moldeHotel){
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            descHotel.setText(moldeHotel.getDesc());
            precioHotel.setText(moldeHotel.getPrecios());
        }

    }
}

