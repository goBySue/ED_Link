package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BreathingActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing);

        imageView = findViewById(R.id.imageBackArrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSymptomsActivity();
            }

        });

        button = findViewById(R.id.fasterThan);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmergencyActivity();
            }
        });
    }
    public void  openSymptomsActivity(){
        Intent intent = new Intent(this, SymptomsActivity.class);
        startActivity(intent);
    }
    public void  openEmergencyActivity(){
        Intent intent = new Intent(this, EmergencyActivity.class);
        startActivity(intent);
    }

}
