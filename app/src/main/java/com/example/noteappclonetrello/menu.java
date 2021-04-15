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

public class menu extends AppCompatActivity {
    private Button mulai, keluar;
    Animation atas, bawah;
    ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mulai = findViewById(R.id.button);
        keluar = findViewById(R.id.button2);

        atas = AnimationUtils.loadAnimation(this, R.anim.atasanimasi);
        bawah = AnimationUtils.loadAnimation(this, R.anim.bawahanimasi);
        imageView = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView4);
        mulai.setAnimation(bawah);
        keluar.setAnimation(bawah);
        imageView.setAnimation(atas);
        imageView2.setAnimation(atas);

        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(menu.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}