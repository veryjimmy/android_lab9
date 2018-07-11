package com.example.veryjimmy.minesweeper1;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper extends AppCompatActivity {

    private TextView b1;
    private TextView b2;
    private TextView b3;
    private TextView b4;
    private TextView b5;
    private TextView b6;
    private TextView b7;
    private TextView b8;
    private TextView b9;
    private TextView b10;
    private TextView b11;
    private TextView b12;
    private TextView b13;
    private TextView b14;
    private TextView b15;
    private TextView b16;
    private TextView b17;
    private TextView b18;
    private TextView b19;
    private TextView b20;
    private TextView b21;
    private TextView b22;
    private TextView b23;
    private TextView b24;
    private TextView b25;
    private TextView textView;
    private Button reset;

    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int c4 = 0;
    int c5 = 0;
    int c6 = 0;
    int c7 = 0;
    int c8 = 0;
    int c9 = 0;
    int c10 = 0;
    int c11 = 0;
    int c12 = 0;
    int c13 = 0;
    int c14 = 0;
    int c15 = 0;
    int c16 = 0;
    int c17 = 0;
    int c18 = 0;
    int c19 = 0;
    int c20 = 0;
    int c21 = 0;
    int c22 = 0;
    int c23 = 0;
    int c24 = 0;
    int c25 = 0;
    int random[] = new int[2];

    private long startTime;
    private Handler handler = new Handler();
    private TextView Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minesweeper);


                b1 =(TextView)findViewById(R.id.button1);
                b2 =(TextView)findViewById(R.id.button2);
                b3 =(TextView)findViewById(R.id.button3);
                b4 =(TextView)findViewById(R.id.button4);
                b5 =(TextView)findViewById(R.id.button5);
                b6 =(TextView)findViewById(R.id.button6);
                b7 =(TextView)findViewById(R.id.button7);
                b8 =(TextView)findViewById(R.id.button8);
                b9 =(TextView)findViewById(R.id.button9);
                b10 =(TextView)findViewById(R.id.button10);
                b11 =(TextView)findViewById(R.id.button11);
                b12 =(TextView)findViewById(R.id.button12);
                b13 =(TextView)findViewById(R.id.button13);
                b14 =(TextView)findViewById(R.id.button14);
                b15 =(TextView)findViewById(R.id.button15);
                b16 =(TextView)findViewById(R.id.button16);
                b17 =(TextView)findViewById(R.id.button17);
                b18 =(TextView)findViewById(R.id.button18);
                b19 =(TextView)findViewById(R.id.button19);
                b20 =(TextView)findViewById(R.id.button20);
                b21 =(TextView)findViewById(R.id.button21);
                b22 =(TextView)findViewById(R.id.button22);
                b23 =(TextView)findViewById(R.id.button23);
                b24 =(TextView)findViewById(R.id.button24);
                b25 =(TextView)findViewById(R.id.button25);
                textView = (TextView)findViewById(R.id.text);
                reset = (Button)findViewById(R.id.reset);
                Time = (TextView)findViewById(R.id.time);

                //取得目前時間
                startTime = System.currentTimeMillis();
                //設定定時要執行的方法
                handler.removeCallbacks(updateTimer);
                //設定Delay的時間
                handler.postDelayed(updateTimer, 1000);


                createRandom();

            }


            private int[] createRandom(){
                int number = 25 ;
                List arr = new ArrayList();
                for (int i=0;i<25;i++)
                {
                    arr.add(i + 1);
                }
                for (int j = 0; j < random.length; j++)
                {
                    int index = (int) (Math.random() * number+1);// 产生一个随机数作为索引
                    random[j] = (int) arr.get(index);
                    arr.remove(index);// 移除已经取过的元素
                    number--;// 将随机数范围缩小1
                }
                return random;
            }


            public void lose()
            {
                b1.setClickable(false);
                b2.setClickable(false);
                b3.setClickable(false);
                b4.setClickable(false);
                b5.setClickable(false);
                b6.setClickable(false);
                b7.setClickable(false);
                b8.setClickable(false);
                b9.setClickable(false);
                b10.setClickable(false);
                b11.setClickable(false);
                b12.setClickable(false);
                b13.setClickable(false);
                b14.setClickable(false);
                b15.setClickable(false);
                b16.setClickable(false);
                b17.setClickable(false);
                b18.setClickable(false);
                b19.setClickable(false);
                b20.setClickable(false);
                b21.setClickable(false);
                b22.setClickable(false);
                b23.setClickable(false);
                b24.setClickable(false);
                b25.setClickable(false);
                handler.removeCallbacks(updateTimer);
            }
            public void win(){
                b1.setClickable(true);
                b2.setClickable(true);
                b3.setClickable(true);
                b4.setClickable(true);
                b5.setClickable(true);
                b6.setClickable(true);
                b7.setClickable(true);
                b8.setClickable(true);
                b9.setClickable(true);
                b10.setClickable(true);
                b11.setClickable(true);
                b12.setClickable(true);
                b13.setClickable(true);
                b14.setClickable(true);
                b15.setClickable(true);
                b16.setClickable(true);
                b17.setClickable(true);
                b18.setClickable(true);
                b19.setClickable(true);
                b20.setClickable(true);
                b21.setClickable(true);
                b22.setClickable(true);
                b23.setClickable(true);
                b24.setClickable(true);
                b25.setClickable(true);
            }
            public void color(){
                b1.setBackgroundColor(Color.parseColor("#696969"));
                b2.setBackgroundColor(Color.parseColor("#696969"));
                b3.setBackgroundColor(Color.parseColor("#696969"));
                b4.setBackgroundColor(Color.parseColor("#696969"));
                b5.setBackgroundColor(Color.parseColor("#696969"));
                b6.setBackgroundColor(Color.parseColor("#696969"));
                b7.setBackgroundColor(Color.parseColor("#696969"));
                b8.setBackgroundColor(Color.parseColor("#696969"));
                b9.setBackgroundColor(Color.parseColor("#696969"));
                b10.setBackgroundColor(Color.parseColor("#696969"));
                b11.setBackgroundColor(Color.parseColor("#696969"));
                b12.setBackgroundColor(Color.parseColor("#696969"));
                b13.setBackgroundColor(Color.parseColor("#696969"));
                b14.setBackgroundColor(Color.parseColor("#696969"));
                b15.setBackgroundColor(Color.parseColor("#696969"));
                b16.setBackgroundColor(Color.parseColor("#696969"));
                b17.setBackgroundColor(Color.parseColor("#696969"));
                b18.setBackgroundColor(Color.parseColor("#696969"));
                b19.setBackgroundColor(Color.parseColor("#696969"));
                b20.setBackgroundColor(Color.parseColor("#696969"));
                b21.setBackgroundColor(Color.parseColor("#696969"));
                b22.setBackgroundColor(Color.parseColor("#696969"));
                b23.setBackgroundColor(Color.parseColor("#696969"));
                b24.setBackgroundColor(Color.parseColor("#696969"));
                b25.setBackgroundColor(Color.parseColor("#696969"));
            }
            public void number(){
                b1.setText(" ");
                b2.setText(" ");
                b3.setText(" ");
                b4.setText(" ");
                b5.setText(" ");
                b6.setText(" ");
                b7.setText(" ");
                b8.setText(" ");
                b9.setText(" ");
                b10.setText(" ");
                b11.setText(" ");
                b12.setText(" ");
                b13.setText(" ");
                b14.setText(" ");
                b15.setText(" ");
                b16.setText(" ");
                b17.setText(" ");
                b18.setText(" ");
                b19.setText(" ");
                b20.setText(" ");
                b21.setText(" ");
                b22.setText(" ");
                b23.setText(" ");
                b24.setText(" ");
                b25.setText(" ");
            }
            public void resetnumber(){
                c1 = 0;
                c2 = 0;
                c3 = 0;
                c4 = 0;
                c5 = 0;
                c6 = 0;
                c7 = 0;
                c8 = 0;
                c9 = 0;
                c10 = 0;
                c11 = 0;
                c12 = 0;
                c13 = 0;
                c14 = 0;
                c15 = 0;
                c16 = 0;
                c17 = 0;
                c18 = 0;
                c19 = 0;
                c20 = 0;
                c21 = 0;
                c22 = 0;
                c23 = 0;
                c24 = 0;
                c25 = 0;
            }
            public void reset(View view)
            {
                win();
                color();
                number();
                textView.setText(" ");
                createRandom();
                resetnumber();
                handler.removeCallbacks(updateTimer);
                Time.setText("0 sec");

                //取得目前時間
                startTime = System.currentTimeMillis();
                //設定定時要執行的方法
                handler.removeCallbacks(update);
                //設定Delay的時間
                handler.postDelayed(update, 1000);

            }
            //c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0
            public void checkgame(){
                if (c1== 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 2
                    lose();
                }else if(c1== 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 3
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 4
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 5
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 6
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 7
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 8
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 9
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 10
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 11
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 12
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 13
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 14
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 15
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 16
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 17
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 18
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 19
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 20
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 21
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 22
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//1 23
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    textView.setText("you win!");//1 24
                    lose();
                }else if(c1== 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    textView.setText("you win!");//1 25**********************************************************************************************************
                    lose();
                }else if(c1!= 0&&c2==0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 3
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 4
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 5
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 6
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 7
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 8
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 9
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 10
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 11
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 12
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 13
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 14
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 15
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 16
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 17
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 18
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 19
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 20
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 21
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 22
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//2 23
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    textView.setText("you win!");//2 24
                    lose();
                }else if(c1!= 0&&c2==0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    textView.setText("you win!");//2 25**********************************************************************
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//4 **********************************************************************3 4
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//5
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//6
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//7
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//8
                    lose();
                }

            }
            public void  checkgame1(){
                if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//9
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//10
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//11
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//12
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//13
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//14
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//15
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//16
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//17
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//18
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//19
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//20
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//21
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//22
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//23
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    textView.setText("you win!");//24
                    lose();
                }else if(c1!= 0&&c2!=0&&c3==0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    textView.setText("you win!");//25
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//5  *************************************************** 4 5
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//6
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//7
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//8
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//9
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//10
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//11
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//12
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//13
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//14
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//15
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//16
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//17
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//18
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//19
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//20
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//21
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//22
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//23
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    textView.setText("you win!");//24
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4==0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    textView.setText("you win!");//25************************************************************4
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//6 5 5*****************************************************5555
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//7
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//8
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//9
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//10
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//11
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//12
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//13
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//14
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//15
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//16
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//17
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//18
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//19
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//20
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//21
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//22
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//23
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    textView.setText("you win!");//24
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5== 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    textView.setText("you win!");//25 *****************************************5
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//7    666666666666666666666666666
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//8
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//9
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//10
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//11
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//12
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//13
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//14
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//15
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//16
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//17
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//18
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//19
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//20
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//21
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//22
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//23
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    textView.setText("you win!");//24
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6==0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0) {
                    textView.setText("you win!");//25
                    lose();
                } else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//8    77777777777777777kaitou
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//9
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//10
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//11
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    textView.setText("you win!");//12
                    lose();
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//13
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//14
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//15
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//16
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose(); textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7==0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25  7 kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//9   8 kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//10
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//11
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//12
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//13
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//14
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//15
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//16
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//21
                }
            }
            public void checkgame2(){
                if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose();  textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8==0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose();  textView.setText("you win!");//25   8 kaitou
                } else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//10  9 kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//11
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//12
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//13
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//14
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//15
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//16
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose(); textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9== 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25  9 kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//11 10 kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//12
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//13
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//14
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//15
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//16
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose();textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10==0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25 10 kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//12 11 kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//13
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//14
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//15
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//16
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose(); textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11==0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose();textView.setText("you win!");//25 11kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//13 12 kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//14
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//15
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//16
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose(); textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12==0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25 12kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//14 13kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//15
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//16
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose(); textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13== 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose();  textView.setText("you win!");//25 13jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//15 14kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//16
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose();  textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14==0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose();textView.setText("you win!");//25 14jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//16 15kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();  textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose(); textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15==0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25 15jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//17 16kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//18
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose(); textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16==0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25 16jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//18 17kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//19
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose(); textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose();textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17== 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25 17jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//19 18kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//20
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose();textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18==0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25 18jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//20 19kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//21
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose();textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19==0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose();textView.setText("you win!");//25 19jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//21 20kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//22
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose(); textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20==0&&c21!= 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose();textView.setText("you win!");//25 20jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22==0&&c23!=0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//22 21kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23==0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//23
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24==0&&c25!=0){
                    lose();textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21== 0&&c22!=0&&c23!=0&&c24!=0&&c25==0){
                    lose();textView.setText("you win!");//25 21jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23==0&&c24!=0&&c25!=0){
                    lose();textView.setText("you win!");//23 22kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24==0&&c25!=0){
                    lose();textView.setText("you win!");//24
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22==0&&c23!=0&&c24!=0&&c25==0){
                    lose();textView.setText("you win!");//25 22jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24==0&&c25!=0){
                    lose();textView.setText("you win!");//24 23kaitou
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23==0&&c24!=0&&c25==0){
                    lose(); textView.setText("you win!");//25 23jiewei
                }else if(c1!= 0&&c2!=0&&c3!=0&&c4!=0&&c5!= 0&&c6!=0&&c7!=0&&c8!=0&&c9!= 0&&c10!=0&&c11!=0&&c12!=0&&c13!= 0&&c14!=0&&c15!=0&&c16!=0&&c17!= 0&&c18!=0&&c19!=0&&c20!=0&&c21!= 0&&c22!=0&&c23!=0&&c24==0&&c25==0){
                    lose();textView.setText("you win!");//25
                }}

            public void b1(View view){
                b1.setClickable(false);
                if(random[0]!=1&&random[1]!=1){
                    b1.setBackgroundColor(Color.parseColor("#808069"));
                    c1++;
                }
                if (random[0]==1||random[1]==1){
                    textView.setText("youlose");
                    b1.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if (random[0]!=2&&random[1]!=2&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7){
                    b1.setText(" ");
                    b2.setClickable(false); c2++;
                    b6.setClickable(false); c6++;
                    b7.setClickable(false); c7++;
                    b2.setBackgroundColor(Color.parseColor("#808069"));
                    b6.setBackgroundColor(Color.parseColor("#808069"));
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)){
                        b2.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)){
                        b2.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==8||random[1]==8)){
                        b2.setText("2");
                    }else{
                        b2.setText(" ");
                    }
                    if ((random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)){
                        b6.setText("1");
                    }else if ((random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)){
                        b6.setText("1");
                    }else if ((random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)){
                        b6.setText("2");
                    }else{
                        b6.setText(" ");
                    }
                    if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("1");
                    } else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                        b7.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    } else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)){
                        b7.setText("2");
                    }else{
                        b7.setText(" ");
                    }
                }else  if((random[0]==2||random[1]==2)&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7){
                    b1.setText("1");
                }else if ((random[0]==6||random[1]==6)&&random[0]!=2&&random[1]!=2&&random[0]!=7&&random[1]!=7){
                    b1.setText("1");
                } else if ((random[0]==7||random[1]==7)&&random[0]!=2&&random[1]!=2&&random[0]!=6&&random[1]!=6){
                    b1.setText("1");
                }else if ((random[0]==2||random[1]==2)&&(random[0]==6||random[1]==6)&&random[0]!=7&&random[1]!=7){
                    b1.setText("2");
                }else if ((random[0]==2||random[1]==2)&&(random[0]==7||random[1]==7)&&random[0]!=6&&random[1]!=6){
                    b1.setText("2");
                }else if ((random[0]==6||random[1]==6)&&(random[0]==7||random[1]==7)&&random[0]!=2&&random[1]!=2){
                    b1.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b2(View view){
                b2.setClickable(false);
                if(random[0]!=2&&random[1]!=2){
                    b2.setBackgroundColor(Color.parseColor("#808069"));
                    c2++;
                }
                if (random[0]==2||random[1]==2){
                    textView.setText("youlose");
                    b2.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7&&random[0]!=3&&random[1]!=3&&random[0]!=8&&random[1]!=8) {
                    b2.setText(" ");
                    b1.setText(" ");   c1++;
                    b1.setClickable(false); c3++;
                    b3.setClickable(false); c6++;
                    b6.setClickable(false); c7++;
                    b7.setClickable(false); c8++;
                    b8.setClickable(false);
                    b1.setBackgroundColor(Color.parseColor("#808069"));
                    b3.setBackgroundColor(Color.parseColor("#808069"));
                    b6.setBackgroundColor(Color.parseColor("#808069"));
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)){
                        b3.setText("1");
                    }else if((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)){
                        b3.setText("1");
                    }else if((random[0]==4||random[1]==4)&&(random[0]==9||random[1]==9)){
                        b3.setText("2");
                    }else{
                        b3.setText(" ");
                    }
                    if ((random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)){
                        b6.setText("1");
                    }else if((random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)){
                        b6.setText("1");
                    }else if((random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)){
                        b6.setText("2");
                    }else{
                        b6.setText(" ");
                    }
                    if ((random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[0]!=13)){
                        b7.setText("1");
                    }else if((random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13||random[0]!=13)){
                        b7.setText("1");
                    }else if((random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[0]==13)){
                        b7.setText("1");
                    }else if((random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[0]!=13)){
                        b7.setText("2");
                    }else if((random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[0]==13)){
                        b7.setText("2");
                    }else if((random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[0]==13)){
                        b7.setText("2");
                    }else{
                        b7.setText(" ");
                    }
                    if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("1");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]==9||random[1]==9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");// 4 9
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//4 12
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//4 13
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//4 14  啊啊啊
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//9 12
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//9 13
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//9 14
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//12 13
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//12 14
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//13 14
                    }else{
                        b8.setText("");
                    }
                }else if ((random[0]==1||random[1]==1)&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7&&random[0]!=3&&random[1]!=3&&random[0]!=8&&random[1]!=8){
                    b2.setText("1");
                }else if(random[0]!=1&&random[1]!=1&&(random[0]==6||random[1]==6)&&random[0]!=7&&random[1]!=7&&random[0]!=3&&random[1]!=3&&random[0]!=8&&random[1]!=8){
                    b2.setText("1");
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=6&&random[1]!=6&&(random[0]==7||random[1]==7)&&random[0]!=3&&random[1]!=3&&random[0]!=8&&random[1]!=8){
                    b2.setText("1");
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7&&(random[0]==3||random[1]==3)&&random[0]!=8&&random[1]!=8){
                    b2.setText("1");
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7&&random[0]!=3&&random[1]!=3&&(random[0]==8||random[1]==8)){
                    b2.setText("1");
                }else if((random[0]==1||random[1]==1)&&(random[0]==6||random[1]==6)&&random[0]!=7&&random[1]!=7&&random[0]!=3&&random[1]!=3&&random[0]!=8&&random[1]!=8){
                    b2.setText("2");
                }else if ((random[0]==1||random[1]==1)&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7&&(random[0]==3||random[1]==3)&&random[0]!=8&&random[1]!=8){
                    b2.setText("2");
                }else if ((random[0]==1||random[1]==1)&&random[0]!=6&&random[1]!=6&&(random[0]==7||random[1]==7)&&random[0]!=3&&random[1]!=3&&random[0]!=8&&random[1]!=8){
                    b2.setText("2");
                }else if ((random[0]==1||random[1]==1)&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7&&random[0]!=3&&random[1]!=3&&(random[0]==8||random[1]==8)){
                    b2.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&(random[0]==6||random[1]==6)&&random[0]!=7&&random[1]!=7&&(random[0]==3||random[1]==3)&&random[0]!=8&&random[1]!=8){
                    b2.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&random[0]!=6&&random[1]!=6&&(random[0]==7||random[1]==7)&&(random[0]==3||random[1]==3)&&random[0]!=8&&random[1]!=8){
                    b2.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&random[0]!=6&&random[1]!=6&&random[0]!=7&&random[1]!=7&&(random[0]==3||random[1]==3)&&(random[0]==8||random[1]==8)){
                    b2.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&(random[0]==6||random[1]==6)&&(random[0]==7||random[1]==7)&&random[0]!=3&&random[1]!=3&&random[0]!=8&&random[1]!=8){
                    b2.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&(random[0]==6||random[1]==6)&&random[0]!=7&&random[1]!=7&&random[0]!=3&&random[1]!=3&&(random[0]==8||random[1]==8)){
                    b2.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&random[0]!=6&&random[1]!=6&&(random[0]==7||random[1]==7)&&random[0]!=3&&random[1]!=3&&(random[0]==8||random[1]==8)){
                    b2.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b3(View view){
                b3.setClickable(false);
                if(random[0]!=3&&random[1]!=3){
                    b3.setBackgroundColor(Color.parseColor("#808069"));
                    c3++;
                }
                if (random[0]==3||random[1]==3){
                    textView.setText("youlose");
                    b3.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=2&&random[1]!=2&&random[0]!=4&&random[1]!=4&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9) {
                    b3.setText(" "); c2++;c4++;c7++;c8++;c9++;
                    b2.setClickable(false);
                    b4.setClickable(false);
                    b7.setClickable(false);
                    b8.setClickable(false);
                    b9.setClickable(false);
                    b2.setBackgroundColor(Color.parseColor("#808069"));
                    b4.setBackgroundColor(Color.parseColor("#808069"));
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    if((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)){
                        b2.setText("1");
                    }else if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)){
                        b2.setText("1");
                    }else if((random[0]==1||random[1]==1)&&(random[0]==6||random[1]==6)){
                        b2.setText("2");
                    }else{
                        b2.setText(" ");
                    }
                    if((random[0]!=5&&random[1]!=5)&&(random[0]==10||random[1]==10)){
                        b4.setText("1");
                    }else if ((random[0]==5||random[1]==5)&&(random[0]!=10&&random[1]!=10)){
                        b4.setText("1");
                    }else if((random[0]==5||random[1]==5)&&(random[0]==10||random[1]==10)){
                        b4.setText("2");
                    }else{
                        b4.setText(" ");
                    }
                    if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]!=6&&random[1]!=6)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==11||random[1]==11)){
                        b7.setText("1");
                    }else if ((random[0]==1||random[1]==1)&&(random[0]==6||random[1]==6)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");// 4 9
                    }else if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");//4 12
                    }else if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");//4 13
                    }else if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");//4 14  啊啊啊
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");//9 12
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");//9 13
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");//9 14
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]!=6&&random[1]!=6)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");//12 13
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]!=6&&random[1]!=6)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");//12 14
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");//13 14
                    }else{
                        b7.setText("");
                    }
                    if ((random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("1");
                    }else if ((random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");
                    }else if ((random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");
                    }else {
                        b8.setText(" ");
                    }

                    if ((random[0]==5||random[1]==5)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("1");
                    }else if ((random[0]==5||random[1]==5)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");// 4 9
                    }else if ((random[0]==5||random[1]==5)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//4 12
                    }else if ((random[0]==5||random[1]==5)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//4 13
                    }else if ((random[0]==5||random[1]==5)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");//4 14  啊啊啊
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]==10||random[1]==10)&&(random[0]==15||random[1]==15)&&(random[0]!=13||random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//9 12
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//9 13
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");//9 14
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//12 13
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");//12 14
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");//13 14
                    }else{
                        b9.setText("");
                    }
                }else if ((random[0]==2||random[1]==2)&&random[0]!=4&&random[1]!=4&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b3.setText("1");
                }else if(random[0]!=2&&random[1]!=2&&(random[0]==4||random[1]==4)&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b3.setText("1");
                }else if(random[0]!=2&&random[1]!=2&&random[0]!=4&&random[1]!=4&&(random[0]==7||random[1]==7)&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b3.setText("1");
                }else if(random[0]!=2&&random[1]!=2&&random[0]!=4&&random[1]!=4&&random[0]!=7&&random[1]!=7&&(random[0]==8||random[1]==8)&&random[0]!=9&&random[1]!=9){
                    b3.setText("1");
                }else if(random[0]!=2&&random[1]!=2&&random[0]!=4&&random[1]!=4&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&(random[0]==9||random[1]==9)){
                    b3.setText("1");
                }else if((random[0]==2||random[1]==2)&&(random[0]==4||random[1]==4)&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b3.setText("2");
                }else if ((random[0]==2||random[1]==2)&&random[0]!=4&&random[1]!=4&&random[0]!=7&&random[1]!=7&&(random[0]==8||random[1]==8)&&random[0]!=9&&random[1]!=9){
                    b3.setText("2");
                }else if ((random[0]==2||random[1]==2)&&random[0]!=4&&random[1]!=4&&(random[0]==7||random[1]==7)&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b3.setText("2");
                }else if ((random[0]==2||random[1]==2)&&random[0]!=4&&random[1]!=4&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&(random[0]==9||random[1]==9)){
                    b3.setText("2");
                }else if (random[0]!=2&&random[1]!=2&&(random[0]==4||random[1]==4)&&random[0]!=7&&random[1]!=7&&(random[0]==8||random[1]==8)&&random[0]!=9&&random[1]!=9){
                    b3.setText("2");
                }else if (random[0]!=2&&random[1]!=2&&random[0]!=4&&random[1]!=4&&(random[0]==7||random[1]==7)&&(random[0]==8||random[1]==8)&&random[0]!=9&&random[1]!=9){
                    b3.setText("2");
                }else if (random[0]!=2&&random[1]!=2&&random[0]!=4&&random[1]!=4&&random[0]!=7&&random[1]!=7&&(random[0]==8||random[1]==8)&&(random[0]==9||random[1]==9)){
                    b3.setText("2");
                }else if (random[0]!=2&&random[1]!=2&&(random[0]==4||random[1]==4)&&(random[0]==7||random[1]==7)&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b3.setText("2");
                }else if (random[0]!=2&&random[1]!=2&&(random[0]==4||random[1]==4)&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&(random[0]==9||random[1]==9)){
                    b3.setText("2");
                }else if (random[0]!=2&&random[1]!=2&&random[0]!=4&&random[1]!=4&&(random[0]==7||random[1]==7)&&random[0]!=8&&random[1]!=8&&(random[0]==9||random[1]==9)){
                    b3.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b4(View view){
                b4.setClickable(false);
                if(random[0]!=4&&random[1]!=4){
                    b4.setBackgroundColor(Color.parseColor("#808069"));
                    c4++;
                }
                if (random[0]==4||random[1]==4){
                    textView.setText("youlose");
                    b4.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=3&&random[1]!=3&&random[0]!=5&&random[1]!=5&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9) {
                    b4.setText(" "); c3++;c5++;c8++;c9++;c10++;
                    b5.setText(" ");
                    b3.setClickable(false);
                    b5.setClickable(false);
                    b8.setClickable(false);
                    b9.setClickable(false);
                    b10.setClickable(false);
                    b3.setBackgroundColor(Color.parseColor("#808069"));
                    b5.setBackgroundColor(Color.parseColor("#808069"));
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    b10.setBackgroundColor(Color.parseColor("#808069"));
                    if((random[0]!=2&&random[1]!=2)&&(random[0]==7||random[1]==7)){
                        b3.setText("1");
                    }else if ((random[0]==2||random[1]==2)&&(random[0]!=7&&random[1]!=7)){
                        b3.setText("1");
                    }else if((random[0]==2||random[1]==2)&&(random[0]==7||random[1]==7)){
                        b3.setText("2");
                    }else{
                        b3.setText(" ");
                    }
                    if ((random[0]==2||random[1]==2)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]==7||random[1]==7)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]!=7&&random[1]!=7)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("1");
                    }else if ((random[0]==2||random[1]==2)&&(random[0]==7||random[1]==7)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");// 4 9
                    }else if ((random[0]==2||random[1]==2)&&(random[0]!=7&&random[1]!=7)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//4 12
                    }else if ((random[0]==2||random[1]==2)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//4 13
                    }else if ((random[0]==2||random[1]==2)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//4 14
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]==7||random[1]==7)&&(random[0]==12||random[1]==12)&&(random[0]!=13||random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//9 12
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]==7||random[1]==7)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//9 13
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]==7||random[1]==7)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//9 14
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]!=7&&random[1]!=7)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//12 13
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]!=7&&random[1]!=7)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//12 14
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//13 14
                    }else{
                        b8.setText("");
                    }
                    if ((random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("1");
                    }else if ((random[0]==15||random[1]==15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");
                    }else if ((random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");
                    }else if ((random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");
                    }else {
                        b9.setText(" ");
                    }
                    if((random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)){
                        b10.setText("1");
                    }else if ((random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)){
                        b10.setText("1");
                    }else if((random[0]==14||random[1]==14)&&(random[0]==15||random[1]==15)){
                        b10.setText("2");
                    }else{
                        b10.setText(" ");
                    }
                }else if ((random[0]==3||random[1]==3)&&random[0]!=5&&random[1]!=5&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b4.setText("1");
                }else if(random[0]!=3&&random[1]!=3&&(random[0]==5||random[1]==5)&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b4.setText("1");
                }else if(random[0]!=3&&random[1]!=3&&random[0]!=5&&random[1]!=5&&(random[0]==10||random[1]==10)&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b4.setText("1");
                }else if(random[0]!=3&&random[1]!=3&&random[0]!=5&&random[1]!=5&&random[0]!=10&&random[1]!=10&&(random[0]==8||random[1]==8)&&random[0]!=9&&random[1]!=9){
                    b4.setText("1");
                }else if(random[0]!=3&&random[1]!=3&&random[0]!=5&&random[1]!=5&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&(random[0]==9||random[1]==9)){
                    b4.setText("1");
                }else if((random[0]==3||random[1]==3)&&(random[0]==5||random[1]==5)&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b4.setText("2");
                }else if ((random[0]==3||random[1]==3)&&random[0]!=5&&random[1]!=5&&random[0]!=10&&random[1]!=10&&(random[0]==8||random[1]==8)&&random[0]!=9&&random[1]!=9){
                    b4.setText("2");
                }else if ((random[0]==3||random[1]==3)&&random[0]!=5&&random[1]!=5&&(random[0]==10||random[1]==10)&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b4.setText("2");
                }else if ((random[0]==3||random[1]==3)&&random[0]!=5&&random[1]!=5&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&(random[0]==9||random[1]==9)){
                    b4.setText("2");
                }else if (random[0]!=3&&random[1]!=3&&(random[0]==5||random[1]==5)&&random[0]!=10&&random[1]!=10&&(random[0]==8||random[1]==8)&&random[0]!=9&&random[1]!=9){
                    b4.setText("2");
                }else if (random[0]!=3&&random[1]!=3&&random[0]!=5&&random[1]!=5&&(random[0]==10||random[1]==10)&&(random[0]==8||random[1]==8)&&random[0]!=9&&random[1]!=9){
                    b4.setText("2");
                }else if (random[0]!=3&&random[1]!=3&&random[0]!=5&&random[1]!=5&&random[0]!=10&&random[1]!=10&&(random[0]==8||random[1]==8)&&(random[0]==9||random[1]==9)){
                    b4.setText("2");
                }else if (random[0]!=3&&random[1]!=3&&(random[0]==5||random[1]==5)&&(random[0]==10||random[1]==10)&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9){
                    b4.setText("2");
                }else if (random[0]!=3&&random[1]!=3&&(random[0]==5||random[1]==5)&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&(random[0]==9||random[1]==9)){
                    b4.setText("2");
                }else if (random[0]!=3&&random[1]!=3&&random[0]!=5&&random[1]!=5&&(random[0]==10||random[1]==10)&&random[0]!=8&&random[1]!=8&&(random[0]==9||random[1]==9)){
                    b4.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b5(View view){
                b5.setClickable(false);
                if(random[0]!=5&&random[1]!=5){
                    b5.setBackgroundColor(Color.parseColor("#808069"));
                    c5++;
                }
                if (random[0]==5||random[1]==5){
                    textView.setText("youlose");
                    b5.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=4&&random[1]!=4&&random[0]!=9&&random[1]!=9&&random[0]!=10&&random[1]!=10){
                    b5.setText(" ");c4++;c9++;c10++;
                    b4.setClickable(false);
                    b9.setClickable(false);
                    b10.setClickable(false);
                    b4.setBackgroundColor(Color.parseColor("#808069"));
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    b10.setBackgroundColor(Color.parseColor("#808069"));
                    if((random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)){
                        b10.setText("1");
                    }else if ((random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)){
                        b10.setText("1");
                    }else if((random[0]==14||random[1]==14)&&(random[0]==15||random[1]==15)){
                        b10.setText("2");
                    }else{
                        b10.setText(" ");
                    }
                    if((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)){
                        b4.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)){
                        b4.setText("1");
                    }else if((random[0]==3||random[1]==3)&&(random[0]==8||random[1]==8)){
                        b4.setText("2");
                    }else{
                        b4.setText(" ");
                    }
                    if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==8||random[1]==8)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");// 4 9
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//4 12
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//4 13
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");//4 14
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]==15||random[1]==15)&&(random[0]!=13||random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//9 12
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//9 13
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");//9 14
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==15||random[1]==15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b9.setText("2");//12 13
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");//12 14
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b9.setText("2");//13 14
                    }else{
                        b9.setText("");
                    }
                }else  if((random[0]==4||random[1]==4)&&random[0]!=9&&random[1]!=9&&random[0]!=10&&random[1]!=10){
                    b5.setText("1");
                }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&random[0]!=10&&random[1]!=10){
                    b5.setText("1");
                } else if ((random[0]!=4&&random[1]!=4)&&random[0]!=9&&random[1]!=9&&(random[0]==10||random[1]==10)){
                    b5.setText("1");
                }else if ((random[0]==4||random[1]==4)&&(random[0]==9||random[1]==9)&&random[0]!=10&&random[1]!=10){
                    b5.setText("2");
                }else if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)){
                    b5.setText("2");
                }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]==10||random[1]==10)){
                    b5.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b6(View view){
                b6.setClickable(false);
                if(random[0]!=6&&random[1]!=6){
                    b6.setBackgroundColor(Color.parseColor("#808069"));
                    c6++;
                }
                if (random[0]==6||random[1]==6){
                    textView.setText("youlose");
                    b6.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=2&&random[1]!=2&&random[0]!=7&&random[1]!=7&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12) {
                    b1.setText(" "); c1++;c2++;c7++;c11++;c12++;
                    b6.setText(" ");
                    b1.setClickable(false);
                    b2.setClickable(false);
                    b7.setClickable(false);
                    b11.setClickable(false);
                    b12.setClickable(false);
                    b1.setBackgroundColor(Color.parseColor("#808069"));
                    b2.setBackgroundColor(Color.parseColor("#808069"));
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    b11.setBackgroundColor(Color.parseColor("#808069"));
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)){
                        b2.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)){
                        b2.setText("1");
                    }else if ((random[0]==8||random[1]==8)&&(random[0]==3||random[1]==3)){
                        b2.setText("2");
                    }else{
                        b2.setText(" ");
                    }
                    if ((random[0]==16||random[1]==16)&&(random[0]!=17&&random[1]!=17)){
                        b11.setText("1");
                    }else if ((random[0]!=16&&random[1]!=16)&&(random[0]==17||random[1]==17)){
                        b11.setText("1");
                    }else if ((random[0]==16||random[1]==16)&&(random[0]==17||random[1]==17)){
                        b11.setText("2");
                    }else{
                        b11.setText(" ");
                    }
                    if ((random[0]==8||random[1]==8)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==17||random[1]==17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=17&&random[1]!=17)&&(random[0]==16||random[1]==16)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b12.setText("1");
                    }else if ((random[0]==8||random[1]==8)&&(random[0]==17||random[1]==17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");// 4 9
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=17&&random[1]!=17)&&(random[0]==16||random[1]==16)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//4 12
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//4 13
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//4 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==17||random[1]==17)&&(random[0]==16||random[1]==16)&&(random[0]!=13||random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//9 12
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==17||random[1]==17)&&(random[0]!=16&&random[1]!=16)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//9 13
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==17||random[1]==17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//9 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=17&&random[1]!=17)&&(random[0]==16||random[1]==16)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//12 13
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=17&&random[1]!=17)&&(random[0]==16||random[1]==16)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//12 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]==13||random[1]==13)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//13 14
                    }else{
                        b12.setText("");
                    }
                    if ((random[0]==3||random[1]==3)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=8&&random[1]!=8)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==13||random[1]==13)&&(random[0]!=8&&random[1]!=8)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=13&&random[1]!=13)&&(random[0]==8||random[1]==8)){
                        b7.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==13||random[1]==13)&&(random[0]!=8&&random[1]!=8)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==13||random[1]==13)&&(random[0]==8||random[1]==8)){
                        b7.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=13&&random[1]!=13)&&(random[0]==8||random[1]==8)){
                        b7.setText("2");
                    }else {
                        b7.setText(" ");
                    }
                }else if ((random[0]==1||random[1]==1)&&random[0]!=2&&random[1]!=2&&random[0]!=7&&random[1]!=7&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b6.setText("1");
                }else if(random[0]!=1&&random[1]!=1&&(random[0]==2||random[1]==2)&&random[0]!=7&&random[1]!=7&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b6.setText("1");
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=2&&random[1]!=2&&(random[0]==7||random[1]==7)&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b6.setText("1");
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=2&&random[1]!=2&&random[0]!=7&&random[1]!=7&&(random[0]==11||random[1]==11)&&random[0]!=12&&random[1]!=12){
                    b6.setText("1");
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=2&&random[1]!=2&&random[0]!=7&&random[1]!=7&&random[0]!=11&&random[1]!=11&&(random[0]==12||random[1]==12)){
                    b6.setText("1");
                }else if((random[0]==1||random[1]==1)&&(random[0]==2||random[1]==2)&&random[0]!=7&&random[1]!=7&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b6.setText("2");
                }else if ((random[0]==1||random[1]==1)&&random[0]!=2&&random[1]!=2&&random[0]!=7&&random[1]!=7&&(random[0]==11||random[1]==11)&&random[0]!=12&&random[1]!=12){
                    b6.setText("2");
                }else if ((random[0]==1||random[1]==1)&&random[0]!=2&&random[1]!=2&&(random[0]==7||random[1]==7)&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b6.setText("2");
                }else if ((random[0]==1||random[1]==1)&&random[0]!=2&&random[1]!=2&&random[0]!=7&&random[1]!=7&&random[0]!=11&&random[1]!=11&&(random[0]==12||random[1]==12)){
                    b6.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&(random[0]==2||random[1]==2)&&random[0]!=7&&random[1]!=7&&(random[0]==11||random[1]==11)&&random[0]!=12&&random[1]!=12){
                    b6.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&random[0]!=2&&random[1]!=2&&(random[0]==7||random[1]==7)&&(random[0]==11||random[1]==11)&&random[0]!=12&&random[1]!=12){
                    b6.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&random[0]!=2&&random[1]!=2&&random[0]!=7&&random[1]!=7&&(random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)){
                    b6.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&(random[0]==2||random[1]==2)&&(random[0]==7||random[1]==7)&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b6.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&(random[0]==2||random[1]==2)&&random[0]!=7&&random[1]!=7&&random[0]!=11&&random[1]!=11&&(random[0]==12||random[1]==12)){
                    b6.setText("2");
                }else if (random[0]!=1&&random[1]!=1&&random[0]!=2&&random[1]!=2&&(random[0]==7||random[1]==7)&&random[0]!=11&&random[1]!=11&&(random[0]==12||random[1]==12)){
                    b6.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b7(View view){
                b7.setClickable(false);
                if(random[0]!=7&&random[1]!=7){
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    c7++;
                }
                if (random[0]==7||random[1]==7){
                    textView.setText("youlose");
                    b7.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=1&&random[1]!=1&&random[0]!=2&&random[1]!=2&&random[0]!=3&&random[1]!=3&&random[0]!=6&&random[1]!=6&&random[0]!=8&&random[1]!=8&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12&&random[0]!=13&&random[1]!=13) {
                    b1.setText(" ");c1++;c2++;c6++;c11++;c12++;c3++;c8++;c13++;
                    b2.setText(" ");
                    b6.setText(" ");
                    b7.setText(" ");
                    b1.setClickable(false);
                    b2.setClickable(false);
                    b3.setClickable(false);
                    b6.setClickable(false);
                    b8.setClickable(false);
                    b11.setClickable(false);
                    b12.setClickable(false);
                    b13.setClickable(false);
                    b1.setBackgroundColor(Color.parseColor("#808069"));
                    b2.setBackgroundColor(Color.parseColor("#808069"));
                    b3.setBackgroundColor(Color.parseColor("#808069"));
                    b6.setBackgroundColor(Color.parseColor("#808069"));
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    b11.setBackgroundColor(Color.parseColor("#808069"));
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)){
                        b3.setText("1");
                    }else if((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)){
                        b3.setText("1");
                    }else if((random[0]==4||random[1]==4)&&(random[0]==9||random[1]==9)){
                        b3.setText("2");
                    }else{
                        b3.setText(" ");
                    }
                    if ((random[0]==16||random[1]==16)&&(random[0]!=17&&random[1]!=17)){
                        b11.setText("1");
                    }else if ((random[0]!=16&&random[1]!=16)&&(random[0]==17||random[1]==17)){
                        b11.setText("1");
                    }else if ((random[0]==16||random[1]==16)&&(random[0]==17||random[1]==17)){
                        b11.setText("2");
                    }else{
                        b11.setText(" ");
                    }
                    if ((random[0]==9||random[1]==9)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==18||random[1]==18)){
                        b13.setText("1");
                    }else if ((random[0]==9||random[1]==9)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");// 4 9
                    }else if ((random[0]==9||random[1]==9)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//4 12
                    }else if ((random[0]==9||random[1]==9)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//4 13
                    }else if ((random[0]==9||random[1]==9)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");//4 14
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==17||random[1]==17)&&(random[0]==19||random[1]==19)&&(random[0]!=14||random[1]!=14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//9 12
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//9 13
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");//9 14
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]==14||random[1]==14)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//12 13
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");//12 14
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");//13 14
                    }else{
                        b13.setText("");
                    }
                    if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==14||random[1]==14)){
                        b8.setText("1");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");
                    }else {
                        b8.setText(" ");
                    }
                    if ((random[0]==16||random[1]==16)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=16&&random[1]!=16)&&(random[0]==17||random[1]==17)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=16&&random[1]!=16)&&(random[0]!=17&&random[1]!=17)&&(random[0]==18||random[1]==18)){
                        b12.setText("1");
                    }else if ((random[0]==16||random[1]==16)&&(random[0]==17||random[1]==17)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");
                    }else if ((random[0]!=16&&random[1]!=16)&&(random[0]==17||random[1]==17)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");
                    }else if ((random[0]==16||random[1]==16)&&(random[0]!=17&&random[1]!=17)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");
                    }else {
                        b12.setText(" ");
                    }
                }else if ((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("1");
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("1");
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("1");
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("1");
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("1");
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8||random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("1");
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("1");
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b7.setText("1");// 1 c7++;ge qingkuang
                }else if((random[0]==1||random[1]==1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//1 2
                }else if((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//1 3
                }else if((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//1 6
                }else if((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//1 8
                }else if((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//1 11
                }else if((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//1 12
                }else if((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b7.setText("2");//1 13
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//2 3
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//2 6
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//2 8
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//2 11
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//2 12
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b7.setText("2");//2 13
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//3 6
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//3 8
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//3 11
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//3 12
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b7.setText("2");//3 13
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//6 8
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//6 11
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//6 12
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b7.setText("2");//6 13
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//8 11
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//8 12
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b7.setText("2");//8 13
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b7.setText("2");//11 12
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b7.setText("2");//11 13
                }else if((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)){
                    b7.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b8(View view){
                b8.setClickable(false);
                if(random[0]!=8&&random[1]!=8){
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    c8++;
                }
                if (random[0]==8||random[1]==8){
                    textView.setText("youlose");
                    b8.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=4&&random[1]!=4&&random[0]!=2&&random[1]!=2&&random[0]!=3&&random[1]!=3&&random[0]!=7&&random[1]!=7&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&random[0]!=12&&random[1]!=12&&random[0]!=13&&random[1]!=13) {
                    b3.setText(" ");c2++;c3++;c4++;c7++;c9++;c12++;c13++;c14++;
                    b8.setText(" ");
                    b2.setClickable(false);
                    b3.setClickable(false);
                    b4.setClickable(false);
                    b7.setClickable(false);
                    b9.setClickable(false);
                    b12.setClickable(false);
                    b13.setClickable(false);
                    b14.setClickable(false);
                    b2.setBackgroundColor(Color.parseColor("#808069"));
                    b3.setBackgroundColor(Color.parseColor("#808069"));
                    b4.setBackgroundColor(Color.parseColor("#808069"));
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)){
                        b2.setText("1");
                    }else if((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)){
                        b2.setText("1");
                    }else if((random[0]==1||random[1]==1)&&(random[0]==6||random[1]==6)){
                        b2.setText("2");
                    }else{
                        b2.setText(" ");
                    }
                    if ((random[0]==5||random[1]==5)&&(random[0]!=10&&random[1]!=10)){
                        b4.setText("1");
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]==10||random[1]==10)){
                        b4.setText("1");
                    }else if ((random[0]==5||random[1]==5)&&(random[0]==10||random[1]==10)){
                        b4.setText("2");
                    }else{
                        b4.setText(" ");
                    }
                    if ((random[0]==6||random[1]==6)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==17||random[1]==17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=17&&random[1]!=17)&&(random[0]==16||random[1]==16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]==18||random[1]==18)){
                        b12.setText("1");
                    }else if ((random[0]==6||random[1]==6)&&(random[0]==17||random[1]==17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");// 4 9
                    }else if ((random[0]==6||random[1]==6)&&(random[0]!=17&&random[1]!=17)&&(random[0]==16||random[1]==16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//4 12
                    }else if ((random[0]==6||random[1]==6)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//4 13
                    }else if ((random[0]==6||random[1]==6)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//4 14
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==17||random[1]==17)&&(random[0]==16||random[1]==16)&&(random[0]!=11||random[1]!=11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//9 12
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==17||random[1]==17)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//9 13
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==17||random[1]==17)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//9 14
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=17&&random[1]!=17)&&(random[0]==16||random[1]==16)&&(random[0]==11||random[1]==11)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//12 13
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=17&&random[1]!=17)&&(random[0]==16||random[1]==16)&&(random[0]!=11&&random[1]!=11)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//12 14
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//13 14
                    }else{
                        b12.setText("");
                    }
                    if ((random[0]==20||random[1]==20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==19||random[1]==19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=19&&random[1]!=19)&&(random[0]==18||random[1]==18)){
                        b14.setText("1");
                    }else if ((random[0]==20||random[1]==20)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");// 4 9
                    }else if ((random[0]==20||random[1]==20)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//4 12
                    }else if ((random[0]==20||random[1]==20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==19||random[1]==19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//4 13
                    }else if ((random[0]==20||random[1]==20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=19&&random[1]!=19)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//4 14
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]==10||random[1]==10)&&(random[0]==15||random[1]==15)&&(random[0]!=19||random[1]!=19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//9 12
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==19||random[1]==19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//9 13
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=19&&random[1]!=19)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//9 14
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]==19||random[1]==19)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//12 13
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=19&&random[1]!=19)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//12 14
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==19||random[1]==19)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//13 14
                    }else{
                        b14.setText("");
                    }
                    if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]!=6&&random[1]!=6)&&(random[0]==11||random[1]==11)){
                        b7.setText("1");
                    }else if ((random[0]==1||random[1]==1)&&(random[0]==6||random[1]==6)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");
                    }else if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");
                    }else {
                        b7.setText(" ");
                    }
                    if ((random[0]==5||random[1]==5)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("1");
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("1");
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)){
                        b9.setText("1");
                    }else if ((random[0]==5||random[1]==5)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("2");
                    }else if ((random[0]!=5&&random[1]!=5)&&(random[0]==10||random[1]==10)&&(random[0]==15||random[1]==15)){
                        b9.setText("2");
                    }else if ((random[0]==5||random[1]==5)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)){
                        b9.setText("2");
                    }else {
                        b9.setText(" ");
                    }
                    if ((random[0]==19||random[1]==19)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]==17||random[1]==17)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]!=17&&random[1]!=17)&&(random[0]==18||random[1]==18)){
                        b13.setText("1");
                    }else if ((random[0]==19||random[1]==19)&&(random[0]==17||random[1]==17)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]==17||random[1]==17)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");
                    }else if ((random[0]==19||random[1]==19)&&(random[0]!=17&&random[1]!=17)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");
                    }else {
                        b13.setText(" ");
                    }
                }else if ((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==7||random[1]==7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9||random[1]!=9)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b8.setText("1");// 1 c7++;ge qingkuang
                }else if((random[0]==4||random[1]==4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//1 2
                }else if((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//1 3
                }else if((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==7||random[1]==7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//1 6
                }else if((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//1 8
                }else if((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//1 11
                }else if((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//1 12
                }else if((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b8.setText("2");//1 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]==3||random[1]==3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//2 3
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==7||random[1]==7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//2 6
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//2 8
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//2 11
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//2 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b8.setText("2");//2 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]==7||random[1]==7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//3 6
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=7&&random[1]!=7)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//3 8
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//3 11
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//3 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b8.setText("2");//3 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==7||random[1]==7)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//6 8
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==7||random[1]==7)&&(random[0]!=9&&random[1]!=9)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//6 11
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==7||random[1]==7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//6 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==7||random[1]==7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b8.setText("2");//6 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]==9||random[1]==9)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//8 11
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//8 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]==9||random[1]==9)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b8.setText("2");//8 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]==14||random[1]==14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b8.setText("2");//11 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b8.setText("2");//11 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)){
                    b8.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b9(View view){
                b9.setClickable(false);
                if(random[0]!=9&&random[1]!=9){
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    c9++;
                }
                if (random[0]==9||random[1]==9){
                    textView.setText("youlose");
                    b9.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=4&&random[1]!=4&&random[0]!=5&&random[1]!=5&&random[0]!=3&&random[1]!=3&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&random[0]!=15&&random[1]!=15&&random[0]!=14&&random[1]!=14&&random[0]!=13&&random[1]!=13) {
                    b4.setText(" ");c3++;c4++;c5++;c8++;c10++;c13++;c14++;c15++;
                    b5.setText(" ");
                    b9.setText(" ");
                    b10.setText(" ");
                    b3.setClickable(false);
                    b4.setClickable(false);
                    b5.setClickable(false);
                    b8.setClickable(false);
                    b10.setClickable(false);
                    b13.setClickable(false);
                    b14.setClickable(false);
                    b15.setClickable(false);
                    b3.setBackgroundColor(Color.parseColor("#808069"));
                    b4.setBackgroundColor(Color.parseColor("#808069"));
                    b5.setBackgroundColor(Color.parseColor("#808069"));
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    b10.setBackgroundColor(Color.parseColor("#808069"));
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    b15.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==2||random[1]==2)&&(random[0]!=7&&random[1]!=7)){
                        b3.setText("1");
                    }else if((random[0]!=2&&random[1]!=2)&&(random[0]==7||random[1]==7)){
                        b3.setText("1");
                    }else if((random[0]==2||random[1]==2)&&(random[0]==7||random[1]==7)){
                        b3.setText("2");
                    }else{
                        b3.setText(" ");
                    }
                    if ((random[0]==19||random[1]==19)&&(random[0]!=20&&random[1]!=20)){
                        b15.setText("1");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]==20||random[1]==20)){
                        b15.setText("1");
                    }else if ((random[0]==19||random[1]==19)&&(random[0]==20||random[1]==20)){
                        b15.setText("2");
                    }else{
                        b15.setText(" ");
                    }
                    if ((random[0]==7||random[1]==7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==12||random[1]==12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]==18||random[1]==18)){
                        b13.setText("1");
                    }else if ((random[0]==7||random[1]==7)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");// 4 9
                    }else if ((random[0]==7||random[1]==7)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//4 12
                    }else if ((random[0]==7||random[1]==7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==12||random[1]==12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//4 13
                    }else if ((random[0]==7||random[1]==7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");//4 14
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==17||random[1]==17)&&(random[0]==19||random[1]==19)&&(random[0]!=12||random[1]!=12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//9 12
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==12||random[1]==12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//9 13
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");//9 14
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]==12||random[1]==12)&&(random[0]!=18&&random[1]!=18)){
                        b13.setText("2");//12 13
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=12&&random[1]!=12)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");//12 14
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==12||random[1]==12)&&(random[0]==18||random[1]==18)){
                        b13.setText("2");//13 14
                    }else{
                        b13.setText("");
                    }
                    if ((random[0]==2||random[1]==2)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("1");
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]==7||random[1]==7)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("1");
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]!=7&&random[1]!=7)&&(random[0]==12||random[1]==12)){
                        b8.setText("1");
                    }else if ((random[0]==2||random[1]==2)&&(random[0]==7||random[1]==7)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("2");
                    }else if ((random[0]!=2&&random[1]!=2)&&(random[0]==7||random[1]==7)&&(random[0]==12||random[1]==12)){
                        b8.setText("2");
                    }else if ((random[0]==2||random[1]==2)&&(random[0]!=7&&random[1]!=7)&&(random[0]==12||random[1]==12)){
                        b8.setText("2");
                    }else {
                        b8.setText(" ");
                    }
                    if ((random[0]==19||random[1]==19)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]==20||random[1]==20)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]!=20&&random[1]!=20)&&(random[0]==18||random[1]==18)){
                        b14.setText("1");
                    }else if ((random[0]==19||random[1]==19)&&(random[0]==20||random[1]==20)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]==20||random[1]==20)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");
                    }else if ((random[0]==19||random[1]==19)&&(random[0]!=20&&random[1]!=20)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");
                    }else {
                        b14.setText(" ");
                    }
                }else if ((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==10||random[1]==10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10||random[1]!=10)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("1");
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b9.setText("1");// 1 c7++;ge qingkuang
                }else if((random[0]==4||random[1]==4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//1 2
                }else if((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//1 3
                }else if((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//1 6
                }else if((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==10||random[1]==10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//1 8
                }else if((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//1 11
                }else if((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//1 12
                }else if((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b9.setText("2");//1 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//2 3
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//2 6
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==10||random[1]==10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//2 8
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//2 11
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//2 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b9.setText("2");//2 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)&&(random[0]==8||random[1]==8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//3 6
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==10||random[1]==10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//3 8
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//3 11
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//3 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b9.setText("2");//3 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]==10||random[1]==10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//6 8
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=10&&random[1]!=10)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//6 11
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//6 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b9.setText("2");//6 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==10||random[1]==10)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//8 11
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==10||random[1]==10)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//8 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==10||random[1]==10)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b9.setText("2");//8 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]==14||random[1]==14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b9.setText("2");//11 12
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b9.setText("2");//11 13
                }else if((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]==13||random[1]==13)){
                    b9.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b10(View view){
                b10.setClickable(false);
                if(random[0]!=10&&random[1]!=10){
                    b10.setBackgroundColor(Color.parseColor("#808069"));
                    c10++;
                }
                if (random[0]==10||random[1]==10){
                    textView.setText("youlose");
                    b10.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=4&&random[1]!=4&&random[0]!=5&&random[1]!=5&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15) {
                    b5.setText(" ");c4++;c5++;c9++;c14++;c15++;
                    b10.setText(" ");
                    b4.setClickable(false);
                    b5.setClickable(false);
                    b9.setClickable(false);
                    b14.setClickable(false);
                    b15.setClickable(false);
                    b4.setBackgroundColor(Color.parseColor("#808069"));
                    b5.setBackgroundColor(Color.parseColor("#808069"));
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    b15.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)){
                        b4.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)){
                        b4.setText("1");
                    }else if ((random[0]==8||random[1]==8)&&(random[0]==3||random[1]==3)){
                        b4.setText("2");
                    }else{
                        b4.setText(" ");
                    }
                    if ((random[0]==19||random[1]==19)&&(random[0]!=20&&random[1]!=20)){
                        b15.setText("1");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]==20||random[1]==20)){
                        b15.setText("1");
                    }else if ((random[0]==19||random[1]==19)&&(random[0]==20||random[1]==20)){
                        b15.setText("2");
                    }else{
                        b15.setText(" ");
                    }
                    if ((random[0]==8||random[1]==8)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==19||random[1]==19)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=19&&random[1]!=19)&&(random[0]==20||random[1]==20)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=20&&random[1]!=20)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b14.setText("1");
                    }else if ((random[0]==8||random[1]==8)&&(random[0]==19||random[1]==19)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");// 4 9
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=19&&random[1]!=19)&&(random[0]==20||random[1]==20)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//4 12
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=20&&random[1]!=20)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//4 13
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//4 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==19||random[1]==19)&&(random[0]==20||random[1]==20)&&(random[0]!=13||random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//9 12
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==19||random[1]==19)&&(random[0]!=20&&random[1]!=20)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//9 13
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==19||random[1]==19)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//9 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=19&&random[1]!=19)&&(random[0]==20||random[1]==20)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//12 13
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=19&&random[1]!=19)&&(random[0]==20||random[1]==20)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//12 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=20&&random[1]!=20)&&(random[0]==13||random[1]==13)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//13 14
                    }else{
                        b14.setText("");
                    }
                    if ((random[0]==3||random[1]==3)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=8&&random[1]!=8)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==13||random[1]==13)&&(random[0]!=8&&random[1]!=8)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=13&&random[1]!=13)&&(random[0]==8||random[1]==8)){
                        b9.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==13||random[1]==13)&&(random[0]!=8&&random[1]!=8)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==13||random[1]==13)&&(random[0]==8||random[1]==8)){
                        b9.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=13&&random[1]!=13)&&(random[0]==8||random[1]==8)){
                        b9.setText("2");
                    }else {
                        b9.setText(" ");
                    }
                }else if ((random[0]==4||random[1]==4)&&random[0]!=5&&random[1]!=5&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b10.setText("1");
                }else if(random[0]!=4&&random[1]!=4&&(random[0]==5||random[1]==5)&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b10.setText("1");
                }else if(random[0]!=4&&random[1]!=4&&random[0]!=5&&random[1]!=5&&(random[0]==9||random[1]==9)&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b10.setText("1");
                }else if(random[0]!=4&&random[1]!=4&&random[0]!=5&&random[1]!=5&&random[0]!=9&&random[1]!=9&&(random[0]==14||random[1]==14)&&random[0]!=15&&random[1]!=15){
                    b10.setText("1");
                }else if(random[0]!=4&&random[1]!=4&&random[0]!=5&&random[1]!=5&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&(random[0]==15||random[1]==15)){
                    b10.setText("1");
                }else if((random[0]==4||random[1]==4)&&(random[0]==5||random[1]==5)&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b10.setText("2");
                }else if ((random[0]==4||random[1]==4)&&random[0]!=5&&random[1]!=5&&random[0]!=9&&random[1]!=9&&(random[0]==14||random[1]==14)&&random[0]!=15&&random[1]!=15){
                    b10.setText("2");
                }else if ((random[0]==4||random[1]==4)&&random[0]!=5&&random[1]!=5&&(random[0]==9||random[1]==9)&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b10.setText("2");
                }else if ((random[0]==4||random[1]==4)&&random[0]!=5&&random[1]!=5&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&(random[0]==15||random[1]==15)){
                    b10.setText("2");
                }else if (random[0]!=4&&random[1]!=4&&(random[0]==5||random[1]==5)&&random[0]!=9&&random[1]!=9&&(random[0]==14||random[1]==14)&&random[0]!=15&&random[1]!=15){
                    b10.setText("2");
                }else if (random[0]!=4&&random[1]!=4&&random[0]!=5&&random[1]!=5&&(random[0]==9||random[1]==9)&&(random[0]==14||random[1]==14)&&random[0]!=15&&random[1]!=15){
                    b10.setText("2");
                }else if (random[0]!=4&&random[1]!=4&&random[0]!=5&&random[1]!=5&&random[0]!=9&&random[1]!=9&&(random[0]==14||random[1]==14)&&(random[0]==15||random[1]==15)){
                    b10.setText("2");
                }else if (random[0]!=4&&random[1]!=4&&(random[0]==5||random[1]==5)&&(random[0]==9||random[1]==9)&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b10.setText("2");
                }else if (random[0]!=4&&random[1]!=4&&(random[0]==5||random[1]==5)&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&(random[0]==15||random[1]==15)){
                    b10.setText("2");
                }else if (random[0]!=4&&random[1]!=4&&random[0]!=5&&random[1]!=5&&(random[0]==9||random[1]==9)&&random[0]!=14&&random[1]!=14&&(random[0]==15||random[1]==15)){
                    b10.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b11(View view){
                b11.setClickable(false);
                if(random[0]!=11&&random[1]!=11){
                    b11.setBackgroundColor(Color.parseColor("#808069"));
                    c11++;
                }
                if (random[0]==11||random[1]==11){
                    textView.setText("youlose");
                    b11.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=6&&random[1]!=6&&random[0]!=16&&random[1]!=16&&random[0]!=7&&random[1]!=7&&random[0]!=17&&random[1]!=17&&random[0]!=12&&random[1]!=12) {
                    b11.setText(" ");c6++;c7++;c12++;c16++;c17++;
                    b6.setClickable(false);
                    b7.setClickable(false);
                    b12.setClickable(false);
                    b16.setClickable(false);
                    b17.setClickable(false);
                    b6.setBackgroundColor(Color.parseColor("#808069"));
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    b16.setBackgroundColor(Color.parseColor("#808069"));
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==1||random[1]==1)&&(random[0]!=2||random[1]!=2)){
                        b6.setText("1");
                    }else if ((random[0]!=1||random[1]!=1)&&(random[0]==2||random[1]==2)){
                        b6.setText("1");
                    }else if ((random[0]==1||random[1]==1)&&(random[0]==2||random[1]==2)){
                        b6.setText("2");
                    }else{
                        b6.setText(" ");
                    }
                    if ((random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)){
                        b16.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)){
                        b16.setText("1");
                    }else if ((random[0]==21||random[1]==21)&&(random[0]==22||random[1]==22)){
                        b16.setText("2");
                    }else{
                        b16.setText(" ");
                    }
                    if ((random[0]==18||random[1]==18)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("1");
                    }else if ((random[0]!=18&&random[1]!=18)&&(random[0]==13||random[1]==13)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("1");
                    }else if ((random[0]!=18&&random[1]!=18)&&(random[0]!=13&&random[1]!=13)&&(random[0]==8||random[1]==8)){
                        b12.setText("1");
                    }else if ((random[0]==18||random[1]==18)&&(random[0]==13||random[1]==13)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("2");
                    }else if ((random[0]!=18&&random[1]!=18)&&(random[0]==13||random[1]==13)&&(random[0]==8||random[1]==8)){
                        b12.setText("2");
                    }else if ((random[0]==18||random[1]==18)&&(random[0]!=13&&random[1]!=13)&&(random[0]==8||random[1]==8)){
                        b12.setText("2");
                    }else {
                        b12.setText(" ");
                    }
                    if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("1");
                    } else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==13||random[1]==13)){
                        b7.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==8||random[1]==8)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    } else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==13||random[1]==13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==13||random[1]==13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==1||random[1]==1)&&(random[0]==2||random[1]==2)&&(random[0]!=13&&random[1]!=13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==13||random[1]==13)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]==13||random[1]==13)){
                        b7.setText("2");
                    }else{
                        b7.setText(" ");
                    }
                    if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("1");
                    } else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==13||random[1]==13)){
                        b17.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    } else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==13||random[1]==13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==13||random[1]==13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==21||random[1]==21)&&(random[0]==22||random[1]==22)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==13||random[1]==13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]==13||random[1]==13)){
                        b17.setText("2");
                    }else{
                        b17.setText(" ");
                    }
                }else if ((random[0]==6||random[1]==6)&&random[0]!=16&&random[1]!=16&&random[0]!=7&&random[1]!=7&&random[0]!=17&&random[1]!=17&&random[0]!=12&&random[1]!=12){
                    b11.setText("1");
                }else if(random[0]!=6&&random[1]!=6&&(random[0]==16||random[1]==16)&&random[0]!=7&&random[1]!=7&&random[0]!=17&&random[1]!=17&&random[0]!=12&&random[1]!=12){
                    b11.setText("1");
                }else if(random[0]!=6&&random[1]!=6&&random[0]!=16&&random[1]!=16&&(random[0]==7||random[1]==7)&&random[0]!=17&&random[1]!=17&&random[0]!=12&&random[1]!=12){
                    b11.setText("1");
                }else if(random[0]!=6&&random[1]!=6&&random[0]!=16&&random[1]!=16&&random[0]!=7&&random[1]!=7&&(random[0]==17&&random[1]==17)&&random[0]!=12&&random[1]!=12){
                    b11.setText("1");
                }else if(random[0]!=6&&random[1]!=6&&random[0]!=16&&random[1]!=16&&random[0]!=7&&random[1]!=7&&random[0]!=17&&random[1]!=17&&(random[0]==12||random[1]==12)){
                    b11.setText("1");
                }else if((random[0]==6||random[1]==6)&&(random[0]==16||random[1]==16)&&random[0]!=7&&random[1]!=7&&random[0]!=17&&random[1]!=17&&random[0]!=12&&random[1]!=12){
                    b11.setText("2");
                }else if((random[0]==6||random[1]==6)&&random[0]!=16&&random[1]!=16&&random[0]!=7&&random[1]!=7&&(random[0]==17||random[1]==17)&&random[0]!=12&&random[1]!=12){
                    b11.setText("2");
                }else if((random[0]==6||random[1]==6)&&random[0]!=16&&random[1]!=16&&(random[0]==7||random[1]==7)&&random[0]!=17&&random[1]!=17&&random[0]!=12&&random[1]!=12){
                    b11.setText("2");
                }else if((random[0]==6||random[1]==6)&&random[0]!=16&&random[1]!=16&&random[0]!=7&&random[1]!=7&&random[0]!=17&&random[1]!=17&&(random[0]==12||random[1]==12)){
                    b11.setText("2");
                }else if(random[0]!=6&&random[1]!=6&&(random[0]==16||random[1]==16)&&random[0]!=7&&random[1]!=7&&(random[0]==17||random[1]==17)&&random[0]!=12&&random[1]!=12){
                    b11.setText("2");
                }else if(random[0]!=6&&random[1]!=6&&random[0]!=16&&random[1]!=16&&(random[0]==7||random[1]==7)&&(random[0]==17||random[1]==17)&&random[0]!=12&&random[1]!=12){
                    b11.setText("2");
                }else if(random[0]!=6&&random[1]!=6&&random[0]!=16&&random[1]!=16&&random[0]!=7&&random[1]!=7&&(random[0]==17||random[1]==17)&&(random[0]==12||random[1]==12)){
                    b11.setText("2");
                }else if(random[0]!=6&&random[1]!=6&&(random[0]==16||random[1]==16)&&(random[0]==7||random[1]==7)&&random[0]!=17&&random[1]!=17&&random[0]!=12&&random[1]!=12){
                    b11.setText("2");
                }else if(random[0]!=6&&random[1]!=6&&(random[0]==16||random[1]==16)&&random[0]!=7&&random[1]!=7&&random[0]!=17&&random[1]!=17&&(random[0]==12||random[1]==12)){
                    b11.setText("2");
                }else if(random[0]!=6&&random[1]!=6&&random[0]!=16&&random[1]!=16&&(random[0]==7||random[1]==7)&&random[0]!=17&&random[1]!=17&&(random[0]==12||random[1]==12)){
                    b11.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b12(View view){
                b12.setClickable(false);
                if(random[0]!=12&&random[1]!=12){
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    c12++;
                }
                if (random[0]==12||random[1]==12){
                    textView.setText("youlose");
                    b12.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&random[0]!=6&&random[1]!=6&&random[0]!=11&&random[1]!=11&&random[0]!=13&&random[1]!=13) {
                    b11.setText(" ");c6++;c7++;c11++;c16++;c17++;c8++;c13++;c18++;
                    b12.setText(" ");
                    b6.setClickable(false);
                    b7.setClickable(false);
                    b8.setClickable(false);
                    b11.setClickable(false);
                    b13.setClickable(false);
                    b16.setClickable(false);
                    b17.setClickable(false);
                    b18.setClickable(false);
                    b6.setBackgroundColor(Color.parseColor("#808069"));
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    b11.setBackgroundColor(Color.parseColor("#808069"));
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    b16.setBackgroundColor(Color.parseColor("#808069"));
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==1||random[1]==1)&&(random[0]!=6&&random[1]!=6)){
                        b6.setText("1");
                    }else if((random[0]!=1&&random[1]!=1)&&(random[0]==6||random[1]==6)){
                        b6.setText("1");
                    }else if((random[0]==1||random[1]==1)&&(random[0]==6||random[1]==6)){
                        b6.setText("2");
                    }else{
                        b6.setText(" ");
                    }
                    if ((random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)){
                        b16.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)){
                        b16.setText("1");
                    }else if ((random[0]==21||random[1]==21)&&(random[0]==22||random[1]==22)){
                        b16.setText("2");
                    }else{
                        b16.setText(" ");
                    }
                    if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==14||random[1]==14)){
                        b8.setText("1");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]==9||random[1]==9)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");// 4 9
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//4 12
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//4 13
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//4 14  啊啊啊
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//9 12
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//9 13
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==9||random[1]==9)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//9 14
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==2||random[1]==2)&&(random[0]==3||random[1]==3)&&(random[0]!=14&&random[1]!=14)){
                        b8.setText("2");//12 13
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//12 14
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]==14||random[1]==14)){
                        b8.setText("2");//13 14
                    }else{
                        b8.setText("");
                    }
                    if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==14||random[1]==14)){
                        b18.setText("1");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]==19||random[1]==19)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");// 4 9
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//4 12
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//4 13
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//4 14  啊啊啊
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//9 12
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//9 13
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//9 14
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]==22||random[1]==22)&&(random[0]==23||random[1]==23)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//12 13
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//12 14
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//13 14
                    }else{
                        b18.setText("");
                    }
                    if ((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)){
                        b7.setText("1");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)){
                        b7.setText("1");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)){
                        b7.setText("1");
                    }else if ((random[0]==1||random[1]==1)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)){
                        b7.setText("2");
                    }else if ((random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]==3||random[1]==3)){
                        b7.setText("2");
                    }else if ((random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)){
                        b7.setText("2");
                    }else {
                        b7.setText(" ");
                    }
                    if ((random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)){
                        b17.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)){
                        b17.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)){
                        b17.setText("1");
                    }else if ((random[0]==21||random[1]==21)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)){
                        b17.setText("2");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]==23||random[1]==23)){
                        b17.setText("2");
                    }else if ((random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)){
                        b17.setText("2");
                    }else {
                        b17.setText(" ");
                    }
                    if ((random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=9&&random[1]!=9)){
                        b13.setText("1");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=9&&random[1]!=9)){
                        b13.setText("1");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==9||random[1]==9)){
                        b13.setText("1");
                    }else if ((random[0]==19||random[1]==19)&&(random[0]==14||random[1]==14)&&(random[0]!=9&&random[1]!=9)){
                        b13.setText("2");
                    }else if ((random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]==9||random[1]==9)){
                        b13.setText("2");
                    }else if ((random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==9||random[1]==9)){
                        b13.setText("2");
                    }else {
                        b13.setText(" ");
                    }
                }else if ((random[0]==16||random[1]==16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8||random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==17||random[1]==17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]==13||random[1]==13)){
                    b12.setText("1");// 1 c7++;ge qingkuang
                }else if((random[0]==16||random[1]==16)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//1 2
                }else if((random[0]==16||random[1]==16)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//1 3
                }else if((random[0]==16||random[1]==16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//1 6
                }else if((random[0]==16||random[1]==16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//1 8
                }else if((random[0]==16||random[1]==16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//1 11
                }else if((random[0]==16||random[1]==16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==17||random[1]==17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//1 12
                }else if((random[0]==16||random[1]==16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]==13||random[1]==13)){
                    b12.setText("2");//1 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==7||random[1]==7)&&(random[0]==18||random[1]==18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//2 3
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//2 6
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//2 8
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//2 11
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==17||random[1]==17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//2 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]==13||random[1]==13)){
                    b12.setText("2");//2 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//3 6
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//3 8
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//3 11
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==17||random[1]==17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//3 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]==13||random[1]==13)){
                    b12.setText("2");//3 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==6||random[1]==6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//6 8
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//6 11
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==17||random[1]==17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//6 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==6||random[1]==6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]==13||random[1]==13)){
                    b12.setText("2");//6 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]==11||random[1]==11)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//8 11
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==17||random[1]==17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//8 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]==8||random[1]==8)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=17&&random[1]!=17)&&(random[0]==13||random[1]==13)){
                    b12.setText("2");//8 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]==17||random[1]==17)&&(random[0]!=13&&random[1]!=13)){
                    b12.setText("2");//11 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]==11||random[1]==11)&&(random[0]!=17&&random[1]!=17)&&(random[0]==13||random[1]==13)){
                    b12.setText("2");//11 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=11&&random[1]!=11)&&(random[0]==17||random[1]==17)&&(random[0]==13||random[1]==13)){
                    b12.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b13(View view){
                b13.setClickable(false);
                if(random[0]!=13&&random[1]!=13){
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    c13++;
                }
                if (random[0]==13||random[1]==13){
                    textView.setText("youlose");
                    b13.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=19&&random[1]!=19&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&random[0]!=7&&random[1]!=7&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9&&random[0]!=12&&random[1]!=12&&random[0]!=14&&random[1]!=14) {
                    b13.setText(" ");c7++;c8++;c9++;c12++;c14++;c17++;c18++;c19++;
                    b7.setClickable(false);
                    b8.setClickable(false);
                    b9.setClickable(false);
                    b12.setClickable(false);
                    b14.setClickable(false);
                    b17.setClickable(false);
                    b18.setClickable(false);
                    b19.setClickable(false);
                    b7.setBackgroundColor(Color.parseColor("#808069"));
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    } else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==11||random[1]==11)){
                        b7.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==6||random[1]==6)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");
                    } else if ((random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==6||random[1]==6)&&(random[0]!=1&&random[1]!=1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==1||random[1]==1)&&(random[0]==2||random[1]==2)&&(random[0]!=11&&random[1]!=11)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]==1||random[1]==1)&&(random[0]!=2&&random[1]!=2)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=1&&random[1]!=1)&&(random[0]==2||random[1]==2)&&(random[0]==11||random[1]==11)){
                        b7.setText("2");
                    }else{
                        b7.setText(" ");
                    }
                    if ((random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("1");
                    } else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==16||random[1]==16)){
                        b17.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==11||random[1]==11)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("2");
                    } else if ((random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==16||random[1]==16)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==16||random[1]==16)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==21||random[1]==21)&&(random[0]==22||random[1]==22)&&(random[0]!=16&&random[1]!=16)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==21||random[1]==21)&&(random[0]!=22&&random[1]!=22)&&(random[0]==16||random[1]==16)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=21&&random[1]!=21)&&(random[0]==22||random[1]==22)&&(random[0]==16||random[1]==16)){
                        b17.setText("2");
                    }else{
                        b17.setText(" ");
                    }
                    if ((random[0]==3||random[1]==3)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==4||random[1]==4)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=4&&random[1]!=4)&&(random[0]==10||random[1]==10)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("1");
                    } else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=10&&random[1]!=10)&&(random[0]==5||random[1]==5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=5&&random[1]!=5)&&(random[0]==15||random[1]==15)){
                        b9.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==4||random[1]==4)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("2");
                    } else if ((random[0]==3||random[1]==3)&&(random[0]!=4&&random[1]!=4)&&(random[0]==10||random[1]==10)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=10&&random[1]!=10)&&(random[0]==5||random[1]==5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=5&&random[1]!=5)&&(random[0]==15||random[1]==15)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==4||random[1]==4)&&(random[0]==10||random[1]==10)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==4||random[1]==4)&&(random[0]!=10&&random[1]!=10)&&(random[0]==5||random[1]==5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==4||random[1]==4)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=5&&random[1]!=5)&&(random[0]==15||random[1]==15)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=4&&random[1]!=4)&&(random[0]==10||random[1]==10)&&(random[0]==5||random[1]==5)&&(random[0]!=15&&random[1]!=15)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=4&&random[1]!=4)&&(random[0]==10||random[1]==10)&&(random[0]!=5&&random[1]!=5)&&(random[0]==15||random[1]==15)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=10&&random[1]!=10)&&(random[0]==5||random[1]==5)&&(random[0]==15||random[1]==15)){
                        b9.setText("2");
                    }else{
                        b9.setText(" ");
                    }
                    if ((random[0]==23||random[1]==23)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==15||random[1]==15)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=15&&random[1]!=15)&&(random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("1");
                    } else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)){
                        b19.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==15||random[1]==15)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("2");
                    } else if ((random[0]==23||random[1]==23)&&(random[0]!=15&&random[1]!=15)&&(random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==15||random[1]==15)&&(random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==15||random[1]==15)&&(random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==15||random[1]==15)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=15&&random[1]!=15)&&(random[0]==24||random[1]==24)&&(random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=15&&random[1]!=15)&&(random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]==20||random[1]==20)){
                        b19.setText("2");
                    }else{
                        b19.setText(" ");
                    }
                    if ((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)){
                        b8.setText("1");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)){
                        b8.setText("2");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==2||random[1]==2)&&(random[0]==3||random[1]==3)){
                        b8.setText("2");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)){
                        b8.setText("2");
                    }else {
                        b8.setText(" ");
                    }
                    if ((random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=25&&random[1]!=25)){
                        b14.setText("1");
                    }else if ((random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=25&&random[1]!=25)){
                        b14.setText("1");
                    }else if ((random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==25||random[1]==25)){
                        b14.setText("1");
                    }else if ((random[0]==10||random[1]==10)&&(random[0]==15||random[1]==15)&&(random[0]!=25&&random[1]!=25)){
                        b14.setText("2");
                    }else if ((random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]==25||random[1]==25)){
                        b14.setText("2");
                    }else if ((random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==25||random[1]==25)){
                        b14.setText("2");
                    }else {
                        b14.setText(" ");
                    }
                    if ((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)){
                        b18.setText("1");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)){
                        b18.setText("2");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]==23||random[1]==23)){
                        b18.setText("2");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)){
                        b18.setText("2");
                    }else {
                        b18.setText(" ");
                    }
                    if ((random[0]==11||random[1]==11)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=6&&random[1]!=6)){
                        b12.setText("1");
                    }else if ((random[0]!=11&&random[1]!=11)&&(random[0]==16||random[1]==16)&&(random[0]!=6&&random[1]!=6)){
                        b12.setText("1");
                    }else if ((random[0]!=11&&random[1]!=11)&&(random[0]!=16&&random[1]!=16)&&(random[0]==6||random[1]==6)){
                        b12.setText("1");
                    }else if ((random[0]==11||random[1]==11)&&(random[0]==16||random[1]==16)&&(random[0]!=6&&random[1]!=6)){
                        b12.setText("2");
                    }else if ((random[0]!=11&&random[1]!=11)&&(random[0]==16||random[1]==16)&&(random[0]==6||random[1]==6)){
                        b12.setText("2");
                    }else if ((random[0]==11||random[1]==11)&&(random[0]!=16&&random[1]!=16)&&(random[0]==6||random[1]==6)){
                        b12.setText("2");
                    }else {
                        b12.setText(" ");
                    }
                }else if ((random[0]==19||random[1]==19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8||random[1]!=8)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==14||random[1]==14)){
                    b13.setText("1");// 1 c7++;ge qingkuang
                }else if((random[0]==19||random[1]==19)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//1 2
                }else if((random[0]==19||random[1]==19)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//1 3
                }else if((random[0]==19||random[1]==19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//1 6
                }else if((random[0]==19||random[1]==19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//1 8
                }else if((random[0]==19||random[1]==19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//1 11
                }else if((random[0]==19||random[1]==19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//1 12
                }else if((random[0]==19||random[1]==19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==14||random[1]==14)){
                    b13.setText("2");//1 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==7||random[1]==7)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//2 3
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//2 6
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//2 8
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//2 11
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//2 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==7||random[1]==7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==14||random[1]==14)){
                    b13.setText("2");//2 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//3 6
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//3 8
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//3 11
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//3 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==14||random[1]==14)){
                    b13.setText("2");//3 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]==8||random[1]==8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//6 8
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//6 11
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//6 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==14||random[1]==14)){
                    b13.setText("2");//6 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//8 11
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//8 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==14||random[1]==14)){
                    b13.setText("2");//8 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==12||random[1]==12)&&(random[0]==17||random[1]==17)&&(random[0]!=14&&random[1]!=14)){
                    b13.setText("2");//11 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==14||random[1]==14)){
                    b13.setText("2");//11 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]==14||random[1]==14)){
                    b13.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b14(View view){
                b14.setClickable(false);
                if(random[0]!=14&&random[1]!=14){
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    c14++;
                }
                if (random[0]==14||random[1]==14){
                    textView.setText("youlose");
                    b14.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=19&&random[1]!=19&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&random[0]!=10&&random[1]!=10&&random[0]!=8&&random[1]!=8&&random[0]!=9&&random[1]!=9&&random[0]!=13&&random[1]!=13&&random[0]!=15&&random[1]!=15) {
                    b14.setText(" ");c8++;c9++;c10++;c13++;c15++;c18++;c19++;c20++;
                    b15.setText(" ");
                    b8.setClickable(false);
                    b9.setClickable(false);
                    b10.setClickable(false);
                    b13.setClickable(false);
                    b15.setClickable(false);
                    b18.setClickable(false);
                    b19.setClickable(false);
                    b20.setClickable(false);
                    b8.setBackgroundColor(Color.parseColor("#808069"));
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    b10.setBackgroundColor(Color.parseColor("#808069"));
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    b15.setBackgroundColor(Color.parseColor("#808069"));
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    b20.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)){
                        b10.setText("1");
                    }else if((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)){
                        b10.setText("1");
                    }else if((random[0]==4||random[1]==4)&&(random[0]==5||random[1]==5)){
                        b10.setText("2");
                    }else{
                        b10.setText(" ");
                    }
                    if ((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)){
                        b20.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)){
                        b20.setText("1");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]==25||random[1]==25)){
                        b20.setText("2");
                    }else{
                        b20.setText(" ");
                    }
                    if ((random[0]==4||random[1]==4)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==7||random[1]==7)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=7&&random[1]!=7)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==12||random[1]==12)){
                        b8.setText("1");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]==7||random[1]==7)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("2");// 4 9
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=7&&random[1]!=7)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("2");//4 12
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("2");//4 13
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==12||random[1]==12)){
                        b8.setText("2");//4 14  啊啊啊
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==7||random[1]==7)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("2");//9 12
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==7||random[1]==7)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("2");//9 13
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==7||random[1]==7)&&(random[0]!=2&&random[1]!=2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==12||random[1]==12)){
                        b8.setText("2");//9 14
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=7&&random[1]!=7)&&(random[0]==2||random[1]==2)&&(random[0]==3||random[1]==3)&&(random[0]!=12&&random[1]!=12)){
                        b8.setText("2");//12 13
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=7&&random[1]!=7)&&(random[0]==2||random[1]==2)&&(random[0]!=3&&random[1]!=3)&&(random[0]==12||random[1]==12)){
                        b8.setText("2");//12 14
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=2&&random[1]!=2)&&(random[0]==3||random[1]==3)&&(random[0]==12||random[1]==12)){
                        b8.setText("2");//13 14
                    }else{
                        b8.setText("");
                    }
                    if ((random[0]==24||random[1]==24)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==17||random[1]==17)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=17&&random[1]!=17)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==12||random[1]==12)){
                        b18.setText("1");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]==17||random[1]==17)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("2");// 4 9
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=17&&random[1]!=17)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("2");//4 12
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("2");//4 13
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==12||random[1]==12)){
                        b18.setText("2");//4 14  啊啊啊
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==17||random[1]==17)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("2");//9 12
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==17||random[1]==17)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("2");//9 13
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==17||random[1]==17)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==12||random[1]==12)){
                        b18.setText("2");//9 14
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=17&&random[1]!=17)&&(random[0]==22||random[1]==22)&&(random[0]==23||random[1]==23)&&(random[0]!=12&&random[1]!=12)){
                        b18.setText("2");//12 13
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=17&&random[1]!=17)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==12||random[1]==12)){
                        b18.setText("2");//12 14
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]==12||random[1]==12)){
                        b18.setText("2");//13 14
                    }else{
                        b18.setText("");
                    }
                    if ((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=3&&random[1]!=3)){
                        b9.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)){
                        b9.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)){
                        b9.setText("1");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]==5||random[1]==5)&&(random[0]!=3&&random[1]!=3)){
                        b9.setText("2");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]==3||random[1]==3)){
                        b9.setText("2");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==3||random[1]==3)){
                        b9.setText("2");
                    }else {
                        b9.setText(" ");
                    }
                    if ((random[0]==7||random[1]==7)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)){
                        b13.setText("1");
                    }else if ((random[0]==7||random[1]==7)&&(random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)){
                        b13.setText("2");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==12||random[1]==12)&&(random[0]==17||random[1]==17)){
                        b13.setText("2");
                    }else if ((random[0]==7||random[1]==7)&&(random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)){
                        b13.setText("2");
                    }else {
                        b13.setText(" ");
                    }
                    if ((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)){
                        b19.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)){
                        b19.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)){
                        b19.setText("1");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)){
                        b19.setText("2");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]==23||random[1]==23)){
                        b19.setText("2");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)){
                        b19.setText("2");
                    }else {
                        b19.setText(" ");
                    }
                }else if ((random[0]==19||random[1]==19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==10||random[1]==10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8||random[1]!=8)&&(random[0]==13||random[1]==13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("1");
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                    b14.setText("1");// 1 c7++;ge qingkuang
                }else if((random[0]==19||random[1]==19)&&(random[0]==10||random[1]==10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//1 2
                }else if((random[0]==19||random[1]==19)&&(random[0]!=10&&random[1]!=10)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//1 3
                }else if((random[0]==19||random[1]==19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//1 6
                }else if((random[0]==19||random[1]==19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//1 8
                }else if((random[0]==19||random[1]==19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==13||random[1]==13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//1 11
                }else if((random[0]==19||random[1]==19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//1 12
                }else if((random[0]==19||random[1]==19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                    b14.setText("2");//1 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==10||random[1]==10)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//2 3
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==10||random[1]==10)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//2 6
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==10||random[1]==10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//2 8
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==10||random[1]==10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==13||random[1]==13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//2 11
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==10||random[1]==10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//2 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]==10||random[1]==10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                    b14.setText("2");//2 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]==18||random[1]==18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//3 6
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//3 8
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==13||random[1]==13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//3 11
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//3 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]==18||random[1]==18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                    b14.setText("2");//3 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]==8||random[1]==8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//6 8
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==13||random[1]==13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//6 11
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//6 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                    b14.setText("2");//6 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]==13||random[1]==13)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//8 11
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=13&&random[1]!=13)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//8 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                    b14.setText("2");//8 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==13||random[1]==13)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                    b14.setText("2");//11 12
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]==13||random[1]==13)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                    b14.setText("2");//11 13
                }else if((random[0]!=19&&random[1]!=19)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=13&&random[1]!=13)&&(random[0]==20||random[1]==20)&&(random[0]==15||random[1]==15)){
                    b14.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b15(View view){
                b15.setClickable(false);
                if(random[0]!=15&&random[1]!=15){
                    b15.setBackgroundColor(Color.parseColor("#808069"));
                    c15++;
                }
                if (random[0]==15||random[1]==15){
                    textView.setText("youlose");
                    b15.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=9&&random[1]!=9&&random[0]!=10&&random[1]!=10&&random[0]!=14&&random[1]!=14&&random[0]!=19&&random[1]!=17&&random[0]!=20&&random[1]!=20) {
                    b15.setText(" ");c9++;c10++;c14++;c19++;c20++;
                    b9.setClickable(false);
                    b10.setClickable(false);
                    b14.setClickable(false);
                    b19.setClickable(false);
                    b20.setClickable(false);
                    b9.setBackgroundColor(Color.parseColor("#808069"));
                    b10.setBackgroundColor(Color.parseColor("#808069"));
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    b20.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)){
                        b10.setText("1");
                    }else if ((random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)){
                        b10.setText("1");
                    }else if ((random[0]==4||random[1]==4)&&(random[0]==5||random[1]==5)){
                        b10.setText("2");
                    }else{
                        b10.setText(" ");
                    }
                    if ((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)){
                        b20.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)){
                        b20.setText("1");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]==25||random[1]==25)){
                        b20.setText("2");
                    }else{
                        b20.setText(" ");
                    }
                    if ((random[0]==18||random[1]==18)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("1");
                    }else if ((random[0]!=18&&random[1]!=18)&&(random[0]==13||random[1]==13)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("1");
                    }else if ((random[0]!=18&&random[1]!=18)&&(random[0]!=13&&random[1]!=13)&&(random[0]==8||random[1]==8)){
                        b14.setText("1");
                    }else if ((random[0]==18||random[1]==18)&&(random[0]==13||random[1]==13)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("2");
                    }else if ((random[0]!=18&&random[1]!=18)&&(random[0]==13||random[1]==13)&&(random[0]==8||random[1]==8)){
                        b14.setText("2");
                    }else if ((random[0]==18||random[1]==18)&&(random[0]!=13&&random[1]!=13)&&(random[0]==8||random[1]==8)){
                        b14.setText("2");
                    }else {
                        b14.setText(" ");
                    }
                    if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("1");
                    } else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("1");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==13||random[1]==13)){
                        b9.setText("1");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]==8||random[1]==8)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("2");
                    } else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("2");
                    }else if ((random[0]==3||random[1]==3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==13||random[1]==13)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]==8||random[1]==8)&&(random[0]!=4&&random[1]!=4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==13||random[1]==13)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==4||random[1]==4)&&(random[0]==5||random[1]==5)&&(random[0]!=13&&random[1]!=13)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]==4||random[1]==4)&&(random[0]!=5&&random[1]!=5)&&(random[0]==13||random[1]==13)){
                        b9.setText("2");
                    }else if ((random[0]!=3&&random[1]!=3)&&(random[0]!=8&&random[1]!=8)&&(random[0]!=4&&random[1]!=4)&&(random[0]==5||random[1]==5)&&(random[0]==13||random[1]==13)){
                        b9.setText("2");
                    }else{
                        b9.setText(" ");
                    }
                    if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("1");
                    } else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==13||random[1]==13)){
                        b19.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("2");
                    } else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==13||random[1]==13)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==13||random[1]==13)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==24||random[1]==24)&&(random[0]==25||random[1]==25)&&(random[0]!=13&&random[1]!=13)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==13||random[1]==13)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]==13||random[1]==13)){
                        b19.setText("2");
                    }else{
                        b19.setText(" ");
                    }
                }else if ((random[0]==10||random[1]==10)&&random[0]!=20&&random[1]!=20&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&random[0]!=19&&random[1]!=19){
                    b15.setText("1");
                }else if(random[0]!=10&&random[1]!=10&&(random[0]==20||random[1]==20)&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&random[0]!=19&&random[1]!=19){
                    b15.setText("1");
                }else if(random[0]!=10&&random[1]!=10&&random[0]!=20&&random[1]!=20&&(random[0]==9||random[1]==9)&&random[0]!=14&&random[1]!=14&&random[0]!=19&&random[1]!=19){
                    b15.setText("1");
                }else if(random[0]!=10&&random[1]!=10&&random[0]!=20&&random[1]!=20&&random[0]!=9&&random[1]!=9&&(random[0]==14&&random[1]==14)&&random[0]!=19&&random[1]!=19){
                    b15.setText("1");
                }else if(random[0]!=10&&random[1]!=10&&random[0]!=20&&random[1]!=20&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&(random[0]==19||random[1]==19)){
                    b15.setText("1");
                }else if((random[0]==10||random[1]==10)&&(random[0]==20||random[1]==20)&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&random[0]!=19&&random[1]!=19){
                    b15.setText("2");
                }else if ((random[0]==10||random[1]==10)&&random[0]!=20&&random[1]!=20&&random[0]!=9&&random[1]!=9&&(random[0]==14||random[1]==14)&&random[0]!=19&&random[1]!=19){
                    b15.setText("2");
                }else if ((random[0]==10||random[1]==10)&&random[0]!=20&&random[1]!=20&&(random[0]==9||random[1]==9)&&random[0]!=14&&random[1]!=14&&random[0]!=19&&random[1]!=19){
                    b15.setText("2");
                }else if ((random[0]==10||random[1]==10)&&random[0]!=20&&random[1]!=20&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&(random[0]==19||random[1]==19)){
                    b15.setText("2");
                }else if (random[0]!=10&&random[1]!=10&&(random[0]==20||random[1]==20)&&random[0]!=9&&random[1]!=9&&(random[0]==14||random[1]==14)&&random[0]!=19&&random[1]!=19){
                    b15.setText("2");
                }else if (random[0]!=10&&random[1]!=10&&random[0]!=20&&random[1]!=20&&(random[0]==9||random[1]==9)&&(random[0]==14||random[1]==14)&&random[0]!=19&&random[1]!=19){
                    b15.setText("2");
                }else if (random[0]!=10&&random[1]!=10&&random[0]!=20&&random[1]!=20&&random[0]!=9&&random[1]!=9&&(random[0]==14||random[1]==14)&&(random[0]==19||random[1]==19)){
                    b15.setText("2");
                }else if (random[0]!=10&&random[1]!=10&&(random[0]==20||random[1]==20)&&(random[0]==9||random[1]==9)&&random[0]!=14&&random[1]!=14&&random[0]!=19&&random[1]!=19){
                    b15.setText("2");
                }else if (random[0]!=10&&random[1]!=10&&(random[0]==20||random[1]==20)&&random[0]!=9&&random[1]!=9&&random[0]!=14&&random[1]!=14&&(random[0]==19||random[1]==19)){
                    b15.setText("2");
                }else if (random[0]!=10&&random[1]!=10&&random[0]!=20&&random[1]!=20&&(random[0]==9||random[1]==9)&&random[0]!=14&&random[1]!=14&&(random[0]==19||random[1]==19)){
                    b15.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b16(View view){
                b16.setClickable(false);
                if(random[0]!=16&&random[1]!=16){
                    b16.setBackgroundColor(Color.parseColor("#808069"));
                    c16++;
                }
                if (random[0]==16||random[1]==16){
                    textView.setText("youlose");
                    b16.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=22&&random[1]!=22&&random[0]!=17&&random[1]!=17&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12) {
                    b16.setText(" ");c11++;c12++;c17++;c21++;c22++;
                    b21.setText(" ");
                    b11.setClickable(false);
                    b12.setClickable(false);
                    b17.setClickable(false);
                    b21.setClickable(false);
                    b22.setClickable(false);
                    b11.setBackgroundColor(Color.parseColor("#808069"));
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    b21.setBackgroundColor(Color.parseColor("#808069"));
                    b22.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)){
                        b22.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)){
                        b22.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)){
                        b22.setText("2");
                    }else{
                        b22.setText(" ");
                    }
                    if ((random[0]==6||random[1]==6)&&(random[0]!=7&&random[1]!=7)){
                        b11.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==7||random[1]==7)){
                        b11.setText("1");
                    }else if ((random[0]==6||random[1]==6)&&(random[0]==7||random[1]==7)){
                        b11.setText("2");
                    }else{
                        b11.setText(" ");
                    }
                    if ((random[0]==8||random[1]==8)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==7||random[1]==7)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=7&&random[1]!=7)&&(random[0]==6||random[1]==6)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=6&&random[1]!=6)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b12.setText("1");
                    }else if ((random[0]==8||random[1]==8)&&(random[0]==7||random[1]==7)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");// 4 9
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=7&&random[1]!=7)&&(random[0]==6||random[1]==6)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//4 12
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=6&&random[1]!=6)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//4 13
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//4 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==7||random[1]==7)&&(random[0]==6||random[1]==6)&&(random[0]!=13||random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//9 12
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==7||random[1]==7)&&(random[0]!=6&&random[1]!=6)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//9 13
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==7||random[1]==7)&&(random[0]!=6&&random[1]!=6)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//9 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=7&&random[1]!=7)&&(random[0]==6||random[1]==6)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b12.setText("2");//12 13
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=7&&random[1]!=7)&&(random[0]==6||random[1]==6)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//12 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=6&&random[1]!=6)&&(random[0]==13||random[1]==13)&&(random[0]==18||random[1]==18)){
                        b12.setText("2");//13 14
                    }else{
                        b12.setText("");
                    }
                    if ((random[0]==23||random[1]==23)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b17.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==13||random[1]==13)&&(random[0]==18||random[1]==18)){
                        b17.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b17.setText("2");
                    }else {
                        b17.setText(" ");
                    }
                }else if ((random[0]==21||random[1]==21)&&random[0]!=22&&random[1]!=22&&random[0]!=17&&random[1]!=17&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b16.setText("1");
                }else if(random[0]!=21&&random[1]!=21&&(random[0]==22||random[1]==22)&&random[0]!=17&&random[1]!=17&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b16.setText("1");
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=22&&random[1]!=22&&(random[0]==17||random[1]==17)&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b16.setText("1");
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=22&&random[1]!=22&&random[0]!=17&&random[1]!=17&&(random[0]==11||random[1]==11)&&random[0]!=12&&random[1]!=12){
                    b16.setText("1");
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=22&&random[1]!=22&&random[0]!=17&&random[1]!=17&&random[0]!=11&&random[1]!=11&&(random[0]==12||random[1]==12)){
                    b16.setText("1");
                }else if((random[0]==21||random[1]==21)&&(random[0]==22||random[1]==22)&&random[0]!=17&&random[1]!=17&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b16.setText("2");
                }else if ((random[0]==21||random[1]==21)&&random[0]!=22&&random[1]!=22&&random[0]!=17&&random[1]!=17&&(random[0]==11||random[1]==11)&&random[0]!=12&&random[1]!=12){
                    b16.setText("2");
                }else if ((random[0]==21||random[1]==21)&&random[0]!=22&&random[1]!=22&&(random[0]==17||random[1]==17)&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b16.setText("2");
                }else if ((random[0]==21||random[1]==21)&&random[0]!=22&&random[1]!=22&&random[0]!=17&&random[1]!=17&&random[0]!=11&&random[1]!=11&&(random[0]==12||random[1]==12)){
                    b16.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&(random[0]==22||random[1]==22)&&random[0]!=17&&random[1]!=17&&(random[0]==11||random[1]==11)&&random[0]!=12&&random[1]!=12){
                    b16.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&random[0]!=22&&random[1]!=22&&(random[0]==17||random[1]==17)&&(random[0]==11||random[1]==11)&&random[0]!=12&&random[1]!=12){
                    b16.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&random[0]!=22&&random[1]!=22&&random[0]!=17&&random[1]!=17&&(random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)){
                    b16.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&(random[0]==22||random[1]==22)&&(random[0]==17||random[1]==17)&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12){
                    b16.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&(random[0]==22||random[1]==22)&&random[0]!=17&&random[1]!=17&&random[0]!=11&&random[1]!=11&&(random[0]==12||random[1]==12)){
                    b16.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&random[0]!=22&&random[1]!=22&&(random[0]==17||random[1]==17)&&random[0]!=11&&random[1]!=11&&(random[0]==12||random[1]==12)){
                    b16.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b17(View view){
                b17.setClickable(false);
                if(random[0]!=17&&random[1]!=17){
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    c17++;
                }
                if (random[0]==17||random[1]==17){
                    textView.setText("youlose");
                    b17.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=22&&random[1]!=22&&random[0]!=23&&random[1]!=23&&random[0]!=16&&random[1]!=16&&random[0]!=18&&random[1]!=18&&random[0]!=11&&random[1]!=11&&random[0]!=12&&random[1]!=12&&random[0]!=13&&random[1]!=13) {
                    b16.setText(" ");c11++;c12++;c13++;c16++;c18++;c21++;c22++;c23++;
                    b17.setText(" ");
                    b21.setText(" ");
                    b22.setText(" ");
                    b11.setClickable(false);
                    b12.setClickable(false);
                    b13.setClickable(false);
                    b16.setClickable(false);
                    b18.setClickable(false);
                    b21.setClickable(false);
                    b22.setClickable(false);
                    b23.setClickable(false);
                    b11.setBackgroundColor(Color.parseColor("#808069"));
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    b16.setBackgroundColor(Color.parseColor("#808069"));
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    b21.setBackgroundColor(Color.parseColor("#808069"));
                    b22.setBackgroundColor(Color.parseColor("#808069"));
                    b23.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)){
                        b23.setText("1");
                    }else if((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)){
                        b23.setText("1");
                    }else if((random[0]==24||random[1]==24)&&(random[0]==19||random[1]==19)){
                        b23.setText("2");
                    }else{
                        b23.setText(" ");
                    }
                    if ((random[0]==6||random[1]==6)&&(random[0]!=7&&random[1]!=7)){
                        b11.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==7||random[1]==7)){
                        b11.setText("1");
                    }else if ((random[0]==6||random[1]==6)&&(random[0]==7||random[1]==7)){
                        b11.setText("2");
                    }else{
                        b11.setText(" ");
                    }
                    if ((random[0]==9||random[1]==9)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==7||random[1]==7)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=7&&random[1]!=7)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==8||random[1]==8)){
                        b13.setText("1");
                    }else if ((random[0]==9||random[1]==9)&&(random[0]==7||random[1]==7)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");// 4 9
                    }else if ((random[0]==9||random[1]==9)&&(random[0]!=7&&random[1]!=7)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//4 12
                    }else if ((random[0]==9||random[1]==9)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//4 13
                    }else if ((random[0]==9||random[1]==9)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");//4 14
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==7||random[1]==7)&&(random[0]==19||random[1]==19)&&(random[0]!=14||random[1]!=14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//9 12
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==7||random[1]==7)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//9 1
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==7||random[1]==7)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");//9 14
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=7&&random[1]!=7)&&(random[0]==19||random[1]==19)&&(random[0]==14||random[1]==14)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//12 13
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=7&&random[1]!=7)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");//12 14
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");//13 14
                    }else{
                        b13.setText("");
                    }
                    if ((random[0]==14||random[1]==14)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=24&&random[1]!=24)){
                        b18.setText("1");
                    }else if ((random[0]!=14&&random[1]!=14)&&(random[0]==19||random[1]==19)&&(random[0]!=24&&random[1]!=24)){
                        b18.setText("1");
                    }else if ((random[0]!=14&&random[1]!=14)&&(random[0]!=19&&random[1]!=19)&&(random[0]==24||random[1]==24)){
                        b18.setText("1");
                    }else if ((random[0]==14||random[1]==14)&&(random[0]==19||random[1]==19)&&(random[0]!=24&&random[1]!=24)){
                        b18.setText("2");
                    }else if ((random[0]!=14&&random[1]!=14)&&(random[0]==19||random[1]==19)&&(random[0]==24||random[1]==24)){
                        b18.setText("2");
                    }else if ((random[0]==14||random[1]==14)&&(random[0]!=19&&random[1]!=19)&&(random[0]==24||random[1]==24)){
                        b18.setText("2");
                    }else {
                        b18.setText(" ");
                    }
                    if ((random[0]==6||random[1]==6)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==7||random[1]==7)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=7&&random[1]!=7)&&(random[0]==8||random[1]==8)){
                        b12.setText("1");
                    }else if ((random[0]==6||random[1]==6)&&(random[0]==7||random[1]==7)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("2");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==7||random[1]==7)&&(random[0]==8||random[1]==8)){
                        b12.setText("2");
                    }else if ((random[0]==6||random[1]==6)&&(random[0]!=7&&random[1]!=7)&&(random[0]==8||random[1]==8)){
                        b12.setText("2");
                    }else {
                        b12.setText(" ");
                    }
                }else if ((random[0]==16||random[1]==16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==21||random[1]==21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]==18||random[1]==18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23||random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("1");
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b17.setText("1");// 1 c7++;ge qingkuang
                }else if((random[0]==16||random[1]==16)&&(random[0]==21||random[1]==21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//1 2
                }else if((random[0]==16||random[1]==16)&&(random[0]!=21&&random[1]!=21)&&(random[0]==18||random[1]==18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//1 3
                }else if((random[0]==16||random[1]==16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//1 6
                }else if((random[0]==16||random[1]==16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//1 8
                }else if((random[0]==16||random[1]==16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//1 11
                }else if((random[0]==16||random[1]==16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//1 12
                }else if((random[0]==16||random[1]==16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b17.setText("2");//1 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==21||random[1]==21)&&(random[0]==18||random[1]==18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//2 3
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==21||random[1]==21)&&(random[0]!=18&&random[1]!=18)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//2 6
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==21||random[1]==21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//2 8
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==21||random[1]==21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//2 11
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==21||random[1]==21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//2 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]==21||random[1]==21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b17.setText("2");//2 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]==18||random[1]==18)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//3 6
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]==18||random[1]==18)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//3 8
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]==18||random[1]==18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//3 11
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]==18||random[1]==18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//3 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]==18||random[1]==18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b17.setText("2");//3 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]==22||random[1]==22)&&(random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//6 8
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//6 11
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//6 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b17.setText("2");//6 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//8 11
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//8 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b17.setText("2");//8 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b17.setText("2");//11 12
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b17.setText("2");//11 13
                }else if((random[0]!=16&&random[1]!=16)&&(random[0]!=21&&random[1]!=21)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)){
                    b17.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b18(View view){
                b18.setClickable(false);
                if(random[0]!=18&&random[1]!=18){
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    c18++;
                }
                if (random[0]==18||random[1]==18){
                    textView.setText("youlose");
                    b18.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=14&&random[1]!=14&&random[0]!=12&&random[1]!=12&&random[0]!=13&&random[1]!=13&&random[0]!=17&&random[1]!=17&&random[0]!=19&&random[1]!=19&&random[0]!=14&&random[1]!=14&&random[0]!=12&&random[1]!=12&&random[0]!=13&&random[1]!=13) {
                    b18.setText(" ");c12++;c13++;c14++;c17++;c19++;c22++;c23++;c24++;
                    b23.setText(" ");
                    b12.setClickable(false);
                    b13.setClickable(false);
                    b14.setClickable(false);
                    b17.setClickable(false);
                    b19.setClickable(false);
                    b22.setClickable(false);
                    b23.setClickable(false);
                    b24.setClickable(false);
                    b12.setBackgroundColor(Color.parseColor("#808069"));
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    b22.setBackgroundColor(Color.parseColor("#808069"));
                    b23.setBackgroundColor(Color.parseColor("#808069"));
                    b24.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==21||random[1]==21)&&(random[0]!=16&&random[1]!=16)){
                        b22.setText("1");
                    }else if((random[0]!=21&&random[1]!=21)&&(random[0]==16||random[1]==16)){
                        b22.setText("1");
                    }else if((random[0]==21||random[1]==21)&&(random[0]==16||random[1]==16)){
                        b22.setText("2");
                    }else{
                        b22.setText(" ");
                    }
                    if ((random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)){
                        b24.setText("1");
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)){
                        b24.setText("1");
                    }else if ((random[0]==25||random[1]==25)&&(random[0]==20||random[1]==20)){
                        b24.setText("2");
                    }else{
                        b24.setText(" ");
                    }
                    if ((random[0]==6||random[1]==6)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==7||random[1]==7)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=7&&random[1]!=7)&&(random[0]==16||random[1]==16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("1");
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]==8||random[1]==8)){
                        b12.setText("1");
                    }else if ((random[0]==6||random[1]==6)&&(random[0]==7||random[1]==7)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("2");// 4 9
                    }else if ((random[0]==6||random[1]==6)&&(random[0]!=7&&random[1]!=7)&&(random[0]==16||random[1]==16)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("2");//4 12
                    }else if ((random[0]==6||random[1]==6)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("2");//4 13
                    }else if ((random[0]==6||random[1]==6)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]==8||random[1]==8)){
                        b12.setText("2");//4 14
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==7||random[1]==7)&&(random[0]==16||random[1]==16)&&(random[0]!=11||random[1]!=11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("2");//9 12
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==7||random[1]==7)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("2");//9 13
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]==7||random[1]==7)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)&&(random[0]==8||random[1]==8)){
                        b12.setText("2");//9 14
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=7&&random[1]!=7)&&(random[0]==16||random[1]==16)&&(random[0]==11||random[1]==11)&&(random[0]!=8&&random[1]!=8)){
                        b12.setText("2");//12 13
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=7&&random[1]!=7)&&(random[0]==16||random[1]==16)&&(random[0]!=11&&random[1]!=11)&&(random[0]==8||random[1]==8)){
                        b12.setText("2");//12 14
                    }else if ((random[0]!=6&&random[1]!=6)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)&&(random[0]==8||random[1]==8)){
                        b12.setText("2");//13 14
                    }else{
                        b12.setText("");
                    }
                    if ((random[0]==20||random[1]==20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("1");
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("1");
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("1");
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("1");
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)){
                        b14.setText("1");
                    }else if ((random[0]==20||random[1]==20)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("2");// 4 9
                    }else if ((random[0]==20||random[1]==20)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("2");//4 12
                    }else if ((random[0]==20||random[1]==20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("2");//4 13
                    }else if ((random[0]==20||random[1]==20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)){
                        b14.setText("2");//4 14
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]==10||random[1]==10)&&(random[0]==15||random[1]==15)&&(random[0]!=9||random[1]!=9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("2");//9 12
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("2");//9 13
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]==10||random[1]==10)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)){
                        b14.setText("2");//9 14
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]==9||random[1]==9)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("2");//12 13
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]==15||random[1]==15)&&(random[0]!=9&&random[1]!=9)&&(random[0]==8||random[1]==8)){
                        b14.setText("2");//12 14
                    }else if ((random[0]!=20&&random[1]!=20)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=15&&random[1]!=15)&&(random[0]==9||random[1]==9)&&(random[0]==8||random[1]==8)){
                        b14.setText("2");//13 14
                    }else{
                        b14.setText("");
                    }
                    if ((random[0]==21||random[1]==21)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==16||random[1]==16)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)){
                        b17.setText("1");
                    }else if ((random[0]==21||random[1]==21)&&(random[0]==16||random[1]==16)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("2");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==16||random[1]==16)&&(random[0]==11||random[1]==11)){
                        b17.setText("2");
                    }else if ((random[0]==21||random[1]==21)&&(random[0]!=16&&random[1]!=16)&&(random[0]==11||random[1]==11)){
                        b17.setText("2");
                    }else {
                        b17.setText(" ");
                    }
                    if ((random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)){
                        b19.setText("1");
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                        b19.setText("1");
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                        b19.setText("1");
                    }else if ((random[0]==25||random[1]==25)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)){
                        b19.setText("2");
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)&&(random[0]==15||random[1]==15)){
                        b19.setText("2");
                    }else if ((random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)){
                        b19.setText("2");
                    }else {
                        b19.setText(" ");
                    }
                    if ((random[0]==9||random[1]==9)&&(random[0]!=7&&random[1]!=7)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==7||random[1]==7)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=7&&random[1]!=7)&&(random[0]==8||random[1]==8)){
                        b13.setText("1");
                    }else if ((random[0]==9||random[1]==9)&&(random[0]==7||random[1]==7)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==7||random[1]==7)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");
                    }else if ((random[0]==9||random[1]==9)&&(random[0]!=7&&random[1]!=7)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");
                    }else {
                        b13.setText(" ");
                    }
                }else if ((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19||random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b18.setText("1");// 1 c7++;ge qingkuang
                }else if((random[0]==24||random[1]==24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//1 2
                }else if((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//1 3
                }else if((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//1 6
                }else if((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//1 8
                }else if((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//1 11
                }else if((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//1 12
                }else if((random[0]==24||random[1]==24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b18.setText("2");//1 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]==23||random[1]==23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//2 3
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//2 6
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//2 8
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//2 11
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//2 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==22||random[1]==22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b18.setText("2");//2 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//3 6
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//3 8
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//3 11
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//3 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]==23||random[1]==23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b18.setText("2");//3 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==17||random[1]==17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//6 8
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//6 11
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//6 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]==17||random[1]==17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b18.setText("2");//6 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//8 11
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//8 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]==19||random[1]==19)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b18.setText("2");//8 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                    b18.setText("2");//11 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]==14||random[1]==14)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                    b18.setText("2");//11 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=22&&random[1]!=22)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=14&&random[1]!=14)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)){
                    b18.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b19(View view){
                b19.setClickable(false);
                if(random[0]!=19&&random[1]!=19){
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    c19++;
                }
                if (random[0]==19||random[1]==19){
                    textView.setText("youlose");
                    b19.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=25&&random[1]!=25&&random[0]!=23&&random[1]!=23&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&random[0]!=15&&random[1]!=15&&random[0]!=14&&random[1]!=14&&random[0]!=13&&random[1]!=13) {
                    b24.setText(" "); c13++;c14++;c15++;c18++;c20++;c23++;c24++;c25++;
                    b25.setText(" ");
                    b19.setText(" ");
                    b20.setText(" ");
                    b13.setClickable(false);
                    b14.setClickable(false);
                    b15.setClickable(false);
                    b18.setClickable(false);
                    b20.setClickable(false);
                    b23.setClickable(false);
                    b24.setClickable(false);
                    b25.setClickable(false);
                    b13.setBackgroundColor(Color.parseColor("#808069"));
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    b15.setBackgroundColor(Color.parseColor("#808069"));
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    b20.setBackgroundColor(Color.parseColor("#808069"));
                    b23.setBackgroundColor(Color.parseColor("#808069"));
                    b24.setBackgroundColor(Color.parseColor("#808069"));
                    b25.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==22||random[1]==22)&&(random[0]!=17&&random[1]!=17)){
                        b23.setText("1");
                    }else if((random[0]!=22&&random[1]!=22)&&(random[0]==17||random[1]==17)){
                        b23.setText("1");
                    }else if((random[0]==22||random[1]==22)&&(random[0]==17||random[1]==17)){
                        b23.setText("2");
                    }else{
                        b23.setText(" ");
                    }
                    if ((random[0]==9||random[1]==9)&&(random[0]!=10&&random[1]!=10)){
                        b15.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)){
                        b15.setText("1");
                    }else if ((random[0]==9||random[1]==9)&&(random[0]==10||random[1]==10)){
                        b15.setText("2");
                    }else{
                        b15.setText(" ");
                    }
                    if ((random[0]==7||random[1]==7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==17||random[1]==17)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]==9||random[1]==9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=9&&random[1]!=9)&&(random[0]==12||random[1]==12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("1");
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]==8||random[1]==8)){
                        b13.setText("1");
                    }else if ((random[0]==7||random[1]==7)&&(random[0]==17||random[1]==17)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");// 4 9
                    }else if ((random[0]==7||random[1]==7)&&(random[0]!=17&&random[1]!=17)&&(random[0]==9||random[1]==9)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//4 12
                    }else if ((random[0]==7||random[1]==7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=9&&random[1]!=9)&&(random[0]==12||random[1]==12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//4 13
                    }else if ((random[0]==7||random[1]==7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");//4 14
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==17||random[1]==17)&&(random[0]==9||random[1]==9)&&(random[0]!=12||random[1]!=12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//9 12
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==17||random[1]==17)&&(random[0]!=9&&random[1]!=9)&&(random[0]==12||random[1]==12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//9 13
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]==17||random[1]==17)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=12&&random[1]!=12)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");//9 14
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]==9||random[1]==9)&&(random[0]==12||random[1]==12)&&(random[0]!=8&&random[1]!=8)){
                        b13.setText("2");//12 13
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]==9||random[1]==9)&&(random[0]!=12&&random[1]!=12)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");//12 14
                    }else if ((random[0]!=7&&random[1]!=7)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=9&&random[1]!=9)&&(random[0]==12||random[1]==12)&&(random[0]==8||random[1]==8)){
                        b13.setText("2");//13 14
                    }else{
                        b13.setText("");
                    }
                    if ((random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=22&&random[1]!=22)){
                        b18.setText("1");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]!=22&&random[1]!=22)){
                        b18.setText("1");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==22||random[1]==22)){
                        b18.setText("1");
                    }else if ((random[0]==12||random[1]==12)&&(random[0]==17||random[1]==17)&&(random[0]!=22&&random[1]!=22)){
                        b18.setText("2");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]==17||random[1]==17)&&(random[0]==22||random[1]==22)){
                        b18.setText("2");
                    }else if ((random[0]==12||random[1]==12)&&(random[0]!=17&&random[1]!=17)&&(random[0]==22||random[1]==22)){
                        b18.setText("2");
                    }else {
                        b18.setText(" ");
                    }
                    if ((random[0]==9||random[1]==9)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]!=10&&random[1]!=10)&&(random[0]==8||random[1]==8)){
                        b14.setText("1");
                    }else if ((random[0]==9||random[1]==9)&&(random[0]==10||random[1]==10)&&(random[0]!=8&&random[1]!=8)){
                        b14.setText("2");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)&&(random[0]==8||random[1]==8)){
                        b14.setText("2");
                    }else if ((random[0]==9||random[1]==9)&&(random[0]!=10&&random[1]!=10)&&(random[0]==8||random[1]==8)){
                        b14.setText("2");
                    }else {
                        b14.setText(" ");
                    }
                }else if ((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==20||random[1]==20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20||random[1]!=20)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("1");
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b19.setText("1");// 1 c7++;ge qingkuan
                }else if((random[0]==24||random[1]==24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//1 2
                }else if((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//1 3
                }else if((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//1 6
                }else if((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==20||random[1]==20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//1 8
                }else if((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//1 11
                }else if((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//1 12
                }else if((random[0]==24||random[1]==24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b19.setText("2");//1 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//2 3
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//2 6
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==20||random[1]==20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//2 8
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//2 11
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//2 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]==25||random[1]==25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b19.setText("2");//2 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//3 6
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==20||random[1]==20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//3 8
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//3 11
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//3 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b19.setText("2");//3 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]==20||random[1]==20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//6 8
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=20&&random[1]!=20)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//6 11
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//6 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b19.setText("2");//6 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==20||random[1]==20)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//8 11
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==20||random[1]==20)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//8 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==20||random[1]==20)&&(random[0]!=14&&random[1]!=14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b19.setText("2");//8 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]==14||random[1]==14)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)){
                    b19.setText("2");//11 12
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)){
                    b19.setText("2");//11 13
                }else if((random[0]!=24&&random[1]!=24)&&(random[0]!=25&&random[1]!=25)&&(random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)&&(random[0]==13||random[1]==13)){
                    b19.setText("2");//12 13
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b20(View view){
                b20.setClickable(false);
                if(random[0]!=20&&random[1]!=20){
                    b20.setBackgroundColor(Color.parseColor("#808069"));
                    c20++;
                }
                if (random[0]==20||random[1]==20){
                    textView.setText("youlose");
                    b20.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=25&&random[1]!=25&&random[0]!=19&&random[1]!=19&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15) {
                    b20.setText(" ");c14++;c15++;c19++;c24++;c25++;
                    b25.setText(" ");
                    b14.setClickable(false);
                    b15.setClickable(false);
                    b19.setClickable(false);
                    b24.setClickable(false);
                    b25.setClickable(false);
                    b14.setBackgroundColor(Color.parseColor("#808069"));
                    b15.setBackgroundColor(Color.parseColor("#808069"));
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    b24.setBackgroundColor(Color.parseColor("#808069"));
                    b25.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b24.setText("1");
                    }else if ((random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b24.setText("1");
                    }else if ((random[0]==18||random[1]==18)&&(random[0]==13||random[1]==13)){
                        b24.setText("2");
                    }else{
                        b24.setText(" ");
                    }
                    if ((random[0]==9||random[1]==9)&&(random[0]!=10&&random[1]!=10)){
                        b15.setText("1");
                    }else if ((random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)){
                        b15.setText("1");
                    }else if ((random[0]==9||random[1]==9)&&(random[0]==10||random[1]==10)){
                        b15.setText("2");
                    }else{
                        b15.setText(" ");
                    }
                    if ((random[0]==8||random[1]==8)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==9||random[1]==9)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=10&&random[1]!=10)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("1");
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b14.setText("1");
                    }else if ((random[0]==8||random[1]==8)&&(random[0]==9||random[1]==9)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");// 4 9
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//4 12
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=10&&random[1]!=10)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//4 13
                    }else if ((random[0]==8||random[1]==8)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//4 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==9||random[1]==9)&&(random[0]==10||random[1]==10)&&(random[0]!=13||random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//9 12
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==9||random[1]==9)&&(random[0]!=10&&random[1]!=10)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//9 13
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]==9||random[1]==9)&&(random[0]!=10&&random[1]!=10)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//9 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b14.setText("2");//12 13
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=9&&random[1]!=9)&&(random[0]==10||random[1]==10)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//12 14
                    }else if ((random[0]!=8&&random[1]!=8)&&(random[0]!=9&&random[1]!=9)&&(random[0]!=10&&random[1]!=10)&&(random[0]==13||random[1]==13)&&(random[0]==18||random[1]==18)){
                        b14.setText("2");//13 14
                    }else{
                        b14.setText("");
                    }
                    if ((random[0]==23||random[1]==23)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=18&&random[1]!=18)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b19.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==13||random[1]==13)&&(random[0]!=18&&random[1]!=18)){
                        b19.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==13||random[1]==13)&&(random[0]==18||random[1]==18)){
                        b19.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=13&&random[1]!=13)&&(random[0]==18||random[1]==18)){
                        b19.setText("2");
                    }else {
                        b19.setText(" ");
                    }
                }else if((random[0]==24||random[1]==24)&&random[0]!=25&&random[1]!=25&&random[0]!=19&&random[1]!=19&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b20.setText("1");
                }else if(random[0]!=24&&random[1]!=24&&(random[0]==25||random[1]==25)&&random[0]!=19&&random[1]!=19&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b20.setText("1");
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=25&&random[1]!=25&&(random[0]==19||random[1]==19)&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b20.setText("1");
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=25&&random[1]!=25&&random[0]!=19&&random[1]!=19&&(random[0]==14||random[1]==14)&&random[0]!=15&&random[1]!=15){
                    b20.setText("1");
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=25&&random[1]!=25&&random[0]!=19&&random[1]!=19&&random[0]!=14&&random[1]!=14&&(random[0]==15||random[1]==15)){
                    b20.setText("1");
                }else if((random[0]==24||random[1]==24)&&(random[0]==25||random[1]==25)&&random[0]!=19&&random[1]!=19&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b20.setText("2");
                }else if((random[0]==24||random[1]==24)&&random[0]!=25&&random[1]!=25&&random[0]!=19&&random[1]!=19&&(random[0]==14||random[1]==14)&&random[0]!=15&&random[1]!=15){
                    b20.setText("2");
                }else if((random[0]==24||random[1]==24)&&random[0]!=25&&random[1]!=25&&(random[0]==19||random[1]==19)&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b20.setText("2");
                }else if((random[0]==24||random[1]==24)&&random[0]!=25&&random[1]!=25&&random[0]!=19&&random[1]!=19&&random[0]!=14&&random[1]!=14&&(random[0]==15||random[1]==15)){
                    b20.setText("2");
                }else if(random[0]!=24&&random[1]!=24&&(random[0]==25||random[1]==25)&&random[0]!=19&&random[1]!=19&&(random[0]==14||random[1]==14)&&random[0]!=15&&random[1]!=15){
                    b20.setText("2");
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=25&&random[1]!=25&&(random[0]==19||random[1]==19)&&(random[0]==14||random[1]==14)&&random[0]!=15&&random[1]!=15){
                    b20.setText("2");
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=25&&random[1]!=25&&random[0]!=19&&random[1]!=19&&(random[0]==14||random[1]==14)&&(random[0]==15||random[1]==15)){
                    b20.setText("2");
                }else if(random[0]!=24&&random[1]!=24&&(random[0]==25||random[1]==25)&&(random[0]==19||random[1]==19)&&random[0]!=14&&random[1]!=14&&random[0]!=15&&random[1]!=15){
                    b20.setText("2");
                }else if(random[0]!=24&&random[1]!=24&&(random[0]==25||random[1]==25)&&random[0]!=19&&random[1]!=19&&random[0]!=14&&random[1]!=14&&(random[0]==15||random[1]==15)){
                    b20.setText("2");
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=25&&random[1]!=25&&(random[0]==19||random[1]==19)&&random[0]!=14&&random[1]!=14&&(random[0]==15||random[1]==15)){
                    b20.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b21(View view){
                b21.setClickable(false);
                if(random[0]!=21&&random[1]!=21){
                    b21.setBackgroundColor(Color.parseColor("#808069"));
                    c21++;
                }
                if (random[0]==21||random[1]==21){
                    textView.setText("youlose");
                    b21.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if (random[0]!=22&&random[1]!=22&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17){
                    b21.setText(" ");c16++;c17++;c22++;
                    b22.setClickable(false);
                    b16.setClickable(false);
                    b17.setClickable(false);
                    b22.setBackgroundColor(Color.parseColor("#808069"));
                    b16.setBackgroundColor(Color.parseColor("#808069"));
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)){
                        b22.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)){
                        b22.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)){
                        b22.setText("2");
                    }else{
                        b22.setText(" ");
                    }
                    if ((random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)){
                        b16.setText("1");
                    }else if ((random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)){
                        b16.setText("1");
                    }else if ((random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)){
                        b16.setText("2");
                    }else{
                        b16.setText(" ");
                    }
                    if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("1");
                    } else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                        b17.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    } else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)){
                        b17.setText("2");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)){
                        b17.setText("2");
                    }else{
                        b17.setText(" ");
                    }
                }else  if((random[0]==22||random[1]==22)&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17){
                    b21.setText("1");
                }else if ((random[0]==16||random[1]==16)&&random[0]!=22&&random[1]!=22&&random[0]!=17&&random[1]!=17){
                    b21.setText("1");
                } else if ((random[0]==17||random[1]==17)&&random[0]!=22&&random[1]!=22&&random[0]!=16&&random[1]!=16){
                    b21.setText("1");
                }else if ((random[0]==22||random[1]==22)&&(random[0]==16||random[1]==16)&&random[0]!=17&&random[1]!=17){
                    b21.setText("2");
                }else if ((random[0]==22||random[1]==22)&&(random[0]==17||random[1]==17)&&random[0]!=16&&random[1]!=16){
                    b21.setText("2");
                }else if ((random[0]==16||random[1]==16)&&(random[0]==17||random[1]==17)&&random[0]!=22&&random[1]!=22){
                    b21.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b22(View view){
                b22.setClickable(false);
                if(random[0]!=22&&random[1]!=22){
                    b22.setBackgroundColor(Color.parseColor("#808069"));
                    c22++;
                }
                if (random[0]==22||random[1]==22){
                    textView.setText("youlose");
                    b22.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17&&random[0]!=23&&random[1]!=23&&random[0]!=18&&random[1]!=18) {
                    b22.setText(" ");c16++;c17++;c18++;c21++;c23++;
                    b21.setText(" ");
                    b21.setClickable(false);
                    b23.setClickable(false);
                    b16.setClickable(false);
                    b17.setClickable(false);
                    b18.setClickable(false);
                    b21.setBackgroundColor(Color.parseColor("#808069"));
                    b23.setBackgroundColor(Color.parseColor("#808069"));
                    b16.setBackgroundColor(Color.parseColor("#808069"));
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)){
                        b23.setText("1");
                    }else if((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)){
                        b23.setText("1");
                    }else if((random[0]==24||random[1]==24)&&(random[0]==19||random[1]==19)){
                        b23.setText("2");
                    }else{
                        b23.setText(" ");
                    }
                    if ((random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)){
                        b16.setText("1");
                    }else if((random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)){
                        b16.setText("1");
                    }else if((random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)){
                        b16.setText("2");
                    }else{
                        b16.setText(" ");
                    }
                    if ((random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[0]!=13)){
                        b17.setText("1");
                    }else if((random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[0]!=13)){
                        b17.setText("1");
                    }else if((random[0]!=11&&random[1]!=11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[0]==13)){
                        b17.setText("1");
                    }else if((random[0]==11||random[1]==11)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[0]!=13)){
                        b17.setText("2");
                    }else if((random[0]==11||random[1]==11)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[0]==13)){
                        b17.setText("2");
                    }else if((random[0]!=11&&random[1]!=11)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[0]==13)){
                        b17.setText("2");
                    }else{
                        b17.setText(" ");
                    }
                    if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("1");
                    }else if ((random[0]==24||random[1]==24)&&(random[0]==19||random[1]==19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");// 4 9
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//4 12
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//4 13
                    }else if ((random[0]==24||random[1]==24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//4 14
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//9 12
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//9 13
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]==19||random[1]==19)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//9 14
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//12 13
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//12 14
                    }else if ((random[0]!=24&&random[1]!=24)&&(random[0]!=19&&random[1]!=19)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//13 14
                    }else{
                        b18.setText("");
                    }
                }else if ((random[0]==21||random[1]==21)&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17&&random[0]!=23&&random[1]!=23&&random[0]!=18&&random[1]!=18){
                    b22.setText("1");
                }else if(random[0]!=21&&random[1]!=21&&(random[0]==16||random[1]==16)&&random[0]!=17&&random[1]!=17&&random[0]!=23&&random[1]!=23&&random[0]!=18&&random[1]!=18){
                    b22.setText("1");
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=16&&random[1]!=16&&(random[0]==17||random[1]==17)&&random[0]!=23&&random[1]!=23&&random[0]!=18&&random[1]!=18){
                    b22.setText("1");
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17&&(random[0]==23||random[1]==23)&&random[0]!=18&&random[1]!=18){
                    b22.setText("1");
                }else if(random[0]!=21&&random[1]!=21&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17&&random[0]!=23&&random[1]!=23&&(random[0]==18||random[1]==18)){
                    b22.setText("1");
                }else if((random[0]==21||random[1]==21)&&(random[0]==16||random[1]==16)&&random[0]!=17&&random[1]!=17&&random[0]!=23&&random[1]!=23&&random[0]!=18&&random[1]!=18){
                    b22.setText("2");
                }else if ((random[0]==21||random[1]==21)&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17&&(random[0]==23||random[1]==23)&&random[0]!=18&&random[1]!=18){
                    b22.setText("2");
                }else if ((random[0]==21||random[1]==21)&&random[0]!=16&&random[1]!=16&&(random[0]==17||random[1]==17)&&random[0]!=23&&random[1]!=23&&random[0]!=18&&random[1]!=18){
                    b22.setText("2");
                }else if ((random[0]==21||random[1]==21)&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17&&random[0]!=23&&random[1]!=23&&(random[0]==18||random[1]==18)){
                    b22.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&(random[0]==16||random[1]==16)&&random[0]!=17&&random[1]!=17&&(random[0]==23||random[1]==23)&&random[0]!=18&&random[1]!=18){
                    b22.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&random[0]!=16&&random[1]!=16&&(random[0]==17||random[1]==17)&&(random[0]==23||random[1]==23)&&random[0]!=18&&random[1]!=18){
                    b22.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&random[0]!=16&&random[1]!=16&&random[0]!=17&&random[1]!=17&&(random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)){
                    b22.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&(random[0]==16||random[1]==16)&&(random[0]==17||random[1]==17)&&random[0]!=23&&random[1]!=23&&random[0]!=18&&random[1]!=18){
                    b22.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&(random[0]==16||random[1]==16)&&random[0]!=17&&random[1]!=17&&random[0]!=23&&random[1]!=23&&(random[0]==18||random[1]==18)){
                    b22.setText("2");
                }else if (random[0]!=21&&random[1]!=21&&random[0]!=16&&random[1]!=16&&(random[0]==17||random[1]==17)&&random[0]!=23&&random[1]!=23&&(random[0]==18||random[1]==18)){
                    b22.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }


            public void b23(View view){
                b23.setClickable(false);
                if(random[0]!=23&&random[1]!=23){
                    b23.setBackgroundColor(Color.parseColor("#808069"));
                    c23++;
                }
                if (random[0]==23||random[1]==23){
                    textView.setText("youlose");
                    b23.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=22&&random[1]!=22&&random[0]!=24&&random[1]!=24&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19) {
                    b23.setText(" "); c17++;c18++;c19++;c22++;c24++;
                    b22.setClickable(false);
                    b24.setClickable(false);
                    b17.setClickable(false);
                    b18.setClickable(false);
                    b19.setClickable(false);
                    b22.setBackgroundColor(Color.parseColor("#808069"));
                    b24.setBackgroundColor(Color.parseColor("#808069"));
                    b17.setBackgroundColor(Color.parseColor("#808069"));
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    if((random[0]!=21&&random[1]!=21)&&(random[0]==16||random[1]==16)){
                        b22.setText("1");
                    }else if ((random[0]==21||random[1]==21)&&(random[0]!=16&&random[1]!=16)){
                        b22.setText("1");
                    }else if((random[0]==21||random[1]==21)&&(random[0]==16||random[1]==16)){
                        b22.setText("2");
                    }else{
                        b22.setText(" ");
                    }
                    if((random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)){
                        b24.setText("1");
                    }else if((random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)){
                        b24.setText("1");
                    }else if((random[0]==25||random[1]==25)&&(random[0]==20||random[1]==20)){
                        b24.setText("2");
                    }else{
                        b24.setText(" ");
                    }
                    if ((random[0]==21||random[1]==21)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==16||random[1]==16)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]!=16&&random[1]!=16)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("1");
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==11||random[1]==11)){
                        b17.setText("1");
                    }else if ((random[0]==21||random[1]==21)&&(random[0]==16||random[1]==16)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("2");// 4 9
                    }else if ((random[0]==21||random[1]==21)&&(random[0]!=16&&random[1]!=16)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("2");//4 12
                    }else if ((random[0]==21||random[1]==21)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("2");//4 13
                    }else if ((random[0]==21||random[1]==21)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==11||random[1]==11)){
                        b17.setText("2");//4 14
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==16||random[1]==16)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("2");//9 12
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==16||random[1]==16)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("2");//9 13
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]==16||random[1]==16)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==11||random[1]==11)){
                        b17.setText("2");//9 14
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]!=16&&random[1]!=16)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)&&(random[0]!=11&&random[1]!=11)){
                        b17.setText("2");//12 13
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]!=16&&random[1]!=16)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==11||random[1]==11)){
                        b17.setText("2");//12 14
                    }else if ((random[0]!=21&&random[1]!=21)&&(random[0]!=16&&random[1]!=16)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]==11||random[1]==11)){
                        b17.setText("2");//13 14
                    }else{
                        b17.setText("");
                    }
                    if ((random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("1");
                    }else if ((random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");
                    }else if ((random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");
                    }else if ((random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");
                    }else {
                        b18.setText(" ");
                    }
                    if ((random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("1");
                    }else if ((random[0]==25||random[1]==25)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");// 4 9
                    }else if ((random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//4 12
                    }else if ((random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//4 13
                    }else if ((random[0]==25||random[1]==25)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");//4 14
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)&&(random[0]==15||random[1]==15)&&(random[0]!=13||random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//9 12
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//9 13
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]==20||random[1]==20)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");//9 14
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//12 13
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");//12 14
                    }else if ((random[0]!=25&&random[1]!=25)&&(random[0]!=20&&random[1]!=20)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");//13 14
                    }else{
                        b19.setText("");
                    }
                }else if ((random[0]==22||random[1]==22)&&random[0]!=24&&random[1]!=24&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b23.setText("1");
                }else if(random[0]!=22&&random[1]!=22&&(random[0]==24||random[1]==24)&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b23.setText("1");
                }else if(random[0]!=22&&random[1]!=22&&random[0]!=24&&random[1]!=24&&(random[0]==17||random[1]==17)&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b23.setText("1");
                }else if(random[0]!=22&&random[1]!=22&&random[0]!=24&&random[1]!=24&&random[0]!=17&&random[1]!=17&&(random[0]==18||random[1]==18)&&random[0]!=19&&random[1]!=19){
                    b23.setText("1");
                }else if(random[0]!=22&&random[1]!=22&&random[0]!=24&&random[1]!=24&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&(random[0]==19||random[1]==19)){
                    b23.setText("1");
                }else if((random[0]==22||random[1]==22)&&(random[0]==24||random[1]==24)&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b23.setText("2");
                }else if ((random[0]==22||random[1]==22)&&random[0]!=24&&random[1]!=24&&random[0]!=17&&random[1]!=17&&(random[0]==18||random[1]==18)&&random[0]!=19&&random[1]!=19){
                    b23.setText("2");
                }else if ((random[0]==22||random[1]==22)&&random[0]!=24&&random[1]!=24&&(random[0]==17||random[1]==17)&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b23.setText("2");
                }else if ((random[0]==22||random[1]==22)&&random[0]!=24&&random[1]!=24&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&(random[0]==19||random[1]==19)){
                    b23.setText("2");
                }else if (random[0]!=22&&random[1]!=22&&(random[0]==24||random[1]==24)&&random[0]!=17&&random[1]!=17&&(random[0]==18||random[1]==18)&&random[0]!=19&&random[1]!=19){
                    b23.setText("2");
                }else if (random[0]!=22&&random[1]!=22&&random[0]!=24&&random[1]!=24&&(random[0]==17||random[1]==17)&&(random[0]==18||random[1]==18)&&random[0]!=19&&random[1]!=19){
                    b23.setText("2");
                }else if (random[0]!=22&&random[1]!=22&&random[0]!=24&&random[1]!=24&&random[0]!=17&&random[1]!=17&&(random[0]==18||random[1]==18)&&(random[0]==19||random[1]==19)){
                    b23.setText("2");
                }else if (random[0]!=22&&random[1]!=22&&(random[0]==24||random[1]==24)&&(random[0]==17||random[1]==17)&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b23.setText("2");
                }else if (random[0]!=22&&random[1]!=22&&(random[0]==24||random[1]==24)&&random[0]!=17&&random[1]!=17&&random[0]!=18&&random[1]!=18&&(random[0]==19||random[1]==19)){
                    b23.setText("2");
                }else if (random[0]!=22&&random[1]!=22&&random[0]!=24&&random[1]!=24&&(random[0]==17||random[1]==17)&&random[0]!=18&&random[1]!=18&&(random[0]==19||random[1]==19)){
                    b23.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }

            public void b24(View view){
                b24.setClickable(false);
                if(random[0]!=24&&random[1]!=24){
                    b24.setBackgroundColor(Color.parseColor("#808069"));
                    c24++;
                }
                if (random[0]==24||random[1]==24){
                    textView.setText("youlose");
                    b24.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=23&&random[1]!=23&&random[0]!=25&&random[1]!=25&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19) {
                    b24.setText(" ");c19++;c20++;c25++;c18++;c23++;
                    b25.setText(" ");
                    b23.setClickable(false);
                    b25.setClickable(false);
                    b18.setClickable(false);
                    b19.setClickable(false);
                    b20.setClickable(false);
                    b23.setBackgroundColor(Color.parseColor("#808069"));
                    b25.setBackgroundColor(Color.parseColor("#808069"));
                    b18.setBackgroundColor(Color.parseColor("#808069"));
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    b20.setBackgroundColor(Color.parseColor("#808069"));
                    if((random[0]!=22&&random[1]!=22)&&(random[0]==17||random[1]==17)){
                        b23.setText("1");
                    }else if ((random[0]==22||random[1]==22)&&(random[0]!=17&&random[1]!=17)){
                        b23.setText("1");
                    }else if((random[0]==22||random[1]==22)&&(random[0]==17||random[1]==17)){
                        b23.setText("2");
                    }else{
                        b23.setText(" ");
                    }
                    if ((random[0]==22||random[1]==22)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]==17||random[1]==17)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]!=17&&random[1]!=17)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("1");
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("1");
                    }else if ((random[0]==22||random[1]==22)&&(random[0]==17||random[1]==17)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");// 4 9
                    }else if ((random[0]==22||random[1]==22)&&(random[0]!=17&&random[1]!=17)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//4 12
                    }else if ((random[0]==22||random[1]==22)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//4 13
                    }else if ((random[0]==22||random[1]==22)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//4 14
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]==17||random[1]==17)&&(random[0]==12||random[1]==12)&&(random[0]!=13||random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//9 12
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]==17||random[1]==17)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//9 13
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]==17||random[1]==17)&&(random[0]!=12&&random[1]!=12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//9 14
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]!=17&&random[1]!=17)&&(random[0]==12||random[1]==12)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b18.setText("2");//12 13
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]!=17&&random[1]!=17)&&(random[0]==12||random[1]==12)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//12 14
                    }else if ((random[0]!=22&&random[1]!=22)&&(random[0]!=17&&random[1]!=17)&&(random[0]!=12&&random[1]!=12)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b18.setText("2");//13 14
                    }else{
                        b18.setText("");
                    }
                    if ((random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("1");
                    }else if ((random[0]==15||random[1]==15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");
                    }else if ((random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");
                    }else if ((random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");
                    }else {
                        b19.setText(" ");
                    }
                    if((random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)){
                        b20.setText("1");
                    }else if ((random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)){
                        b20.setText("1");
                    }else if((random[0]==14||random[1]==14)&&(random[0]==15||random[1]==15)){
                        b20.setText("2");
                    }else{
                        b20.setText(" ");
                    }
                }else if ((random[0]==23||random[1]==23)&&random[0]!=25&&random[1]!=25&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b24.setText("1");
                }else if(random[0]!=23&&random[1]!=23&&(random[0]==25||random[1]==25)&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b24.setText("1");
                }else if(random[0]!=23&&random[1]!=23&&random[0]!=25&&random[1]!=25&&(random[0]==20||random[1]==20)&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b24.setText("1");
                }else if(random[0]!=23&&random[1]!=23&&random[0]!=25&&random[1]!=25&&random[0]!=20&&random[1]!=20&&(random[0]==18||random[1]==18)&&random[0]!=19&&random[1]!=19){
                    b24.setText("1");
                }else if(random[0]!=23&&random[1]!=23&&random[0]!=25&&random[1]!=25&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&(random[0]==19||random[1]==19)){
                    b24.setText("1");
                }else if((random[0]==23||random[1]==23)&&(random[0]==25||random[1]==25)&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b24.setText("2");
                }else if ((random[0]==23||random[1]==23)&&random[0]!=25&&random[1]!=25&&random[0]!=20&&random[1]!=20&&(random[0]==18||random[1]==18)&&random[0]!=19&&random[1]!=19){
                    b24.setText("2");
                }else if ((random[0]==23||random[1]==23)&&random[0]!=25&&random[1]!=25&&(random[0]==20||random[1]==20)&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b24.setText("2");
                }else if ((random[0]==23||random[1]==23)&&random[0]!=25&&random[1]!=25&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&(random[0]==19||random[1]==19)){
                    b24.setText("2");
                }else if (random[0]!=23&&random[1]!=23&&(random[0]==25||random[1]==25)&&random[0]!=20&&random[1]!=20&&(random[0]==18||random[1]==18)&&random[0]!=19&&random[1]!=19){
                    b24.setText("2");
                }else if (random[0]!=23&&random[1]!=23&&random[0]!=25&&random[1]!=25&&(random[0]==20||random[1]==20)&&(random[0]==18||random[1]==18)&&random[0]!=19&&random[1]!=19){
                    b24.setText("2");
                }else if (random[0]!=23&&random[1]!=23&&random[0]!=25&&random[1]!=25&&random[0]!=20&&random[1]!=20&&(random[0]==18||random[1]==18)&&(random[0]==19||random[1]==19)){
                    b24.setText("2");
                }else if (random[0]!=23&&random[1]!=23&&(random[0]==25||random[1]==25)&&(random[0]==20||random[1]==20)&&random[0]!=18&&random[1]!=18&&random[0]!=19&&random[1]!=19){
                    b24.setText("2");
                }else if (random[0]!=23&&random[1]!=23&&(random[0]==25||random[1]==25)&&random[0]!=20&&random[1]!=20&&random[0]!=18&&random[1]!=18&&(random[0]==19||random[1]==19)){
                    b24.setText("2");
                }else if (random[0]!=23&&random[1]!=23&&random[0]!=25&&random[1]!=25&&(random[0]==20||random[1]==20)&&random[0]!=18&&random[1]!=18&&(random[0]==19||random[1]==19)){
                    b24.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
            public void b25(View view){
                b25.setClickable(false);
                if(random[0]!=25&&random[1]!=25){
                    b25.setBackgroundColor(Color.parseColor("#808069"));
                    c25++;
                }
                if (random[0]==25||random[1]==25){
                    textView.setText("youlose");
                    b25.setBackgroundColor(Color.parseColor("#FF0000"));
                    lose();
                }else if(random[0]!=24&&random[1]!=24&&random[0]!=19&&random[1]!=19&&random[0]!=20&&random[1]!=20){
                    b25.setText(" ");c19++;c20++;c24++;
                    b24.setClickable(false);
                    b19.setClickable(false);
                    b20.setClickable(false);
                    b24.setBackgroundColor(Color.parseColor("#808069"));
                    b19.setBackgroundColor(Color.parseColor("#808069"));
                    b20.setBackgroundColor(Color.parseColor("#808069"));
                    if((random[0]!=14&&random[1]!=14)&&(random[0]==15||random[1]==15)){
                        b20.setText("1");
                    }else if ((random[0]==14||random[1]==14)&&(random[0]!=15&&random[1]!=15)){
                        b20.setText("1");
                    }else if((random[0]==14||random[1]==14)&&(random[0]==15||random[1]==15)){
                        b20.setText("2");
                    }else{
                        b20.setText(" ");
                    }
                    if((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)){
                        b24.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)){
                        b24.setText("1");
                    }else if((random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)){
                        b24.setText("2");
                    }else{
                        b24.setText(" ");
                    }
                    if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("1");
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("1");
                    }else if ((random[0]==23||random[1]==23)&&(random[0]==18||random[1]==18)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");// 4 9
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//4 12
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//4 13
                    }else if ((random[0]==23||random[1]==23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");//4 14
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]==15||random[1]==15)&&(random[0]!=13||random[1]!=13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//9 12
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//9 13
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]==18||random[1]==18)&&(random[0]!=15&&random[1]!=15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");//9 14
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==15||random[1]==15)&&(random[0]==13||random[1]==13)&&(random[0]!=14&&random[1]!=14)){
                        b19.setText("2");//12 13
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]==15||random[1]==15)&&(random[0]!=13&&random[1]!=13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");//12 14
                    }else if ((random[0]!=23&&random[1]!=23)&&(random[0]!=18&&random[1]!=18)&&(random[0]!=15&&random[1]!=15)&&(random[0]==13||random[1]==13)&&(random[0]==14||random[1]==14)){
                        b19.setText("2");//13 14
                    }else{
                        b19.setText("");
                    }
                }else if((random[0]==24||random[1]==24)&&random[0]!=19&&random[1]!=19&&random[0]!=20&&random[1]!=20){
                    b25.setText("1");
                }else if (random[0]!=24&&random[1]!=24&&(random[0]==19||random[1]==19)&&random[0]!=20&&random[1]!=20){
                    b25.setText("1");
                } else if (random[0]!=24&&random[1]!=24&&random[0]!=19&&random[1]!=19&&(random[0]==20||random[1]==20)){
                    b25.setText("1");
                }else if ((random[0]==24||random[1]==24)&&(random[0]==19||random[1]==19)&&random[0]!=20&&random[1]!=20){
                    b25.setText("2");
                }else if ((random[0]==24||random[1]==24)&&random[0]!=19&&random[1]!=19&&(random[0]==20||random[1]==20)){
                    b25.setText("2");
                }else if (random[0]!=24&&random[1]!=24&&(random[0]==19||random[1]==19)&&(random[0]==20||random[1]==20)){
                    b25.setText("2");
                }
                checkgame();
                checkgame1();
                checkgame2();
            }
    private Runnable updateTimer = new Runnable()
    {
        public void run()
        {
            long spentTime = System.currentTimeMillis() - startTime;
            //計算目前已過秒數
            final long seconds = (spentTime/1000);
            Time.setText(seconds+"sec");
            handler.postDelayed(this, 1000);
        }
    };

    private Runnable update = new Runnable()
    {
        public void run()
        {
            long spentTime = System.currentTimeMillis() - startTime;
            //計算目前已過秒數
            final long seconds = (spentTime/1000);
            Time.setText(seconds+"sec");
            handler.postDelayed(this, 1000);
        }
    };


    private Runnable u = new Runnable()
    {
        public void run()
        {
            long spentTime = System.currentTimeMillis() - startTime;
            //計算目前已過秒數
            final long seconds = (spentTime/1000);
            Time.setText(seconds+"sec");
            handler.postDelayed(this, 1000);
        }
    };
}




