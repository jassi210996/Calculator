package com.example.kingj.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1,tv2;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    Button zero,del,dvd,multi,sub,plus,equal;
    String op;
    double res=0;
    double n=0,fn=0,sn=0;
    View vw;
    int i=0;
    String no;
    int pi=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        bt3 = findViewById(R.id.b3);
        bt4 = findViewById(R.id.b4);
        bt5 = findViewById(R.id.b5);
        bt6 = findViewById(R.id.b6);
        bt7 = findViewById(R.id.b7);
        bt8 = findViewById(R.id.b8);
        bt9 = findViewById(R.id.b9);
        zero = findViewById(R.id.zero);
        del = findViewById(R.id.del);
        dvd = findViewById(R.id.dvd);
        multi=findViewById(R.id.multi);
        sub = findViewById(R.id.sub);
        plus= findViewById(R.id.plus);
        equal=findViewById(R.id.equal);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        zero.setOnClickListener(this);
        del.setOnClickListener(this);
        dvd.setOnClickListener(this);
        multi.setOnClickListener(this);
        sub.setOnClickListener(this);
        plus.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            if (view.getId()==R.id.b1) {
                no = bt1.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.b2)
            {
                no = bt2.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.b3)
            {
                no = bt3.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.b4)
            {
                no = bt4.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.b5)
            {
                no = bt5.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.b6)
            {
                no = bt6.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.b7)
            {
                no = bt7.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.b8)
            {
                no = bt8.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.b9)
            {
                no = bt9.getText().toString().trim();
                pi = Integer.parseInt(no);
                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.zero)
            {
                no = zero.getText().toString().trim();
                pi = Integer.parseInt(no);

                if(n==0) {
                    n = pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                        tv2.setText("");
                    }
                }
                else
                {
                    n=(n*10)+pi;
                    if (fn == 0) {
                        tv1.setText("" + n);
                    }
                    else {
                        tv1.setText("" + fn+ ""+op+""+n);
                    }
                }
            }
            else if(view.getId()==R.id.del)
            {
                if(res==0) {
                    double bs;
                    bs = n % 10;
                    n = n - bs;
                    n = n / 10;
                    tv1.setText("" + n);
                    tv2.setText("");
                }
                else
                {
                    tv1.setText("");
                    tv2.setText("");
                    n=0;
                    no=null;
                    res=0;
                    fn=0;
                    del.setText("Del");
                }
            }
            else if(view.getId()==R.id.dvd)
            {
                tv1.setText(""+n+"/");
                op="/";
                fn=n;
            }
            else if(view.getId()==R.id.multi)
            {
                tv1.setText(""+n+"*");
                op="*";
                fn=n;
                n=0;
            }
            else if(view.getId()==R.id.plus)
            {
                tv1.setText(""+n+"+");
                op="+";
                fn=n;
                n=0;
            }
            else if(view.getId()==R.id.sub)
            {
                tv1.setText(""+n+"-");
                op="-";

                fn=n;
                n=0;
            }
            else if(view.getId()==R.id.equal)
            {
                del.setText("Clr");

                if(op=="/")
                {
                    res=fn/n;
                    n=res;
                    tv2.setText(""+n);
                    op=null;

                }
                else if(op=="*")
                {
                    res=fn*n;
                    n=res;
                    tv2.setText(""+n);
                    op=null;

                }
                else if(op=="+")
                {
                    res=fn+n;
                    n=res;
                    tv2.setText(""+n);
                    op=null;

                }
                else if(op=="-")
                {
                    res=fn-n;
                    n=res;
                    tv2.setText(""+n);
                    op=null;
                }
            }
        }
    }




