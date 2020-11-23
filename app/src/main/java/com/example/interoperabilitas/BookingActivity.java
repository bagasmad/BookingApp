package com.example.interoperabilitas;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class BookingActivity extends AppCompatActivity {
    TextView waktuMasuk;
    TextView waktuSelesai;
//    int masuk = Integer.parseInt(waktuMasuk.getText().toString().substring(0,2));
//    int selesai = Integer.parseInt(waktuSelesai.getText().toString().substring(0,2));
    Context context;

//    public void onDisplay(View v){
//        if(masuk>=selesai){
//            Toast.makeText(BookingActivity.this, "Invalid time format", Toast.LENGTH_SHORT).show();
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        waktuMasuk = (TextView) findViewById(R.id.BookingWaktuMasuk);
        waktuSelesai = (TextView) findViewById(R.id.BookingWaktuSelesai);
        context = this;


        waktuMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_booking);
                dialog.show();
                Button button10 = (Button)dialog.findViewById(R.id.button10);
                Button button11 = (Button)dialog.findViewById(R.id.button11);
                Button button12 = (Button)dialog.findViewById(R.id.button12);
                Button button13 = (Button)dialog.findViewById(R.id.button13);
                Button button14 = (Button)dialog.findViewById(R.id.button14);
                Button button15 = (Button)dialog.findViewById(R.id.button15);
                Button button16 = (Button)dialog.findViewById(R.id.button16);
                Button button17 = (Button)dialog.findViewById(R.id.button17);
                Button button18 = (Button)dialog.findViewById(R.id.button18);
                Button button19 = (Button)dialog.findViewById(R.id.button19);
                Button button20 = (Button)dialog.findViewById(R.id.button20);
                Button button21 = (Button)dialog.findViewById(R.id.button21);
                button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("10:00");
                        dialog.dismiss();
                    }
                });
                button11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("11:00");
                        dialog.dismiss();
                    }
                });
                button12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("12:00");
                        dialog.dismiss();
                    }
                });
                button13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("13:00");
                        dialog.dismiss();
                    }
                });
                button14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("14:00");
                        dialog.dismiss();
                    }
                });
                button15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("15:00");
                        dialog.dismiss();
                    }
                });
                button16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("16:00");
                        dialog.dismiss();
                    }
                });
                button17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("17:00");
                        dialog.dismiss();
                    }
                });
                button18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("18:00");
                        dialog.dismiss();
                    }
                });
                button19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("19:00");
                        dialog.dismiss();
                    }
                });
                button20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("20:00");
                        dialog.dismiss();
                    }
                });
                button21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuMasuk.setText("21:00");
                        dialog.dismiss();
                    }
                });


            }
        });

        waktuSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_booking2);
                dialog.show();
                Button button11 = (Button)dialog.findViewById(R.id.button11);
                Button button12 = (Button)dialog.findViewById(R.id.button12);
                Button button13 = (Button)dialog.findViewById(R.id.button13);
                Button button14 = (Button)dialog.findViewById(R.id.button14);
                Button button15 = (Button)dialog.findViewById(R.id.button15);
                Button button16 = (Button)dialog.findViewById(R.id.button16);
                Button button17 = (Button)dialog.findViewById(R.id.button17);
                Button button18 = (Button)dialog.findViewById(R.id.button18);
                Button button19 = (Button)dialog.findViewById(R.id.button19);
                Button button20 = (Button)dialog.findViewById(R.id.button20);
                Button button21 = (Button)dialog.findViewById(R.id.button21);
                Button button22 = (Button)dialog.findViewById(R.id.button22);

                button11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("11:00");
                        dialog.dismiss();
                    }
                });
                button12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("12:00");
                        dialog.dismiss();
                    }
                });
                button13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("13:00");
                        dialog.dismiss();
                    }
                });
                button14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("14:00");
                        dialog.dismiss();
                    }
                });
                button15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("15:00");
                        dialog.dismiss();
                    }
                });
                button16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("16:00");
                        dialog.dismiss();
                    }
                });
                button17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("17:00");
                        dialog.dismiss();
                    }
                });
                button18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("18:00");
                        dialog.dismiss();
                    }
                });
                button19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("19:00");
                        dialog.dismiss();
                    }
                });
                button20.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("20:00");
                        dialog.dismiss();
                    }
                });
                button21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("21:00");
                        dialog.dismiss();
                    }
                });
                button22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        waktuSelesai.setText("22:00");
                        dialog.dismiss();
                    }
                });

            }
        });
    }
}
