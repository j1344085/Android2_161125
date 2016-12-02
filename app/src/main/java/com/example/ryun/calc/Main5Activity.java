package com.example.ryun.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    EditText text1, text2, text3;
    CheckBox chk1;
    RadioButton btn1, btn2;
    TextView t1, t2, t3;
    Button btn3;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        text1 = (EditText)findViewById(R.id.editText);
        text2 = (EditText)findViewById(R.id.editText4);
        text3 = (EditText)findViewById(R.id.editText5);
        chk1 = (CheckBox)findViewById(R.id.checkBox3);
        btn1 = (RadioButton)findViewById(R.id.radioButton4);
        btn2 = (RadioButton)findViewById(R.id.radioButton5);
        btn3 = (Button)findViewById(R.id.button12);
        t1 = (TextView)findViewById(R.id.textView15);
        t2 = (TextView)findViewById(R.id.textView16);
        t3 = (TextView)findViewById(R.id.textView17);
        img = (ImageView)findViewById(R.id.imageView4);

        btn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    img.setImageResource(R.drawable.picle);
                    String opt="피클을";
                    t3.setText(opt + " 선택하셨습니다");
                }
            }
        });

        btn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    img.setImageResource(R.drawable.sorc);
                    String opt="소스를";
                    t3.setText(opt + " 선택하셨습니다");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double piz = Double.parseDouble(text1.getText().toString());
                /*if (text1.getText().toString().equals(null)) piz = 0;*/
                double spa = Double.parseDouble(text2.getText().toString());
                /*if (text2.getText().toString().equals(null)) spa = 0;*/
                double sal = Double.parseDouble(text3.getText().toString());
                /*if (text3.getText().toString().equals(null)) sal = 0;*/
                double order = piz+spa+sal;

                t1.setText("주문 개수 : " + order);

                if(chk1.isChecked()){
                    t2.setText("주문 금액 : " + ( ((piz*16000)+(spa*11000)+(sal*4000))*0.93) +"원"   );
                }
                else t2.setText("주문 금액 : " + ((piz*16000)+(spa*11000)+(sal*4000))  +"원"  );

                String opt="피클을";
                if(btn2.isChecked()) opt = "소스를";

                t3.setText(opt + " 선택하셨습니다");

            }
        });
    }
}
