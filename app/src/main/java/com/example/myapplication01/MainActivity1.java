package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    private EditText kelvin;

    private Button calculate1;
    //private Button clear;

    private TextView k2c;
    private TextView k2f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button btncalculate1 = (Button)findViewById(R.id.btnCalculate1);

        btncalculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivty_main1();
            }
        });
    }


    public void openactivty_main1(){

        kelvin = (EditText)findViewById(R.id.entered);
        k2c = (TextView)findViewById(R.id.result1);
        k2f = (TextView)findViewById(R.id.result2);

        calculate1 = (Button)findViewById(R.id.btnCalculate1);
        //clear = (Button)findViewById(R.id.btnClear);

        long numk = Long.parseLong(kelvin.getText().toString());

        long ktoc = numk - 273;
        long ktof = ((numk-273)*9/5) + 32;

        k2c.setText("in °C : " + String.valueOf(ktoc));
        k2f.setText("in °F : " + String.valueOf(ktof));

    }
}