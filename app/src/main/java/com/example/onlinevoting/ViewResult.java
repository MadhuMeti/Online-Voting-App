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

public class ViewResult extends AppCompatActivity {
    ListView result;
    Button back;
    ArrayAdapter arrayAdapter;
    DatabaseHelper mydb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_result);
        mydb=new DatabaseHelper(this);
        result=(ListView)findViewById(R.id.result);
        back=(Button)findViewById(R.id.back);
        ArrayList<String> out=mydb.viewResult();
        arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,out);
        result.setAdapter(arrayAdapter);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewResult.this,AdminPage.class));
                finish();
            }
        });
    }
}