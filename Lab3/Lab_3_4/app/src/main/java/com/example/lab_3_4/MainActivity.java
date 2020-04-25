package com.example.lab_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String timer = "com.example.myfirstapp.MESSAGE";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
public void openActivity2() {
        Intent intent = new Intent(this, TimerCountdownActivity.class);
    EditText editText = (EditText) findViewById(R.id.time);
    String text = editText.getText().toString();
    intent.putExtra(timer,text);
        startActivity(intent);
    }
}
