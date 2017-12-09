package com.example.dasgupta.sampleapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);
        addListenerOnButton();


    }

    public void addListenerOnButton() {

        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                EditText email = (EditText)findViewById(R.id.email);
                EditText pass= (EditText)findViewById(R.id.pass);
                String text = email.getText().toString();
                Intent i = new Intent(view.getContext(),Main2Activity.class);
                i.putExtra(" is the email entered",text);
                startActivity(i);
            }
        });
    }
}
