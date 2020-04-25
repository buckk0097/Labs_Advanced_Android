package com.example.lab1_examples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Object person_1 is created with name, age and gender using DeliveryMan Class

        DeliveryMan person_1 = new DeliveryMan("Bob", 25, "male");

        // Getter is used to get the object Name and Age then display it on the toast

        Toast.makeText(getApplicationContext(), "You chose  "+person_1.getmName()+"with age   "+person_1.getmAge(),
                Toast.LENGTH_SHORT).show();

        // Setter is used to set object person_1 name and age  then display new information

        person_1.setmName("Jack");
        person_1.setmAge(49);
        Toast.makeText(getApplicationContext(), "You chose  "+person_1.getmName()+"with age   "+person_1.getmAge(),
                Toast.LENGTH_SHORT).show();

        // NO_MODIFIER EXAMPLE PART
        Sports sport = new Sports();
        sport.mType = "BODYBUILDING";


    }
}
