package com.rojas.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rojas.practica3.view.ContainerActivity2;
import com.rojas.practica3.view.CreateAccountActivity2;

public class LoginActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }
    public void goCreateAcoount(View viem){
        Intent intent = new Intent(this, CreateAccountActivity2.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent =new Intent(this, ContainerActivity2.class);
        startActivity(intent);
    }
}
