package com.example.controllers;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.TextView;

public class segunda extends AppCompatActivity {

    TextView    txtUserReq,txtPassReq;
    ConstraintLayout  content2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        content2    =   (ConstraintLayout)findViewById(R.id.Content2);
        content2.setBackgroundColor(Color.rgb(10,199,241));

        txtUserReq  =   (TextView)findViewById(R.id.textWelcome);
        txtUserReq.setTextColor(Color.DKGRAY);


        Bundle  bundle  =   this.getIntent().getExtras();
       // String nameUser = new String((String) bundle.get("Name"));

        txtUserReq.setText("Bienvenido:" + " " +bundle.get("Name"));
/*
        txtUserReq =   (TextView)findViewById(R.id.textResult);
        txtPassReq =    (TextView)findViewById(R.id.txtPassRequest);
        //Datos almacenados de usuarios
        String nameUserBD   =   "Albert";
        String passUserBD   =   "Alberto.23";
        //Nuevas variables para alamacenar los datos obtenidos de primer activitie
        String nameUserRequest;
        */

        //
        /*
        Bundle bulto    =   this.getIntent().getExtras();
        String  nombre  =   bulto.getString("Usuario");
        String  pass    =   bulto.getString("Password");
*/
        /*
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
    */
    }

}
