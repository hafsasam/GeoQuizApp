package com.example.geoquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static String tag;
    public Button falseButton;
    public Button trueButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        falseButton = findViewById(R.id.falseButton);
        trueButton = findViewById(R.id.trueButton);

        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonFalseListener();
            }
        });

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonTrueListener();
            }
        });
    }

    void buttonFalseListener(){
        Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
    }

    void buttonTrueListener(){
        Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
    }

}
