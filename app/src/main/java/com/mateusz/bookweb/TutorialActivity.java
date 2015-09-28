package com.mateusz.bookweb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.mateusz.bookweb.R;

/**
 * Created by Mateusz on 2015-09-27.
 */
public class TutorialActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
    }

    public void onNextClick(View view) {
        Intent intent =new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
