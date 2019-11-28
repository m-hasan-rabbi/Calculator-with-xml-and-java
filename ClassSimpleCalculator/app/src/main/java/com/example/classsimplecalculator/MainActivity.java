package com.example.classsimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_1,btn_2,btn_0,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_add,btn_sub,btn_mul,btn_div,btn_eql,btn_c;
    TextView display;
    double firstnum,secondnum,result;
    String string,op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=(TextView) findViewById(R.id.btndisplay);
        btn_0=(Button) findViewById(R.id.btn0);
        btn_1=(Button) findViewById(R.id.btn1);
        btn_2=(Button) findViewById(R.id.btn2);
        btn_3=(Button) findViewById(R.id.btn3);
        btn_4=(Button) findViewById(R.id.btn4);
        btn_5=(Button) findViewById(R.id.btn5);
        btn_6=(Button) findViewById(R.id.btn6);
        btn_7=(Button) findViewById(R.id.btn7);
        btn_8=(Button) findViewById(R.id.btn8);
        btn_9=(Button) findViewById(R.id.btn9);
        btn_add=(Button) findViewById(R.id.btnadd);
        btn_sub=(Button) findViewById(R.id.btnsub);
        btn_mul=(Button) findViewById(R.id.btnmul);
        btn_div=(Button) findViewById(R.id.btndiv);
        btn_eql=(Button) findViewById(R.id.btneql);
    }
    public  void method0(View view)
    {
        String str=display.getText().toString()+"0";
        display.setText(str);
    }

    public  void method1(View view)
    {
        String str=display.getText().toString()+"1";
        display.setText(str);
    }
    public  void method2(View view)
    {
        String str=display.getText().toString()+"2";
        display.setText(str);
    }
    public  void method3(View view)
    {
        String str=display.getText().toString()+"3";
        display.setText(str);
    }

    public  void method4(View view)
    {
        String str=display.getText().toString()+"4";
        display.setText(str);
    }
    public  void method5(View view)
    {
        String str=display.getText().toString()+"5";
        display.setText(str);
    }
    public  void method6(View view)
    {
        String str=display.getText().toString()+"6";
        display.setText(str);
    }

    public  void method7(View view)
    {
        String str=display.getText().toString()+"7";
        display.setText(str);
    }
    public  void method8(View view)
    {
        String str=display.getText().toString()+"8";
        display.setText(str);
    }

    public  void method9(View view)
    {
        String str=display.getText().toString()+"9";
        display.setText(str);
    }
    public  void method_add(View view)
    {

    }
    public  void method_sub(View view)
    {

    }

}
