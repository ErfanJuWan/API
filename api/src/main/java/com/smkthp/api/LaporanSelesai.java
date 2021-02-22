package com.smkthp.api;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class LaporanSelesai extends AppCompatActivity {
    Dialog mydialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan_selesai);
        mydialog = new Dialog(this);
    }

    public void detallaporan(View view) {

        mydialog.setContentView(R.layout.custompopuppelapor);

        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();

    }
}