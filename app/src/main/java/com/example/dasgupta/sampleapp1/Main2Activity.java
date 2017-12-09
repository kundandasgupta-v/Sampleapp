package com.example.dasgupta.sampleapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tview = (TextView) findViewById(R.id.tv);
        tview.setText(getIntent().getStringExtra(" is the email entered"));
    }
}