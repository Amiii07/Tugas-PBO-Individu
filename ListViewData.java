package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewData extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    String[] programmingLang={

            "Java","Android","C++","C#","Visual Basic","Ruby", "Pyhton","PHP","Lips"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_data);


        listView=(ListView) findViewById(R.id.ListViewProgramming);
        arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listView.setAdapter(arrayAdapter);
    }
}