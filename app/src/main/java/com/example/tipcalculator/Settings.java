package com.example.tipcalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Settings extends MainActivity{

    EditText editTip;
    EditText editParty;
    RadioGroup radioGroup2;
    CheckBox ckButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editParty = findViewById(R.id.editParty);
        editTip = findViewById(R.id.editTip);
        radioGroup = findViewById(R.id.radioGroup);
        ckButton = findViewById(R.id.ckButton);

    }
}

