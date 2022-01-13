package com.example.android_simple_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv  = findViewById(R.id.lv);

       List<String> datas = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            datas.add(i + " item");
        }

        lv.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,datas));
        
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "you clicked "+ datas.get(i), Toast.LENGTH_LONG).show();
            }
        });

    }
}