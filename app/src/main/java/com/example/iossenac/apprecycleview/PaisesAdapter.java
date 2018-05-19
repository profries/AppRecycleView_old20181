package com.example.iossenac.apprecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PaisesAdapter extends RecyclerView.Adapter<PaisesAdapter.ViewHolder>
{
    private List<String> listaPaises;

    public PaisesAdapter(List<String> listaPaises) {
        this.listaPaises = listaPaises;
    }

    @Override
    public PaisesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.list_item_paises,parent,false );
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PaisesAdapter.ViewHolder holder, final int position) {
        holder.textView.setText(listaPaises.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),
                        listaPaises.get(position)+" selecionado",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaPaises.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ViewHolder(View view) {
            super(view);
            this.textView = view.findViewById(R.id.textPais);
        }
    }
}
