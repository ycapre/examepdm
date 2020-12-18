package com.exame.examepdm.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.exame.examepdm.R;
import com.exame.examepdm.entity.Cachorro;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {


    private List<Cachorro> listaCachorros;
    public Adapter(List<Cachorro> lista) {

        this.listaCachorros = lista;

    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View cachorroLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_cachorro_adapter, parent,false);

        return new MyViewHolder(cachorroLista);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {

        Cachorro cachorro = listaCachorros.get(position);
        holder.cachorro.setText(cachorro.toString());
    }

    @Override
    public int getItemCount() {
        return this.listaCachorros.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView cachorro;

        public MyViewHolder( View itemView) {
            super(itemView);

            cachorro = itemView.findViewById(R.id.txtCachorro);
        }
    }

}
