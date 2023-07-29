package com.example.concepcion.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.concepcion.R;
import com.example.concepcion.moldes.MoldeRestau;

import java.util.ArrayList;

public class AdaptadorRestau extends RecyclerView.Adapter<AdaptadorRestau.viewHolder> {

    public ArrayList<MoldeRestau> listaRestau;

    public AdaptadorRestau(ArrayList<MoldeRestau> listaRestau) {
        this.listaRestau = listaRestau;
    }

    public AdaptadorRestau.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molde_restaurant, null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestau.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestau.get(i));

    }

    @Override
    public int getItemCount() {
        return listaRestau.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreRestau;
        TextView plato;
        TextView precioPlato;
        ImageView fotoPlato;

        public viewHolder(View item) {
            super(item);
            fotoPlato = item.findViewById(R.id.fotomolderesta);
            nombreRestau = item.findViewById(R.id.titulomolderestau);
            plato = item.findViewById(R.id.nombreplato);
            precioPlato = item.findViewById(R.id.precioplato);
        }

        public void actualizarDatos(MoldeRestau moldeRestau){
            fotoPlato.setImageResource(moldeRestau.getFoto());
            nombreRestau.setText(moldeRestau.getNombre());
            plato.setText(moldeRestau.getPlato());
            precioPlato.setText(moldeRestau.getPrecios());
        }

    }
}
