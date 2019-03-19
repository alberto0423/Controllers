package com.example.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        TextView    txt = null;

    Bundle bulto    =   this.getIntent().getExtras();
    String  nombre  =   bulto.getString("Usuario");
    String  pass    =   bulto.getString("Password");
    if (nombre  == nombre && pass==pass){
        String  request =   bulto.toString();
        txt.setText(nombre);

    }else {
        Intent intent  =   new Intent(getBaseContext(),tercera.class);
        intent.putExtra("Error",nombre);
        startActivity(intent);
    }
    Log.e("Nombre recibido: "  , nombre);
    }
}
