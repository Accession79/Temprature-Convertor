package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private EditText celcius;

    private Button calculate2;
    //private Button clear;

    private TextView c2k;
    private TextView c2f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btncalculate2 = (Button)findViewById(R.id.btnCalculate2);

        btncalculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivty_main2();
            }
        });
    }

    public void openactivty_main2(){


        celcius = (EditText)findViewById(R.id.entered);
        c2k = (TextView)findViewById(R.id.result1);
        c2f = (TextView)findViewById(R.id.result2);

        calculate2 = (Button)findViewById(R.id.btnCalculate2);
        //clear = (Button)findViewById(R.id.btnClear);

        long numc = Long.parseLong(celcius.getText().toString());

        long ctok = numc + 273;
        long ctof = (long) ((1.8)*numc + 32);

        c2k.setText("in K : " + String.valueOf(ctok));
        c2f.setText("in °F : " + String.valueOf(ctof));

    }
}
