package com.example.ryun.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn1 = (Button)findViewById(R.id.button7);
        btn2 = (Button)findViewById(R.id.button8);
        btn3 = (Button)findViewById(R.id.button9);


    }
}
