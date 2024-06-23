package com.example.onlinevoting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import com.example.onlinevoting.DatabaseHelper;

public class ResultCount extends AppCompatActivity {
    ListView resultCount;
    Button back;
    ArrayAdapter arrayAdapter;
    DatabaseHelper mydb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_count);
        mydb=new DatabaseHelper(this);
        resultCount=(ListView)findViewById(R.id.resultCount);
        back=(Button)findViewById(R.id.back);
        ArrayList<String> out=mydb.viewResultCount();
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,out);
        resultCount.setAdapter(arrayAdapter);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultCount.this,AdminPage.class));
                finish();
            }
        });
    }
}