package com.example.tt.animatebuttondemo;

import android.animation.Animator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Animation translate =  AnimationUtils.loadAnimation(this, R.anim.translate);
        final Animation alpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
        final Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale);
        final Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        //Animation complex = AnimationUtils.loadAnimation(this, R.anim.complex);


        Button translateBtn = (Button) findViewById(R.id.translate);
        Button alphaBtn = (Button) findViewById(R.id.alpha);
        Button scaleBtn = (Button) findViewById(R.id.scale);
        Button rotateBtn = (Button) findViewById(R.id.rotate);
        Button complexBtn = (Button) findViewById(R.id.complex);

        translateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(translate);
            }
        });
        alphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(alpha);
            }
        });
        scaleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(scale);
            }
        });
        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(rotate);
            }
        });
        complexBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationSet an = new AnimationSet(false);
                an.addAnimation(rotate);
                an.addAnimation(alpha);
                an.addAnimation(scale);
                v.startAnimation(an);
            }
        });

    }


}
