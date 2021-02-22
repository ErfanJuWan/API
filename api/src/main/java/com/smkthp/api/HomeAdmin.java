package com.smkthp.api;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class HomeAdmin extends Fragment {

    LinearLayout lterbaru, lselesi;

    public HomeAdmin() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_home_admin, container, false);

        lterbaru = v.findViewById(R.id.inlaporanterbaru);
        lselesi = v.findViewById(R.id.inlaporanselesai);

        lterbaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LaporanTerbaru.class));
            }
        });

        lselesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LaporanSelesai.class));
            }
        });

        return v;
    }

}