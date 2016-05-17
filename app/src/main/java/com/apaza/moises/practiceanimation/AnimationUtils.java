package com.apaza.moises.practiceanimation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.widget.Toast;

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

    public static void animation2(final View view){
        ObjectAnimator animX = ObjectAnimator.ofFloat(view, "x", 0f);
        ObjectAnimator animY = ObjectAnimator.ofFloat(view, "y", 0f);
        final AnimatorSet animSetXY = new AnimatorSet();
        animSetXY.setDuration(300);
        animSetXY.setInterpolator(new AccelerateInterpolator());
        animSetXY.playTogether(animX, animY);
        animSetXY.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Toast.makeText(view.getContext(), "End animation", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        animSetXY.start();

    }



    public static void animation3(View view){
        ObjectAnimator animator = new ObjectAnimator().ofFloat(view, "rotationY", 0.0f, 360f);
        animator.setDuration(4000);
        animator.setRepeatCount(2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.start();
    }


    public static void animation4(final View view){
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationY", -100f);
        animator.setDuration(500);
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.start();

    }
}
