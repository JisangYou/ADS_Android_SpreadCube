# 애니메이션 실습
## 설명
- 한곳에 모여있는 네개의 정사각형
- 버튼을 누르면, 퍼지면서 큰 정사각형을 만듦
- 퍼질 때 회전을 함.
- 다시 버튼을 누르면 같은 방법으로 다시 하나의 정사각형으로 모여지는 구조
- 추후 gif로 올릴 필요있음

### 소스코드
```Java
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

                btn1, "translationY", 150
        );

        ObjectAnimator btn1X = ObjectAnimator.ofFloat(

                btn1, "translationX", 150
        );

        ObjectAnimator btn2Y = ObjectAnimator.ofFloat(

                btn2, "translationY", 150
        );

        ObjectAnimator btn2X = ObjectAnimator.ofFloat(

                btn2, "translationX", -150
        );
        ObjectAnimator btn3Y = ObjectAnimator.ofFloat(

                btn3, "translationY", -150
        );

        ObjectAnimator btn3X = ObjectAnimator.ofFloat(

                btn3, "translationX", 150
        );
        ObjectAnimator btn4Y = ObjectAnimator.ofFloat(

                btn4, "translationY", -150
        );

        ObjectAnimator btn4X = ObjectAnimator.ofFloat(

                btn4, "translationX", -150
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
```

- 버튼이 하나인 관계로 if/else if문을 사용해 퍼지고, 모이는 것을 구현함
- ObjectAnimator로 각 버튼들을 지정, translation함수를 이용해 '움직임'을 지정, 상대적 위치값 150지정(정사각형의 한변 길이만큼)
- ObjectAnimator로 각 버튼들을 지정, rotate함수를 이용해 '회전'을 지정, translation과 달리, 하나의 버튼만 고려!
- 회전 수를 크게 하면 할 수록 빨라지고, 음수로 지정해주면 시계반대방향으로 돔.
