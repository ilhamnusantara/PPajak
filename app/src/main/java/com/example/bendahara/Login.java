package com.example.bendahara;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity{

    private EditText username, passwword;
    private Button login;

    public String user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        passwword = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = username.getText().toString();
                pass = passwword.getText().toString();
                if (user.equals("admin")){
                    if (pass.equals("admin")){
                        openPage2();
                    }
                }
            }
        });
    }

    private void openPage2() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
