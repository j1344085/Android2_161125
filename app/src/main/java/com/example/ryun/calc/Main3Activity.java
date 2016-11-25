package com.example.ryun.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onClick", "MainActivity");
                Intent intentSubActivity = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intentSubActivity);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onClick", "Main4Activity");
                Intent intentSubActivity = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intentSubActivity);
                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onClick", "Main5Activity");
                Intent intentSubActivity = new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(intentSubActivity);
            }
        });
    }
}
