package com.example.onlinevoting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class VoterPage extends AppCompatActivity {
    Button first,second;
    DatabaseHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voter_page);
        mydb=new DatabaseHelper(this);
        first=(Button)findViewById(R.id.first);
        second=(Button)findViewById(R.id.second);
        Intent intent = getIntent();
        String str = intent.getStringExtra("vo_usn");
        first.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View v) {
                String first_cand="Kavana";
                boolean status;
                status = mydb.addVoteCasted(str,first_cand);
                System.out.println("Status:"+status);
                if(status)
                {
                    Toast.makeText(VoterPage.this, "Vote Successfull!!!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(VoterPage.this,SuccessActivity.class));
                    finish();
                }
                else
                    Toast.makeText(VoterPage.this, "You can vote only Once!!!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(VoterPage.this,MainActivity.class));
                    finish();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View v) {
                String second_cand="Shrinidhi";
                boolean status;
                status = mydb.addVoteCasted(str,second_cand);
                System.out.println("Status:"+status);
                if(status)
                {
                    Toast.makeText(VoterPage.this, "Vote Successfull!!!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(VoterPage.this,SuccessActivity.class));
                    finish();
                }
                else
                    Toast.makeText(VoterPage.this, "You can vote only Once!!!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(VoterPage.this,MainActivity.class));
                    finish();
            }
        });
    }
}
