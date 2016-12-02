package com.example.ryun.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class Main4Activity extends AppCompatActivity {

    Switch swi1;
    RadioButton Rbtn1;
    RadioButton Rbtn2;
    RadioButton Rbtn3;
    Button btn1;
    Button btn2;
    ImageView img;
    LinearLayout hiddenLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        swi1 = (Switch)findViewById(R.id.switch1);
        Rbtn1 = (RadioButton)findViewById(R.id.radioButton);
        Rbtn2 = (RadioButton)findViewById(R.id.radioButton2);
        Rbtn3 = (RadioButton)findViewById(R.id.radioButton3);
        btn1 = (Button)findViewById(R.id.button10);
        btn2 = (Button)findViewById(R.id.button11);

        hiddenLayout = (LinearLayout)findViewById(R.id.SwitchLayout);
        img =(ImageView)findViewById(R.id.imageView2);

        swi1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(swi1.isChecked() == true){
                    hiddenLayout.setVisibility(View.VISIBLE);
                }
                else hiddenLayout.setVisibility(View.GONE);
            }
        });


        Rbtn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    img.setImageResource(R.drawable.jelly_bean);
                }
            }
        });
        Rbtn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    img.setImageResource(R.drawable.kitkat);
                }
            }
        });
        Rbtn3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    img.setImageResource(R.drawable.lollipop);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*android.os.Process.killProcess(android.os.Process.myPid());*/
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Rbtn1.setChecked(true);
                swi1.setChecked(false);
                hiddenLayout.setVisibility(View.GONE);
            }
        });
    }
}
