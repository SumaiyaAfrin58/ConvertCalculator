package com.example.convertcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText editFeet = (EditText)findViewById(R.id.editTextfeet);
        final EditText editInches = (EditText)findViewById(R.id.editTextinch);

        Button btnconvert = (Button)findViewById(R.id.btnconv);

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double feet = Double.valueOf(editFeet.getText().toString());
                double inches = feet * 12;

                editInches.setText(String.valueOf(inches));

            }
        });

    }
}
