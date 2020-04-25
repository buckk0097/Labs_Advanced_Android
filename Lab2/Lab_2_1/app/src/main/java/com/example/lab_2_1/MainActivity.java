package com.example.lab_2_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public int times_button_clicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Button gameButton = new Button(this);
        gameButton.setText("Hello, I'm the button");

        setContentView(gameButton);


        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                times_button_clicked ++;
                if (times_button_clicked == 1) {
                    gameButton.setText("YOU HAVE PRESSED THE BUTTON " + times_button_clicked + " TIMES");
                }
                else{
                    gameButton.setText("YOU HAVE PRESSED THE BUTTON " + times_button_clicked + " TIMES");
                }
            }
        });
    }
}
