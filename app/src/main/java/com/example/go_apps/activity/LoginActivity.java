package com.example.go_apps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.go_apps.R;

public class LoginActivity extends AppCompatActivity {

    ImageButton login;
    EditText username, password;
    protected void onCreate(Bundle saveIntanceState) {
        super.onCreate(saveIntanceState);

        setContentView(R.layout.login_relative);

        login = (ImageButton) findViewById(R.id.btnLogin);
        username =(EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById((R.id.etPassword));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().toUpperCase().equals("F1234")){
                    login_sukses();
                } else {
                    Toast.makeText(getApplicationContext(),"salah Password",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("username",user_login);
        startActivity(i);
    }
}
