package com.apaza.moises.practiceanimation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LottieActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;

    public static void start(Context context){
        Intent intent = new Intent(context, LottieActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

}
