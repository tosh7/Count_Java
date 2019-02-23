package com.example.count_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countLabel;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countLabel = (TextView) findViewById(R.id.textLabel);
        countLabel.setText("0");
    }

    public void add(View v) {
        number = number + 1;
        countLabel.setText(String.valueOf(number));
    }
}