package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {
    EditText nama, alamat;
    Button tampilkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        tampilkan = (Button) findViewById(R.id.btntampilkan);
        nama = (EditText) findViewById(R.id.edtnama);
        alamat = (EditText) findViewById(R.id.edtalamat);
        hasil = (TextView) findViewById(R.id.txthasil);

        tampilkan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                hasil.setText("Halo Nama Saya " + nama.getText().toString()
                        + " dan saya tinggal di " + alamat.getText().toString());
            }
        });
    }
}