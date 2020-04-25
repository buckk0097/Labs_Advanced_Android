package com.example.lab_4_1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.enterURL).setOnClickListener(this);
    }
    public void sendRequest()
    {
        final TextView textView = findViewById(R.id.text);
        RequestQueue queue = Volley.newRequestQueue(this);
        EditText editText = findViewById(R.id.url);
        String url = editText.getText().toString();
        @SuppressLint("SetTextI18n") StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                response -> textView.setText("Answer IS "+ response.substring(0,500)), error -> textView.setText("OOPS! ThE APPLICATION FACED AN ERROR, TRY AGIAN!"));
        queue.add(stringRequest);
        Log.i("String", url);
    }
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.enterURL) {
            sendRequest();
        }
    }
}