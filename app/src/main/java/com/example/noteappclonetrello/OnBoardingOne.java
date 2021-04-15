package com.example.noteappclonetrello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoardingOne extends AppCompatActivity {

    private Button nextt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_one);
        nextt = findViewById(R.id.next);

        nextt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(OnBoardingOne.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}