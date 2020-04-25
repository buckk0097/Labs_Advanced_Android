package com.example.lab_2_3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    // CREATION OF OUR STRINGARRAY FOR COUNTRIES THAT WILL BE USED LATER
    final String[] COUNTRIES = new String[]{
            "Afghanistan","Albania", "Angeria", "American Samoa", "Andorra",
            "Angola","Anguilla","Antarctica", "Antigua and Barbuda", "Argentina",
            "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"};
    ArrayList<String> countries_list;

    // ONCREATE METHOD
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // CREATION OF ARRAYLIST TO STORE ALL OUR COUNTRIES
        countries_list = new ArrayList<>();
        for(int i=0; i<COUNTRIES.length; i++)
        {
            countries_list.add(COUNTRIES[i]);
        }

        // CREATION OF OUR LINEAR LAYOUTS FOR WHOLE ACTIVITY AND FOR THE BUTTONS
        LinearLayout layout = new LinearLayout(this);
        LinearLayout btnLayout = new LinearLayout(this);

        // CREATION OF BUTTONS TO BE USED IN THE BUTTON LAYOUT
        Button addBtn = new Button(this);
        Button editBtn = new Button(this);
        Button removeBtn = new Button(this);

        // SETTING ORIENTATION FOT HE ACTIVITY LAYOUT TO VERTICAL
        layout.setOrientation(LinearLayout.VERTICAL);

        // SETTING GRAVITY TO CENTER FOR LINEAR LAYOUT OF BUTTTONS
        // NOTE DEFAULT VALUE FOR A LINEAR LAYOUT ORIENTATION IS HORIZENTAL THAT IS WHY NO NED TO DECLARE IT HERE
        btnLayout.setGravity(Gravity.CENTER);

        //  SETTING TEXT IN OUR BUTTONS
        addBtn.setText("Add");
        editBtn.setText("Edit");
        removeBtn.setText("Remove");

        // CREATION OF THE BUTTONVIEW FOR EACH BUTTON IN THE BUTTONLAYOUT
        btnLayout.addView(addBtn);
        btnLayout.addView(editBtn);
        btnLayout.addView(removeBtn);

        // CREATION OF THE LISTVIEW AND EDITTEXT
        final ListView listView = new ListView(this);
        final EditText editText= new EditText(this);

        // IMPLEMENTATION OF OUR BUTTON LAYOUT AND EDITTEXT AND LISTVIEW INTO OUR MAIN ACTIVITY LAYOUT
        layout.addView(btnLayout);
        layout.addView(editText);
        layout.addView(listView);

        //    CREATION OF OUT ADAPTER AND SETTING UP THE LISTVIEW MODEL
        final ArrayAdapter<String> aa ;
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,countries_list);
        listView.setAdapter(aa);

        // SETTING LAYOUT TO BE THE MAIN VIEW OF THE ACTIVITY IN ONCREATE METHOD
        setContentView(layout);

        // CONFIGURATION OF THE BUTTONS SO THAT THEY ARE ABLE TO ADD OR REMOVE A COUNTRY TO THE LIST
        // ADD BUTTON ONCLICKLISTENER
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TEXT HERE IS TAKEN FROM WHATEVER WE INSERT INTO THE EDITTEXT BAR
                String text = editText.getText().toString();
                // THIS PART ADDS THE COUNRTY WRITTEN TO OUR LIST
                countries_list.add(text);
                listView.setAdapter(aa);
            }
        });

        // REMOVE BUTTON ONCLICKLISTENER
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                for (int i=0;i<countries_list.size();i++)
                {
                    // THIS LOOP SEARCHES FOR A MATCH FROM WHAT WE WROTE IN EDITTEXT BAR WITH OUR LIST OF COUNTRIES
                    if(text.equals(countries_list.get(i)))
                    {
                        // WHEN THERE IS A MATCH THAT ITEM IS REMOVED
                        countries_list.remove(countries_list.get(i));
                        listView.setAdapter(aa);
                    }
                }
            }
        });

    }
}
