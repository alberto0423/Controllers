package com.example.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    TextView    txtUserReq,txtPassReq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtUserReq =   (TextView)findViewById(R.id.textResult);
        txtPassReq =    (TextView)findViewById(R.id.txtPassRequest);
        //Datos almacenados de usuarios
        String nameUserBD   =   "Albert";
        String passUserBD   =   "Alberto.23";
        //Nuevas variables para alamacenar los datos obtenidos de primer activitie
        String nameUserRequest;

        //
        Bundle bulto    =   this.getIntent().getExtras();
        String  nombre  =   bulto.getString("Usuario");
        String  pass    =   bulto.getString("Password");

    if (nombre  ==  nameUserBD && pass==passUserBD){
        String  request =   bulto.toString();
        txtUserReq.setText(nombre);
        txtPassReq.setText(pass);
        //txt.setText(nombre);

    }else {
        Intent intent  =   new Intent(getBaseContext(),tercera.class);
        intent.putExtra("Error",nombre);
        startActivity(intent);
    }
    Log.e("Nombre recibido: "  , nombre);
    }
}
