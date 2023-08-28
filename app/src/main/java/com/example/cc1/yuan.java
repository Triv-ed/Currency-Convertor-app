package com.example.cc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class yuan extends AppCompatActivity {
    EditText Tws1,Tws2;
    Button buttonin,buttonv,buttondoll,buttone,buttonp,buttond,buttonaus,buttonjpn,buttonrin;
    String amount;
    double cnvamt,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuan);
        initialize();
        Clicklisteners();
    }
    public void initialize(){
        Tws1=findViewById(R.id.T1);
        Tws2=findViewById(R.id.T2);
        buttonin=findViewById(R.id.buttondRUP);
        buttondoll=findViewById(R.id.buttonDOL);
        buttond=findViewById(R.id.buttondin);
        buttonv=findViewById(R.id.buttonvit);
        buttone=findViewById(R.id.buttoneur);
        buttonp=findViewById(R.id.buttonpak);
        buttonaus=findViewById(R.id.buttonaus);
        buttonjpn=findViewById(R.id.buttonusd);
        buttonrin=findViewById(R.id.buttonrig);


    }
    public void Clicklisteners(){
        buttonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //input from keyboard
                amount=Tws1.getText().toString();
                cnvamt=11.83;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" rupees");
            }
        });
        buttondoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.14;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" dollars");
            }
        });
        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=40.67;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result) +" PKR");
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.044;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" dinars");
            }
        });
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.13;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" euros");
            }
        });

        buttonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=3349;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" dongs");
            }
        });

        buttonaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.21;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" autralian dollars");
            }
        });
        buttonjpn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=19.75;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+ "yenns");
            }
        });
        buttonrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.65;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" ringgits");
            }
        });



    }
}