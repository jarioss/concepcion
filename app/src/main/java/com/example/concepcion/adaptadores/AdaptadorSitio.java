package com.example.concepcion.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.concepcion.R;
import com.example.concepcion.moldes.MoldeSitios;

import java.util.ArrayList;

public class AdaptadorSitio extends RecyclerView.Adapter<AdaptadorSitio.viewHolder> {

    public ArrayList<MoldeSitios> listaSitios;

    public AdaptadorSitio(ArrayList<MoldeSitios> listaSitios) {
        this.listaSitios = listaSitios;
    }

    public AdaptadorSitio.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molde_sitios, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorSitio.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaSitios.get(i));

    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreSitio;
        TextView precioSitio;
        ImageView fotoSitio;

        public viewHolder(View item) {
            super(item);
            fotoSitio = item.findViewById(R.id.fotomoldesitio);
            nombreSitio = item.findViewById(R.id.titulomoldesitio);
            precioSitio = item.findViewById(R.id.preciositio);
        }

        public void actualizarDatos(MoldeSitios moldeSitios){
            fotoSitio.setImageResource(moldeSitios.getFoto());
            nombreSitio.setText(moldeSitios.getNombre());
            precioSitio.setText(moldeSitios.getPrecios());
        }

    }
}
