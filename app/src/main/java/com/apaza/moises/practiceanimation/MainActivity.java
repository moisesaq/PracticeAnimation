package com.apaza.moises.practiceanimation;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import oxim.digital.rx2anim.RxAnimationBuilder;
import oxim.digital.rx2anim.RxAnimations;

public class MainActivity extends BaseActivity implements View.OnClickListener{
    private static final String TAG = MainActivity.class.getSimpleName();

    private Unbinder unbinder;

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.image_view) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings)
            LottieActivity.start(this);
        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.btn_translate, R.id.btn_scale, R.id.btn_fade})
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_translate:
                //AnimationUtils.translateAnimationY(imageView);
                translate();
                break;
            case R.id.btn_scale:
                //AnimationUtils.scaleAnimation(imageView);
                scale();
                break;
            case R.id.btn_fade:
                AnimationUtils.rotateAnimationY(imageView);
                break;
        }
    }

    private void translate(){
        RxAnimations.slideVertical(imageView, 500, -imageView.getHeight())
                .subscribe();
    }

    private void scale(){
        RxAnimationBuilder.animate(imageView)
                .scale(0.5f,0.5f)
                .schedule().subscribe();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
