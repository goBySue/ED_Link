package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SymptomsActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        button = findViewById(R.id.buttonFever);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeverActivity();
            }
        });

        button = findViewById(R.id.buttonBreathing);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBreathingActivity();
            }
        });
    }
    public void  openFeverActivity(){
        Intent intent = new Intent(this, FeverActivity.class);
        startActivity(intent);
    }
    public void  openBreathingActivity(){
        Intent intent = new Intent(this, BreathingActivity.class);
        startActivity(intent);
    }
}