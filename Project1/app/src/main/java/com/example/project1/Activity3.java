package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    private Button  button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3);

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity3.this,Activity4.class);
                button4(v);
            }
        });
    }

    public void button4(View view){
        Intent intent = new Intent(this,Activity4.class);
        EditText editText = findViewById(R.id.Name5);
        String messega = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,messega);
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
