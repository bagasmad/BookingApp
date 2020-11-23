package com.example.interoperabilitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Ruangan ruanganTerpilih = MainActivity.ruangans.get(0);
        TextView judulRuangan = findViewById(R.id.DisplayTextView);
        TextView deskripsiRuangan = findViewById(R.id.DisplayDeskripsiTextView);
        TextView kapasitasRuangan = findViewById(R.id.DisplayKapasitasRuangTextView);
        TextView hargaRuangan = findViewById(R.id.DisplayHargaTextView);
        TextView lokasiRuangan = findViewById(R.id.DisplayLokasiTextView);
        judulRuangan.setText(ruanganTerpilih.getNamaRuangan());
        deskripsiRuangan.setText(ruanganTerpilih.getDeskripsiRuangan());
        kapasitasRuangan.setText(ruanganTerpilih.getKapasitasRuangan().toString() + " orang");
        hargaRuangan.setText(ruanganTerpilih.getHargaRuangan().toString());
        lokasiRuangan.setText(ruanganTerpilih.getLokasiRuangan());

    }

    public void booking(View view)
    {
        Intent intent = new Intent(this, BookingActivity.class);
        startActivity(intent);
    }
}
