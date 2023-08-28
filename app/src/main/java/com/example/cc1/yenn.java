package com.example.cc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class yenn extends AppCompatActivity {
    EditText Tws1,Tws2;
    Button buttonin,buttonv,buttonc,buttone,buttonp,buttond,buttonaus,buttondoll,buttonrin;
    String amount;
    double cnvamt,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yenn);
        initialize();
        Clicklisteners();
    }
    public void initialize(){
        Tws1=findViewById(R.id.T1);
        Tws2=findViewById(R.id.T2);
        buttonin=findViewById(R.id.buttondRUP);
        buttonc=findViewById(R.id.buttonDOL);
        buttond=findViewById(R.id.buttondin);
        buttonv=findViewById(R.id.buttonvit);
        buttone=findViewById(R.id.buttoneur);
        buttonp=findViewById(R.id.buttonpak);
        buttonaus=findViewById(R.id.buttonaus);
        buttondoll=findViewById(R.id.buttonusd);
        buttonrin=findViewById(R.id.buttonrig);


    }
    public void Clicklisteners(){
        buttonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //input from keyboard
                amount=Tws1.getText().toString();
                cnvamt=1.67;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" rupees");
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.5081;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" yuans");
            }
        });
        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=2.07;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result) +" PKR");
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.79;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" dinars");
            }
        });
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.0067;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" euros");
            }
        });

        buttonv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=170.12;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" dongs");
            }
        });

        buttonaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.011;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" autralian dollars");
            }
        });
        buttondoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.0072;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+ "dollars");
            }
        });
        buttonrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=Tws1.getText().toString();
                cnvamt=0.033;
                result=Double.parseDouble(amount)*(cnvamt);
                Tws2.setText(String.valueOf(result)+" ringgits");
            }
        });



    }
}