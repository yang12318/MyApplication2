package com.example.lenovo.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    boolean com = false;
    private StringBuilder str = new StringBuilder("");//可变字符串
    //当i=0时说明是我们第一次输入，字符串sum不会累加
    int i = 0;
    //存放text的内容
    String sum = "";
    //存放点击运算符之前的数值
    double total = 0;
    int symbol = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lin);
        Button Btn0=(Button) findViewById(R.id.Btn0);
        Button Btn1=(Button)findViewById(R.id.Btn1) ;
        Button Btn2=(Button) findViewById(R.id.Btn2);
        Button Btn3=(Button)findViewById(R.id.Btn3) ;
        Button Btn4=(Button) findViewById(R.id.Btn4);
        Button Btn5=(Button)findViewById(R.id.Btn5) ;
        Button Btn6=(Button) findViewById(R.id.Btn6);
        Button Btn7=(Button)findViewById(R.id.Btn7) ;
        Button Btn8=(Button) findViewById(R.id.Btn8);
        Button Btn9=(Button)findViewById(R.id.Btn9) ;
        Button BtnRooting=(Button) findViewById(R.id.BtnRooting);
        Button BtnSquare=(Button)findViewById(R.id.BtnSquare) ;
        Button BtnReciprocal=(Button) findViewById(R.id.BtnReciprocal);
        Button BtnCE=(Button)findViewById(R.id.BtnCE) ;
        Button BtnC=(Button) findViewById(R.id.BtnC);
        Button BtnBack=(Button)findViewById(R.id.BtnBack) ;
        Button BtnDivide=(Button)findViewById(R.id.BtnDivide) ;
        Button BtnMultiply=(Button) findViewById(R.id.BtnMultiply);
        Button BtnPoint=(Button)findViewById(R.id.BtnPoint) ;
        Button BtnSign=(Button) findViewById(R.id.BtnSign);
        Button BtnEqual=(Button)findViewById(R.id.BtnEqual) ;
        Button BtnPlus=(Button)findViewById(R.id.BtnPlus) ;
        Button BtnMinus=(Button)findViewById(R.id.BtnMinus);
        final TextView textView=(TextView )findViewById(R.id.txt) ;
        textView.setText("0");
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("1");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    textView.setText(sum + "1" );
                }
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
            {
                textView.setText("2");
                com = false;
                i = 1;
            }
            else
            {
                sum = (String) textView.getText();
                textView.setText(sum + "2");
            }
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("3");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    textView.setText(sum + "3");
                }
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("4");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    textView.setText(sum + "4");
                }
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("5");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    textView.setText(sum + "5");
                }
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("6");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    textView.setText(sum + "6");
                }
            }
        });
        Btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("7");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    textView.setText(sum + "7");
                }
            }
        });
        Btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("8");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    textView.setText(sum + "8");
                }
            }
        });
        Btn9.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("9");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    textView.setText(sum + "9");
                }
            }
        });
        Btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("0");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    if (Float.parseFloat(sum) > 0 || Float.parseFloat(sum) < 0)
                    {
                        textView.setText(sum + "0");
                    }
                    else
                    {
                        if (sum.trim().indexOf(".") == -1)
                        {
                            textView.setText(sum);
                        }
                        else
                        {
                            textView.setText(sum + "0");
                        }
                    }
                }
            }
        });
        BtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com = true;
                i = 0;
                total = Double.parseDouble((String) textView.getText());
                symbol = 1;
            }
        });
        BtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com = true;
                i = 0;
                total = Double.parseDouble((String) textView.getText());
                symbol = 2;
            }
        });
        BtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com = true;
                i = 0;
                total = Double.parseDouble((String) textView.getText());
                symbol = 3;
            }
        });
        BtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com = true;
                i = 0;
                total = Double.parseDouble((String) textView.getText());
                symbol = 4;
            }
        });
        BtnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com = true;
                i = 0;
                total = Double.parseDouble((String) textView.getText());
                symbol = 5;
            }
        });
        BtnRooting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com = true;
                i = 0;
                total = Double.parseDouble((String) textView.getText());
                symbol = 6;
            }
        });
        BtnReciprocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com = true;
                i = 0;
                total = Double.parseDouble((String) textView.getText());
                if(total==0)
                {textView.setText("除数不能为零");}
                symbol = 7;
            }
        });
        BtnSign.setOnClickListener(new View.OnClickListener() {
            String a="0";
            @Override
            public void onClick(View v) {
                a = textView.getText().toString();
                double c = Double.parseDouble(a);
                if (c>0) {//屏幕上的数字大于零，在其前添加负号
                    a="-"+a;
                    com=true;
                } else if (c<0) {//屏幕上的数字小于零，将负号替换掉
                    a = a.replace("-","");
                    com = false;
                }
                else if (c==0&&a.contains("0.")&& !a.contains("-")) {//屏幕上的数字等于零，并且屏幕上的数字包含“0.”，在其前添加负号
                    a="-"+a;
                    com = true;
                }
                else if (c==0&&a.contains("-0.")){//屏幕上的数字等于零，并且屏幕上的数字包含“-0.”，将负号替换掉
                    a = a.replace("-","");
                    com = false;
                }
                textView.setText(a);
                str=new StringBuilder(a);
            }
        });
        BtnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com=true;
                textView.setText("0");
                i=0;
            }
        });
        BtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com=true;
                textView.setText("0");
                i=0;
                total=0;
            }
        });
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String text = (String) textView.getText();
                    int i = text.length();
                    if (i > 0) {
                        // 退格，将文本最后一个字符去掉
                        text = text.substring(0, i - 1);
                        if (text.length() == 0) {
                            // 如果文本没有了内容，则初始化计算器的各种值
                            textView.setText("0");
                            i=0;
                            total=0;
                        } else {
                            // 显示新的文本
                            textView.setText(text);
                        }
                    }
                }

            });

        BtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (symbol)
                {
                    case 1 ://计算加法
                    {
                        double ad =  Double.parseDouble((String) textView.getText())+total ;
                        textView.setText(""+ad);
                        i = 0;
                        break;
                    }
                    case 2 ://计算减法
                    {
                        double ad = total - Double.parseDouble((String) textView.getText());
                        textView.setText(String.valueOf(ad));
                        i = 0;
                        break;
                    }
                    case 3 ://计算乘法
                    {
                        double ad = total * Double.parseDouble((String) textView.getText());
                        textView.setText(ad + "");
                        i = 0;
                        break;
                    }
                    case 4 ://计算除法
                    {
                        double ad = total / Double.parseDouble((String) textView.getText());
                        textView.setText(ad + "");
                        if(total==0)
                        {textView.setText("除数不能为零");}
                        i = 0;
                        break;
                    }
                    case 5://计算平方
                    {
                        double ad= Math.pow(Double.parseDouble((String) textView.getText()),2);
                        textView.setText(ad + "");
                        i=0;
                        break;
                    }
                    case 6://计算根号
                    {
                        double ad= Math.pow(Double.parseDouble((String) textView.getText()),0.5);
                        textView.setText(ad + "");
                        i=0;
                        break;
                    }
                    case 7://计算取倒
                    {
                         if(total!=0)
                        {double ad=1/total;
                        textView.setText(ad + "");
                        i=0;}
                        break;
                    }
                }
                if (sum.indexOf(".") > 0) {
                    sum = sum.replaceAll("0+?$", "");//去掉多余的0
                    sum = sum.replaceAll("[.]$", "");//如最后一位是.则去掉
                }
            }
        });

        BtnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (com || i == 0)
                {
                    textView.setText("0.");
                    com = false;
                    i = 1;
                }
                else
                {
                    sum = (String) textView.getText();
                    if (sum.trim().indexOf(".") == -1)
                    {
                        textView.setText(sum + ".");
                    }
                    else
                    {
                        textView.setText(sum);
                    }
                }
            }
        });



    }
}









