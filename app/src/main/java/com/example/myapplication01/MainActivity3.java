package com.example.myapplication01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText farenheit;

    private Button calculate3;
    //private Button clear;

    private TextView f2k;
    private TextView f2c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btncalculate3 = (Button)findViewById(R.id.btnCalculate3);

        btncalculate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivty_main3();
            }
        });
    }


    public void openactivty_main3(){

        farenheit = (EditText)findViewById(R.id.entered);
        f2k = (TextView)findViewById(R.id.result1);
        f2c = (TextView)findViewById(R.id.result2);

        calculate3 = (Button)findViewById(R.id.btnCalculate3);
        //clear = (Button)findViewById(R.id.btnClear);

        long numf = Long.parseLong(farenheit.getText().toString());

        long ftok = ((numf-32)*5/9) + 273;
        double v = 0.55;
        long ftoc = (long) ((numf-32)*v);


        f2k.setText("in K : " + String.valueOf(ftok));
        f2c.setText("in °C : " + String.valueOf(ftoc));

    }
}