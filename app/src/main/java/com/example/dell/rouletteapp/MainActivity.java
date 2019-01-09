package com.example.dell.rouletteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    Button button;
    ImageView iv_outside_ring;
    Random r;
    int degree =0,degree_old =0;
    private static final float FACTOR=4.86f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_welcome_message);
        button = findViewById(R.id.btn_submit);
        iv_outside_ring = findViewById(R.id.iv_outside_circle);
        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                degree_old = degree %360;
                degree =r.nextInt(3600)+720;
                RotateAnimation rotate = new RotateAnimation(degree_old,degree,
                         RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                          textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                           textView.setText(currentNumber(360-(degree%360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                iv_outside_ring.startAnimation(rotate);

            }
        });
    }

    private String currentNumber(int degree){
        String text="";

        if ((degree>=(FACTOR*1)) && (degree < (FACTOR*3))) {
            text = "32 red";
        }
        if ((degree>=(FACTOR*3)) && (degree < (FACTOR*5))) {
            text = "15 black";
        }
        if ((degree>=(FACTOR*5)) && (degree < (FACTOR*7))) {
            text = "19 red";
        }
        if ((degree>=(FACTOR*7)) && (degree < (FACTOR*9))) {
            text = "4 black";
        }
        if ((degree>=(FACTOR*9)) && (degree < (FACTOR*11))) {
            text = "21 red";
        }
        if ((degree>=(FACTOR*11)) && (degree < (FACTOR*13))) {
            text = "2 black";
        }
        if ((degree>=(FACTOR*13)) && (degree < (FACTOR*15))) {
            text = "25 red";
        }
        if ((degree>=(FACTOR*15)) && (degree < (FACTOR*17))) {
            text = "17 black";
        }
        if ((degree>=(FACTOR*17)) && (degree < (FACTOR*19))) {
            text = "37 red";
        }
        if ((degree>=(FACTOR*19)) && (degree < (FACTOR*21))) {
            text = "6 black";
        }
        if ((degree>=(FACTOR*21)) && (degree < (FACTOR*23))) {
            text = "27 red";
        }
        if ((degree>=(FACTOR*23)) && (degree < (FACTOR*25))) {
            text = "13 black";
        }
        if ((degree>=(FACTOR*25)) && (degree < (FACTOR*27))) {
            text = "36 red";
        }
        if ((degree>=(FACTOR*27)) && (degree < (FACTOR*29))) {
            text = "11 black";
        }
        if ((degree>=(FACTOR*29)) && (degree < (FACTOR*31))) {
            text = "30 red";
        }
        if ((degree>=(FACTOR*31)) && (degree < (FACTOR*33))) {
            text = "8 black";
        }
        if ((degree>=(FACTOR*33)) && (degree < (FACTOR*35))) {
            text = "23 red";
        }
        if ((degree>=(FACTOR*35)) && (degree < (FACTOR*37))) {
            text = "10 black";
        }
        if ((degree>=(FACTOR*37)) && (degree < (FACTOR*39))) {
            text = "5 red";
        }
        if ((degree>=(FACTOR*39)) && (degree < (FACTOR*41))) {
            text = "24 black";
        }
        if ((degree>=(FACTOR*41)) && (degree < (FACTOR*43))) {
            text = "16 red";
        }
        if ((degree>=(FACTOR*43)) && (degree < (FACTOR*45))) {
            text = "33 black";
        }
        if ((degree>=(FACTOR*45)) && (degree < (FACTOR*47))) {
            text = "1 red";
        }
        if ((degree>=(FACTOR*47)) && (degree < (FACTOR*49))) {
            text = "20 black";
        }
        if ((degree>=(FACTOR*49)) && (degree < (FACTOR*51))) {
            text = "14 red";
        }
        if ((degree>=(FACTOR*51)) && (degree < (FACTOR*53))) {
            text = "31 black";
        }
        if ((degree>=(FACTOR*53)) && (degree < (FACTOR*55))) {
            text = "9 red";
        }
        if ((degree>=(FACTOR*55)) && (degree < (FACTOR*57))) {
            text = "22 black";
        }
        if ((degree>=(FACTOR*57)) && (degree < (FACTOR*59))) {
            text = "18 red";
        }
        if ((degree>=(FACTOR*59)) && (degree < (FACTOR*61))) {
            text = "29 black";
        }
        if ((degree>=(FACTOR*61)) && (degree < (FACTOR*63))) {
            text = "7 red";
        }
        if ((degree>=(FACTOR*63)) && (degree < (FACTOR*65))) {
            text = "28 black";
        }
        if ((degree>=(FACTOR*65)) && (degree < (FACTOR*67))) {
            text = "12 red";
        }
        if ((degree>=(FACTOR*67)) && (degree < (FACTOR*69))) {
            text = "35 black";
        }
        if ((degree>=(FACTOR*69)) && (degree < (FACTOR*71))) {
            text = "3 red";
        }
        if ((degree>=(FACTOR*71)) && (degree < (FACTOR*73))) {
            text = "26 black";
        }
        if (((degree >=(FACTOR*73)) && degree < 360 ) || (degree >=0 && degree <(FACTOR*1))) {
            text = "0";
        }

        return text;
    }
}
