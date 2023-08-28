package com.example.cc1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    database g;
    Boolean i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.edname1);
        et2 = findViewById(R.id.edmob1);
        b1 = findViewById(R.id.b11);
        g = new database(this);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1 = et1.getText().toString();
                String mobilenum1 = et2.getText().toString();
                i=g.insert_data(name1,mobilenum1);


                if (name1.equals("") || mobilenum1.equals((""))) {
                    Toast.makeText(MainActivity.this, "enter all details", Toast.LENGTH_SHORT).show();
                } else {
                    if (ValidateMobile(mobilenum1)&&ValidateName(name1)) {
                        Toast.makeText(MainActivity.this, "Registration successful", Toast.LENGTH_SHORT).show();
                        Intent itt = new Intent(MainActivity.this, details.class);
                        startActivity(itt);
                    } else
                        Toast.makeText(MainActivity.this, "please enter valid mobile number and name", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
    boolean ValidateMobile(String mobilenum1){
        Pattern p = Pattern.compile("[6-9][0-9]{9}");
        Matcher m = p.matcher(mobilenum1);
        return m.matches();
    }
    boolean ValidateName(String name1){
        Pattern p=Pattern.compile("[A-Z][a-z]+");
        Matcher m=p.matcher(name1);
        return m.matches();
    }

}




