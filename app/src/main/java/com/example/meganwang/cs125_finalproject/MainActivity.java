package com.example.meganwang.cs125_finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button startButton;

    public void start(View view) {
        startButton.setVisibility(View.INVISIBLE);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = (Button) findViewById(R.id.startButton);
        TextView sumTextView = (TextView) findViewById(R.id.sumTextView);

        Random rand = new Random();
        int num1 = rand.nextInt(50);
        int num2 = rand.nextInt(50);

        sumTextView.setText(Integer.toString(num1) + " + " + Integer.toString(num2));
    }
}
