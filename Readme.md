# ADS04 Android

## 수업 내용

- spreadCube 예제 및 실습

## Code Review

```Java
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
```

- 버튼이 하나인 관계로 if/else if문을 사용해 퍼지고, 모이는 것을 구현함
- 회전 수를 크게 하면 할 수록 빨라지고, 음수로 지정해주면 시계반대방향으로 돔.

## 보충설명

- 플래그 값을 지정해주어서, 산개가 되는것과 응집이 되는 것을 컨트롤함.

#### 참고자료: https://developer.android.com/reference/android/animation/package-summary.html
#### 참고자료: https://developer.android.com/guide/topics/resources/animation-resource.html

## TODO

- 반복되고 비효율적인 로직 리팩토링

## Retrospect

- 코드가 비효율적이라는 생각이 듬. 큰 내용이 없음에도 불구하고 코드가 굉장히 길다. 리팩토링이 필요함.

## Output

![animation_spreadcube](https://user-images.githubusercontent.com/31605792/34641814-1566ae1a-f34d-11e7-8379-f47ed7046224.gif)



