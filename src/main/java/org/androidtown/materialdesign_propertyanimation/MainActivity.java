package org.androidtown.materialdesign_propertyanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn_spread;
    static boolean re = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        onclickListener();
    }


    public void init() {

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn_spread = (Button) findViewById(R.id.btn_spread);

    }

    public void onclickListener() {

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn_spread.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (re == false) {
            move();
            rotate();
            re = true;
        } else if (re == true) {
            movere();
            rotatere();
            re = false;
        }


    }


    public void move() {

        ObjectAnimator btn1Y = ObjectAnimator.ofFloat(

                btn1, "translationY", 200
        );

        ObjectAnimator btn1X = ObjectAnimator.ofFloat(

                btn1, "translationX", 200
        );

        ObjectAnimator btn2Y = ObjectAnimator.ofFloat(

                btn2, "translationY", 200
        );

        ObjectAnimator btn2X = ObjectAnimator.ofFloat(

                btn2, "translationX", -200
        );
        ObjectAnimator btn3Y = ObjectAnimator.ofFloat(

                btn3, "translationY", -200
        );

        ObjectAnimator btn3X = ObjectAnimator.ofFloat(

                btn3, "translationX", 200
        );
        ObjectAnimator btn4Y = ObjectAnimator.ofFloat(

                btn4, "translationY", -200
        );

        ObjectAnimator btn4X = ObjectAnimator.ofFloat(

                btn4, "translationX", -200
        );

        AnimatorSet aniSet = new AnimatorSet();
        aniSet.playTogether(btn1Y, btn1X);
        aniSet.playTogether(btn2Y, btn2X);
        aniSet.playTogether(btn3Y, btn3X);
        aniSet.playTogether(btn4Y, btn4X);
        aniSet.setDuration(150);
        aniSet.setInterpolator(new LinearInterpolator());
        aniSet.start();


    }

    public void rotate() {
        ObjectAnimator btn1s = ObjectAnimator.ofFloat(

                btn1, "rotation", 3600
        );


        ObjectAnimator btn2s = ObjectAnimator.ofFloat(

                btn2, "rotation", 3600
        );


        ObjectAnimator btn3s = ObjectAnimator.ofFloat(

                btn3, "rotation", 3600
        );


        ObjectAnimator btn4s = ObjectAnimator.ofFloat(

                btn4, "rotation", 3600
        );


        btn1s.setDuration(3000);
        btn2s.setDuration(3000);
        btn3s.setDuration(3000);
        btn4s.setDuration(3000);
        btn1s.start();
        btn2s.start();
        btn3s.start();
        btn4s.start();

    }

    public void movere() {
        ObjectAnimator btn1Y = ObjectAnimator.ofFloat(

                btn1, "translationY", 0
        );

        ObjectAnimator btn1X = ObjectAnimator.ofFloat(

                btn1, "translationX", 0
        );

        ObjectAnimator btn2Y = ObjectAnimator.ofFloat(

                btn2, "translationY", 0
        );

        ObjectAnimator btn2X = ObjectAnimator.ofFloat(

                btn2, "translationX", 0
        );
        ObjectAnimator btn3Y = ObjectAnimator.ofFloat(

                btn3, "translationY", 0
        );

        ObjectAnimator btn3X = ObjectAnimator.ofFloat(

                btn3, "translationX", 0
        );
        ObjectAnimator btn4Y = ObjectAnimator.ofFloat(

                btn4, "translationY", 0
        );

        ObjectAnimator btn4X = ObjectAnimator.ofFloat(

                btn4, "translationX", 0
        );

        AnimatorSet aniSet = new AnimatorSet();
        aniSet.playTogether(btn1Y, btn1X);
        aniSet.playTogether(btn2Y, btn2X);
        aniSet.playTogether(btn3Y, btn3X);
        aniSet.playTogether(btn4Y, btn4X);
        aniSet.setDuration(150);
        aniSet.setInterpolator(new LinearInterpolator());
        aniSet.start();


    }

    public void rotatere() {

        ObjectAnimator btn1s = ObjectAnimator.ofFloat(

                btn1, "rotation", -3600
        );


        ObjectAnimator btn2s = ObjectAnimator.ofFloat(

                btn2, "rotation", -3600
        );


        ObjectAnimator btn3s = ObjectAnimator.ofFloat(

                btn3, "rotation", -3600
        );


        ObjectAnimator btn4s = ObjectAnimator.ofFloat(

                btn4, "rotation", -3600
        );


        btn1s.setDuration(1000);
        btn2s.setDuration(1000);
        btn3s.setDuration(1000);
        btn4s.setDuration(1000);
        btn1s.start();
        btn2s.start();
        btn3s.start();
        btn4s.start();

    }


}
