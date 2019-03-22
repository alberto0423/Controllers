package com.example.controllers;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tercera extends AppCompatActivity {
    TextView   txtError ;
    ConstraintLayout    content3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);
        Button      btnBack ;
        txtError    =   (TextView)findViewById(R.id.textError);
        content3    =   (ConstraintLayout)findViewById(R.id.Content3);
        content3.setBackgroundColor(Color.rgb(10,199,241));
        String error = "Sus datos son incorrectos";
        txtError.setText(error);
        btnBack =   (Button)findViewById(R.id.btnBack);
      // txtError.setText("Usted ha tenido un error:");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent   intent =   new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
