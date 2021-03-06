package com.example.noteappclonetrello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class OnBoardingOne extends AppCompatActivity {
    Animation atas, bawah;
    TextView textView, textView2;
    ImageView imageView;
    private Button nextt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_one);
        nextt = findViewById(R.id.next);

        atas = AnimationUtils.loadAnimation(this, R.anim.atasanimasi);
        bawah = AnimationUtils.loadAnimation(this, R.anim.bawahanimasi);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView3);
        imageView = findViewById(R.id.imageView3);
        textView.setAnimation(bawah);
        textView2.setAnimation(bawah);
        imageView.setAnimation(atas);

        nextt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(OnBoardingOne.this, menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}