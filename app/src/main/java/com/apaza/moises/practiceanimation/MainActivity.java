package com.apaza.moises.practiceanimation;

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

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnAnim1, btnAnim2, btnAnim3, pick;
    private ImageButton image;
    private LinearLayout signUpLayout;
    private LinearLayout ly1, ly2, ly3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setup();
    }

    private void setup(){
        btnAnim1 = (Button)findViewById(R.id.button);
        btnAnim1.setOnClickListener(this);
        btnAnim2 = (Button)findViewById(R.id.button2);
        btnAnim2.setOnClickListener(this);
        btnAnim3 = (Button)findViewById(R.id.button3);
        btnAnim3.setOnClickListener(this);
        pick = (Button)findViewById(R.id.pick);
        pick.setOnClickListener(this);
        image = (ImageButton)findViewById(R.id.imageAnimate);
        signUpLayout = (LinearLayout)findViewById(R.id.signUpLayout);

        ly1 = (LinearLayout)findViewById(R.id.layout1);
        ly1.setOnClickListener(this);
        ly2 = (LinearLayout)findViewById(R.id.layout2);
        ly3 = (LinearLayout)findViewById(R.id.layout3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                AnimationUtils.animation1(image);
                break;
            case R.id.button2:
                //AnimationUtils.animation2(image);
                AnimationUtils.animation5(image, btnAnim2);
                /*ObjectAnimator.ofFloat(image, "alpha", 1f)
                        .setDuration(500)
                        .start();*/
                break;
            case R.id.button3:
                //AnimationUtils.animation3(image);
                AnimationUtils.animation5(image, btnAnim3);
                break;
            case R.id.pick:
                AnimationUtils.animation2(ly2);
                break;
        }
    }

    /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setup();*/
}
