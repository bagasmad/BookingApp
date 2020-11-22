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

public class BookingActivity extends AppCompatActivity {
    TextView waktuMasuk;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        waktuMasuk = (TextView) findViewById(R.id.BookingWaktuMasuk);
        context = this;
        waktuMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_booking);
                dialog.show();
                Button button = (Button)dialog.findViewById(R.id.button10);
            }
        });
//        final TextView period1Text = (TextView) findViewById(R.id.Period1TextView);
//        period1Text.setTextColor(Color.parseColor("#000000"));
//        final TextView period3Text = (TextView) findViewById(R.id.Period3TextView);
//        period3Text.setTextColor(Color.parseColor("#000000"));
    }
//    public void openDialog(){
//        BookingDialog exampleDialog = new BookingDialog();
//        exampleDialog.show(getSupportFragmentManager(), "booking dialog");
//    }

}
