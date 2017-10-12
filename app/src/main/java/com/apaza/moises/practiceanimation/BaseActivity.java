package com.apaza.moises.practiceanimation;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity{

    protected void showMessage(String message) {
        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();
    }
}
