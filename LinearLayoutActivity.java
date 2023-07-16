package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);
        Button tampilkan = findViewById(R.id.btntampilkan);
        EditText nama = findViewById(R.id.edtnama);
        EditText alamat = findViewById(R.id.edtalamat);
        TextView hasil = findViewById(R.id.txthasil);

        tampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("Halo Nama Saya " + nama.getText().toString() + " dan Alamat Saya di " + alamat.getText());
            }
        });
    }
}

