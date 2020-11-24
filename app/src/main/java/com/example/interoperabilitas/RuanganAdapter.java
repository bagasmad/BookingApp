package com.example.interoperabilitas;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class RuanganAdapter extends RecyclerView.Adapter<RuanganAdapter.MyViewHolder> {
    private ArrayList<Ruangan> ruangann;
    OnRoomListener monRoomListener;

    public RuanganAdapter(ArrayList<Ruangan> ruangann, OnRoomListener onRoomListener) {
        this.ruangann = ruangann;
        this.monRoomListener = onRoomListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rooms, parent, false);
        return new MyViewHolder(itemView, monRoomListener);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.namaRuangan.setText(ruangann.get(position).getNamaRuangan());
        Log.d("ruangan", ruangann.get(position).getKapasitasRuangan().toString());
        holder.kapasitasRuangan.setText("Capacity: "+ruangann.get(position).getKapasitasRuangan().toString());
        holder.hargaRuangan.setText("Rp"+ ruangann.get(position).getHargaRuangan().toString()+" per jam");
        ImageDownloader downloader = new ImageDownloader();
        Bitmap gambarBitmap;
        try {
            gambarBitmap=downloader.execute(ruangann.get(position).getUrlGambarRuangan()).get();
            holder.gambarRuangan.setImageBitmap(gambarBitmap);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return (ruangann != null)?ruangann.size():0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView namaRuangan, kapasitasRuangan, hargaRuangan;
        private ImageView gambarRuangan;
        OnRoomListener onRoomListener;

        public MyViewHolder(final View view, OnRoomListener onRoomListener){
            super(view);
            namaRuangan = (TextView)view.findViewById(R.id.NamaRuanganTextView);
            kapasitasRuangan = (TextView)view.findViewById(R.id.CapacityTextView);
            hargaRuangan = (TextView) view.findViewById(R.id.HargaRuanganTextView);
            gambarRuangan = (ImageView) view.findViewById(R.id.RuanganImageView);
            this.onRoomListener = onRoomListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onRoomListener.OnRoomClick(getAdapterPosition());
        }
    }

    public interface OnRoomListener{
        void OnRoomClick(int position);
    }
}
