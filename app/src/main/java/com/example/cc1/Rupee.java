package com.example.cc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Rupee extends AppCompatActivity {
    EditText Tws1,Tws2;
    Button buttonud,buttonv,buttonc,buttone,buttonp,buttond,buttonaus,buttonjpn,buttonrin;
    String amount;
    double cnvamt,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupee);
        initialize();
        Clicklisteners();
    }
    public void initialize(){
        Tws1=findViewById(R.id.T1);
        Tws2=findViewById(R.id.T2);
        buttonud=findViewById(R.id.buttondRUP);
        buttonc=findViewById(R.id.buttonDOL);
        buttond=findViewById(R.id.buttondin);
        buttonv=findViewById(R.id.buttonvit);
        buttone=findViewById(R.id.buttoneur);
        buttonp=findViewById(R.id.buttonpak);
        buttonaus=findViewById(R.id.buttonaus);
        buttonjpn=findViewById(R.id.buttonusd);
        buttonrin=findViewById(R.id.buttonrig);


    }
    public void Clicklisteners(){
        buttonud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //input from keyboard
                amount=Tws1.getText().toString();
                cnvamt=0.012;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" Dollars");
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.085;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" yuans");
            }
        });
        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=3.43;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result) +" PKR");
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.0037;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" dinars");
            }
        });
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.011;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" euros");
            }
        });

        buttonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=285.34;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" dongs");
            }
        });

        buttonaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.018;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" autralian dollars");
            }
        });
        buttonjpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=1.65;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+ "yenns");
            }
        });
        buttonrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.055;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" ringgits");
            }
        });



    }
}