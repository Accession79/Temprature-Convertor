package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button kelvin, celcius, farenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        kelvin = (Button)findViewById(R.id.btnk);
        celcius = (Button)findViewById(R.id.btnc);
        farenheit = (Button)findViewById(R.id.btnf);

        kelvin.setOnClickListener(this);
        celcius.setOnClickListener(this);
        farenheit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnk:
                Toast.makeText(MainActivity.this, "Activity Kelvin", Toast.LENGTH_LONG).show();
                Intent intentk = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(intentk);
                break;

            case R.id.btnc:
                Toast.makeText(MainActivity.this, "Activity Celcius", Toast.LENGTH_LONG).show();
                Intent intentc = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentc);
                break;

            case R.id.btnf:
                Toast.makeText(MainActivity.this, "Activity Farenheit", Toast.LENGTH_LONG).show();
                Intent intentf = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intentf);
                break;
        }
    }
}