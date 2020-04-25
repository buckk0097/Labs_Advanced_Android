package com.example.lab_2_4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

                // CREATION OF 3 LAYOUT FOR THE APPLICATION
                // THE FIRST LAYOUT IS FOR THE WHOLE ACTIVITY
                // THE BTNLAYOUT1 AND BTNLAYOUT2 ARE FOR THE 4 GREETING BUTTONS
        LinearLayout layout = new LinearLayout(this);
        LinearLayout btnLayout1 = new LinearLayout(this);
        LinearLayout btnLayout2 = new LinearLayout(this);

                // CREATION OF THE FOUR BUTTON
        Button englishBtn = new Button(this);
        Button sverigeBtn = new Button(this);
        Button suomeksiBtn = new Button(this);
        Button surpriseBtn = new Button(this);

                // SETTING ORIENTATION AND GRAVITY FOR THE COMPONENETS TO LOOK LIKE THE EXERCISE REQUIREMENT
        layout.setOrientation(LinearLayout.VERTICAL);
                // note orientation for others is by default horizental
                // seeting gravity to center the buttons
        btnLayout1.setGravity(Gravity.CENTER);
        btnLayout2.setGravity(Gravity.CENTER);

                // SETTING THE TEXT OF THE FOUR BUTTONS
        englishBtn.setText("English");
        sverigeBtn.setText("Sverige");
        suomeksiBtn.setText("Suomeksi");
        surpriseBtn.setText("Surprise");

        //surpriseBtn.setId(1);
                // creation of buttonview for the four buttons
        btnLayout1.addView(englishBtn);
        btnLayout1.addView(sverigeBtn);
        btnLayout2.addView(suomeksiBtn);
        btnLayout2.addView(surpriseBtn);

                // CREATION OF THE TEXTVIEW AND EDITTEXT
        final TextView textView = new TextView(this);
        final EditText editText= new EditText(this);

                // SETTING GRAVITY FOR THE TEXTVIEW AND MAKING THE TEXT BIGGER
        textView.setGravity(Gravity.CENTER_HORIZONTAL);
        textView.setTextSize(30);

        textView.setPadding(0,500,0,0);


                // IMPLEMENTING THE BUTTONS AND EDITTEXT TEXTVIEW INTO THE MAIN LAYOUT OF THE ACTIVITY
        layout.addView(editText);
        layout.addView(btnLayout1);
        layout.addView(btnLayout2);
        layout.addView(textView);

                // SETTING LAYOUT AS THE MAIN VIEW LAYOUT OF THE ONCREATE METHOD
        setContentView(layout);

                // ONCLICKLISTENER FOR ALL THE FOUR BUTTONS TO GREET THE USER

                // ENGLISH BUTTON
        englishBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("Hi " + editText.getText());
            }
        });

                // SVERIGE BUTTON
        sverigeBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("Hejjsan " + editText.getText());
            }
        });

                // SIOMEKSI BUTTON
        suomeksiBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("Terve " + editText.getText());
            }
        });

                // SURPRISE BUTTON
        surpriseBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textView.setText("Hola " + editText.getText());
            }
        });
    }
}