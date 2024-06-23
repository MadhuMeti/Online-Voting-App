package com.example.onlinevoting;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class AdminPage extends AppCompatActivity {
    Button addvoter,ahome,voterlist,result,result1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
        addvoter=(Button)findViewById(R.id.addvoter);
        voterlist=(Button)findViewById(R.id.voterlist);
        ahome=(Button)findViewById(R.id.ahome);
        result=(Button)findViewById(R.id.result);
        result1=(Button)findViewById(R.id.result1);
        addvoter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminPage.this,AddVoter.class));
                finish();
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminPage.this,ViewResult.class));
                finish();
            }
        });
        result1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminPage.this,ResultCount.class));
                finish();
            }
        });
        voterlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminPage.this,VotersList.class));
                finish();
            }
        });
        ahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminPage.this,MainActivity.class));
                finish();
            }
        });
    }
}