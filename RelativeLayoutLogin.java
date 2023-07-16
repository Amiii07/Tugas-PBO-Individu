package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication1.RegisterRelative;

public class RelativeLayoutLogin extends AppCompatActivity {
    EditText username, password;
    Button login;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout_login);
        username = (EditText) findViewById(R.id.txt_username);
        password = (EditText) findViewById(R.id.txt_password);
        login = (Button) findViewById(R.id.button);
        signup = (TextView) findViewById(R.id.signup_reg);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equalsIgnoreCase("danu")
                        && password.getText().toString().equalsIgnoreCase("danu")){
                    Toast.makeText(RelativeLayoutLogin.this,
                            "Anda Berhasil Login", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(RelativeLayoutLogin.this,
                            "Username / Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(RelativeLayoutLogin.this, RegisterRelative.class);
                startActivity(register);
                finish();
            }
        });
    }
}