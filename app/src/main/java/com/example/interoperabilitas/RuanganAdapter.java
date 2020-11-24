package com.example.interoperabilitas;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RuanganAdapter extends RecyclerView.Adapter<RuanganAdapter.MyViewHolder> {
    private ArrayList<Ruangan> ruangann;

    public RuanganAdapter(ArrayList<Ruangan> ruangann) {
        this.ruangann = ruangann;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rooms, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.namaRuangan.setText(ruangann.get(position).getNamaRuangan());
        holder.kapasitasRuangan.setText(ruangann.get(position).getKapasitasRuangan());
        holder.hargaRuangan.setText("Rp"+Integer.toString(ruangann.get(position).getHargaRuangan()));
        holder.urlGambarRuangan.setImageResource(R.drawable.templateoffice);
    }

    @Override
    public int getItemCount() {
        return (ruangann != null)?ruangann.size():0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView namaRuangan, kapasitasRuangan, hargaRuangan;
        private ImageView urlGambarRuangan;

        public MyViewHolder(final View view){
            super(view);
            namaRuangan = (TextView)view.findViewById(R.id.NamaRuanganTextView);
            kapasitasRuangan = (TextView)view.findViewById(R.id.CapacityTextView);
            hargaRuangan = (TextView) view.findViewById(R.id.HargaRuanganTextView);
            urlGambarRuangan = (ImageView) view.findViewById(R.id.RuanganImageView);
        }

    }
}
