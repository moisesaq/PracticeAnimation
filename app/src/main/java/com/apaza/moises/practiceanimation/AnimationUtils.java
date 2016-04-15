package com.apaza.moises.practiceanimation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

public class AnimationUtils {

    public static void animation1(View view){
        /*ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.25f, 0.75f, 0.15f, 0.5f, 0.0f)
                .setDuration(500)
                .start();*/
        ObjectAnimator animX = ObjectAnimator.ofFloat(view, "x", 0f);
        ObjectAnimator animY = ObjectAnimator.ofFloat(view, "y", 500f);
        AnimatorSet animSetXY = new AnimatorSet();
        animSetXY.playTogether(animX, animY);
        animSetXY.start();
    }

    public static void animation2(View view){
        ObjectAnimator animX = ObjectAnimator.ofFloat(view, "x", 0f);
        ObjectAnimator animY = ObjectAnimator.ofFloat(view, "y", 0f);
        AnimatorSet animSetXY = new AnimatorSet();
        animSetXY.playTogether(animX, animY);
        animSetXY.start();
    }

    public static void animation3(View view){
        ObjectAnimator animator = new ObjectAnimator().ofFloat(view, "rotationY", 0.0f, 360f);
        animator.setDuration(4000);
        animator.setRepeatCount(2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.start();
    }
}
