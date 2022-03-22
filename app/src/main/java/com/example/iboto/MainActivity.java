package com.example.iboto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sign_in = findViewById(R.id.btnsignIn);
    }

    public void signIn(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}