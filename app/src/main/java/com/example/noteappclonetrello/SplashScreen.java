package com.example.noteappclonetrello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Animation atas, bawah;
    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        atas = AnimationUtils.loadAnimation(this, R.anim.atasanimasi);
        bawah = AnimationUtils.loadAnimation(this, R.anim.bawahanimasi);
        textView = findViewById(R.id.splashscreen);
        imageView = findViewById(R.id.imageView5);
        textView.setAnimation(bawah);
        imageView.setAnimation(atas);

        final Intent intent = new Intent(SplashScreen.this, OnBoardingOne.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}