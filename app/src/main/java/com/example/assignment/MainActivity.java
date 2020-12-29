package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count=0;
    private Button clickhere;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickhere = (Button) findViewById(R.id.clickhereId);
        textview = (TextView) findViewById(R.id.textviewId);
        clickhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                Toast.makeText(MainActivity.this, "Click Button is clicked"+count+"times", Toast.LENGTH_SHORT).show();
            }
        });
    }
}