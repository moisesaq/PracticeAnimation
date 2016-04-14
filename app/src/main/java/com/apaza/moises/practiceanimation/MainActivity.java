package com.apaza.moises.practiceanimation;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button anim1, anim2, anim3;
    private ImageView image;
    private LinearLayout signUpLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        setup();
    }

    private void setup(){
        anim1 = (Button)findViewById(R.id.button);
        anim1.setOnClickListener(this);
        anim2 = (Button)findViewById(R.id.button2);
        anim2.setOnClickListener(this);
        anim3 = (Button)findViewById(R.id.button3);
        anim3.setOnClickListener(this);
        image = (ImageView)findViewById(R.id.imageAnimate);
        signUpLayout = (LinearLayout)findViewById(R.id.signUpLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
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
                Snackbar.make(v, "Animation", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                ObjectAnimator.ofFloat(image, "alpha", 0f)
                        .setDuration(500)
                        .start();
                break;
            case R.id.button2:
                ObjectAnimator.ofFloat(image, "alpha", 1f)
                        .setDuration(500)
                        .start();
                break;
            case R.id.button3:
                break;
        }
    }
}
