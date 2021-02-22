package com.smkthp.api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LaporanTerbaru extends AppCompatActivity {

    TextView tvdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan_terbaru);

        tvdetail = findViewById(R.id.to_detail);

        tvdetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LaporanTerbaru.this, DetailLaporan.class);
                startActivity(intent);
            }
        });


    }
}