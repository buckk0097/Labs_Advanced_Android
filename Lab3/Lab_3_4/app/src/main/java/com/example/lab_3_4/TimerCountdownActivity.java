package com.example.lab_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

@SuppressLint("Registered")
public class TimerCountdownActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer_view);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.timer);
        final TextView textView = findViewById(R.id.textView);
        assert message != null;
        new CountDownTimer(Integer.parseInt(message)*1000, 1000) {

            @SuppressLint("SetTextI18n")
            public void onTick(long millisUntilFinished) {
                textView.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            @SuppressLint("SetTextI18n")
            public void onFinish() {
                textView.setText("done!");
            }
        }.start();

    }
}