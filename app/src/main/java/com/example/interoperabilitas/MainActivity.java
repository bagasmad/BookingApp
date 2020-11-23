package com.example.interoperabilitas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;


public class MainActivity extends AppCompatActivity {
    public static ArrayList<Ruangan> ruangans = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String url = "http://10.0.2.2/API/api/post/read.php";
        new AsyncHttpClient().get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                final String stringJSON = new String(responseBody);
                Log.i("response", stringJSON);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        TextView textView = findViewById(R.id.textView);
                        textView.setText(stringJSON);
                    }
                });
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("error", "Error dalam retrieve JSON");
                error.printStackTrace();

            }
        });

        ArrayList<InfoBooking> infoBooking1 = new ArrayList<>();
        infoBooking1.add(new InfoBooking(1,10,13,2020,10,19));
        infoBooking1.add(new InfoBooking(2,14,15,2020,10,19));
        infoBooking1.add(new InfoBooking(3,17,18,2020,10,20));

        ArrayList<InfoBooking> infoBooking2 = new ArrayList<>();
        infoBooking2.add(new InfoBooking(1,10,13,2020,10,19));
        infoBooking2.add(new InfoBooking(2,11,13,2020,10,21));
        infoBooking2.add(new InfoBooking(3,14,17,2020,10,20));


       ruangans.add(new Ruangan(1,"Ruang Enak Banget Gaada Otak","Waduh sumpah enak banget deh ruangannya bego banget yang gak mau mesen.",
               "Gedung DTETI lantai 420", "https://images.unsplash.com/photo-1497366754035-f200968a6e72?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80",
               100000,9, infoBooking1));

        ruangans.add(new Ruangan(2,"Ruang Test Kedua","Ini ruangan test buat item kedua, semoga berhasil deh aku udah bingung.",
                "Gedung DTETI lantai 69", "https://images.unsplash.com/photo-1533090161767-e6ffed986c88?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80",
                150000, 10, infoBooking2));
    }

    public void display(View view)
    {
        Intent intent = new Intent(this,DisplayActivity.class);
        startActivity(intent);
    }
}
