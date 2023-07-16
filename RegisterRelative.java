package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterRelative extends AppCompatActivity {
    Button masukregister, pindahkelogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_relative);
        masukregister = (Button) findViewById(R.id.buttonregister);
        pindahkelogin = (Button) findViewById(R.id.buttonlogin);
        masukregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterRelative.this,
                        "Selamat Anda Sudah Berhasil Mendaftarkan akun", Toast.LENGTH_SHORT).show();
            }
        });
        pindahkelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahaja = new Intent(RegisterRelative.this, com.example.myapplication1.RelativeLayoutLogin.class);
                startActivity(pindahaja);
            }
        });
    }
}