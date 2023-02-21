package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView outputTip;
    TextView outputTotal;
    TextView outputEach;
    TextView tipView;
    SeekBar seekBar;
    RadioGroup radioGroup;
    RadioButton split;
    Button setting;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        outputTip = findViewById(R.id.outputTip);
        outputTotal = findViewById(R.id.outputTotal);
        outputEach = findViewById(R.id.outputEach);
        seekBar = findViewById(R.id.seekBar);
        radioGroup = findViewById(R.id.radioGroup);
        split = findViewById(R.id.split);
        tipView = findViewById(R.id.tipView);
        setting = findViewById(R.id.setting);

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                tipView.setText(i+ "%");
                outputTip.setText(i + "%");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if(i == R.id.nosplit){


                    }

            }
        });
    }

    public void onResume() {
        super.onResume();
    }
}