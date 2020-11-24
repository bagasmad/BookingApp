package com.example.interoperabilitas;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class DisplayActivity extends AppCompatActivity {
    int roomNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        this.roomNumber = getIntent().getIntExtra("POSITION", 0);
        Ruangan ruanganTerpilih = MainActivity.ruangans.get(roomNumber);
        TextView judulRuangan = findViewById(R.id.DisplayTextView);
        TextView deskripsiRuangan = findViewById(R.id.DisplayDeskripsiTextView);
        TextView kapasitasRuangan = findViewById(R.id.DisplayKapasitasRuangTextView);
        TextView hargaRuangan = findViewById(R.id.DisplayHargaTextView);
        TextView lokasiRuangan = findViewById(R.id.DisplayLokasiTextView);
        ImageView imageView = findViewById(R.id.DisplayImageView);
        judulRuangan.setText(ruanganTerpilih.getNamaRuangan());
        deskripsiRuangan.setText(ruanganTerpilih.getDeskripsiRuangan());
        kapasitasRuangan.setText(ruanganTerpilih.getKapasitasRuangan().toString() + " orang");
        hargaRuangan.setText("Rp"+ruanganTerpilih.getHargaRuangan().toString()+ " per jam");
        lokasiRuangan.setText(ruanganTerpilih.getLokasiRuangan());
        ImageDownloader task = new ImageDownloader();
        try {
            Bitmap image = task.execute(ruanganTerpilih.getUrlGambarRuangan()).get();
            imageView.setImageBitmap(image);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void booking(View view)
    {
        Intent intent = new Intent(this, BookingActivity.class).putExtra("POSITION", roomNumber);
        startActivity(intent);
    }
}
