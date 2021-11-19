package com.example.pruebaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email =  findViewById(R.id.editTextEmail_LogIn);
        password = findViewById(R.id.editTextPassword_LogIn);
    }

    public void onClickLogIn(View view) {
        String emailString = email.getText().toString(), passwordString = password.getText().toString();
    }

    public void onClickRegister(View view) {
        Intent changeRegister = new Intent(this, RegisterActivity.class);
        startActivity(changeRegister);
    }
}