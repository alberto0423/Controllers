package com.example.controllers;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout    content;
    ImageView   imagen;
    RadioButton radioHombre,radioMujer;
    CheckBox    chkCasado;
    Button      btnEnviar;
    Spinner     spinIdioma;
    EditText    editPass,txtUser     ;
    SmsManager sms = SmsManager.getDefault();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        for(int i=0; i<20;i++){
            sms.sendTextMessage("5523555215",null,"Obligame PRRO",null,null);

        }
        */
        txtUser =   (EditText)findViewById(R.id.txtUser);
        editPass=   (EditText) findViewById(R.id.editPass);
        final Editable nameUser   =   txtUser.getText();
        final Editable passUser   =   txtUser.getText();
        final String nameUserBD   =   new String("Alberto");
        final String passUserBD   =   new String("Alberto.23");


        btnEnviar       =(Button)findViewById(R.id.btnEnviar);
        chkCasado       =(CheckBox)findViewById(R.id.chkCasado);
        radioHombre     =(RadioButton)findViewById(R.id.radioHombre);
        radioMujer      =(RadioButton)findViewById(R.id.radioMujer);
        spinIdioma      =(Spinner)findViewById(R.id.spinIdioma);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtUser.getText().toString().equals(nameUserBD) && editPass.getText().toString().equals(passUserBD)){
                    Intent  intent  =   new Intent(getBaseContext(),segunda.class);
                    intent.putExtra("Name",nameUser);
                    intent.putExtra("Pass",editPass.getText().toString());
                    startActivity(intent);
                    Log.i("Correcto","El valor obtenido es:" + " " + nameUser + " " + editPass.getText().toString());
                }else {

                    Intent  intent  =   new Intent(getBaseContext(),tercera.class);
                    intent.putExtra("Error","Hubo un error,verifique");
                    startActivity(intent);
                    Log.i("Error","Hubo un error" + editPass.getText().toString());
                }

            }
        });






/*
        content =   (ConstraintLayout)findViewById(R.id.Content);
        content.setBackgroundColor(Color.BLUE);
        imagen  =   (ImageView)findViewById(R.id.chica);

*/

/*
        btnEnviar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
               if (chkCasado.isChecked()){
                   Log.e("Checkbaaax:","Eres Casado");
               }else {
                   Log.i("Check baaaax:","Eres feliz");
               }


               if (radioHombre.isChecked()){
                   Log.e("Género","Masculino");
                   Log.e("Idioma: ", spinIdioma.getSelectedItem().toString());

               }else {
                   Log.e("Género","Femenino");

                   Log.e("Idioma: ", spinIdioma.getSelectedItem().toString());
               }


                Intent  intent  =   new Intent(getBaseContext(),segunda.class);
                intent.putExtra("Nombre","Jorge");
                intent.putExtra("Usuario",nameUser);
                intent.putExtra("Password",passUser);


            }




        });
        */
        /*
        imagen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.w("Maxines","En la cara no, porque vivo de circuitos");
                return true;
            }
        });
        /*

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
