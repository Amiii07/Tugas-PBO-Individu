package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pindah1, pindah2, pindah3, pindah4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pindah1 = findViewById(R.id.pindahhalaman);
        pindah2 = findViewById(R.id.pindahrelative);
        pindah3 = findViewById(R.id.pindahlogin);
        pindah4 = findViewById(R.id.pindahlist);
        pindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berpindah2 = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(berpindah2);
            }
        });
        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berpindah3 = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(berpindah3);
            }
        });
        pindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berpindah4 = new Intent(MainActivity.this, com.example.myapplication1.RelativeLayoutLogin.class);
                startActivity(berpindah4);
            }
        });
        pindah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent berpindah5 = new Intent(MainActivity.this, ListViewData.class);
                startActivity(berpindah5);
            }
        });
    }
}