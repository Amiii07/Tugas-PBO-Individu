package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {

    TextView username;
    TextView password;
    Button login;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        username = (TextView) findViewById(R.id.txt_username);
        password = (TextView) findViewById(R.id.txt_password);
        login = (Button) findViewById(R.id.button_login);
        signup =(TextView) findViewById(R.id.signup_reg);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equalsIgnoreCase("dimas")
                        && password.getText().toString().equalsIgnoreCase("dimas")){
                    Toast.makeText(LoginActivity.this,
                            "Anda Berhasil Login", Toast.LENGTH_SHORT).show();
                }else Toast.makeText(LoginActivity.this,
                        "username atau Password Anda Salah", Toast.LENGTH_SHORT).show();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(register);
            }
        });
    }
}