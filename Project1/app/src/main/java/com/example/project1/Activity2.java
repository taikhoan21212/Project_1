package com.example.project1;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Activity2 extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);

        Button button2 =findViewById(R.id.xem2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity2.this,Activity3.class);
                startActivity(i);
            }
        });
        Button button3 =findViewById(R.id.xem1);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity2.this,Activity3.class);
                startActivity(i);
            }
        });
        Button button =findViewById(R.id.xem3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity2.this,Activity3.class);
                startActivity(i);
            }
        });
    }
    public void back(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
