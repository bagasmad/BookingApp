package com.example.interoperabilitas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookingDialog extends AppCompatDialogFragment {
    Button buttontime10;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_booking, null);
        builder.setView(view)
                .setTitle("Pilih Waktu Masuk")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        String username = editTextUsername.getText().toString();
//                        String password = editTextPassword.getText().toString();
//                        listener.applyTexts(username, password);
                    }
                });
        return builder.create();
//        buttontime10 = (Button) view.findViewById(R.id.button10);

    }
}
