package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        TextView textView=new TextView(this);
        textView.setTextSize(30);
        textView.setPadding(400, 1000, 80,0);
        textView.setText("Second Activity");
        setContentView(textView);
    }
}