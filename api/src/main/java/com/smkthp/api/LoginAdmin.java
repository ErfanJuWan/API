package com.smkthp.api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);


    }

    public void inmenu(View view) {

        Intent intent = new Intent(LoginAdmin.this, MainActivity.class);
        startActivity(intent);

    }
}