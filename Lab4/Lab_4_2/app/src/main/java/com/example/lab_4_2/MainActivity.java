package com.example.lab_4_2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> prices = new ArrayList<>();
    ArrayList<String> brands = new ArrayList<>();
    ArrayList<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String[] brand = new String[]{
                "AAPL", "GOOGL", "FB", "NOK"
        };
        Collections.addAll(brands, brand);
        setContentView(R.layout.activity_main);
        for (String s : brand) {
            RequestQueue queue = Volley.newRequestQueue(this);
            final String id = s;
            String url = "https://financialmodelingprep.com/api/company/price/" + id + "?datatype=json";
            Log.i("id", id);
            JsonObjectRequest stringRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                    response -> {
                        try {
                            JSONObject brand1 = response.getJSONObject(id);
                            String price = brand1.getString("price");
                            Log.i("price", price);
                            prices.add(price);
                            Log.i("hello", Integer.toString(prices.size()));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }, error -> Log.i("error", "error")
            );
            queue.add(stringRequest);
        }
    }
    public void showList(View view)
    {
        for (int i=0;i<prices.size();i++)
        {
            String item = brands.get(i) + " :" + prices.get(i);
            list.add(item);
        }
        ListView todoListView = findViewById(R.id.brand);
        ArrayAdapter<String> todoAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);
        todoListView.setAdapter(todoAdapter);
    }

}
