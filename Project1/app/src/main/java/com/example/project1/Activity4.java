package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4);

        Intent intent = getIntent();
        String mesega = intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.edittext1);
        textView.setText(mesega);

        Button button = findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Activity4.this,Activity5.class);
                startActivity(intent);
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
}
