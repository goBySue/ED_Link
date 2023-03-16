package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EmergencyActivity extends AppCompatActivity {
    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        imageView = findViewById(R.id.imageBackArrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBreathingActivity();
            }
        });

        imageView = findViewById(R.id.imageMap);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHospitalsActivity();
            }

        });

        button = findViewById(R.id.buttonToMap);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHospitalsActivity();
            }

        });
    }
    public void  openHospitalsActivity(){
        Intent intent = new Intent(this, HospitalsActivity.class);
        startActivity(intent);
    }
    public void  openBreathingActivity(){
        Intent intent = new Intent(this, BreathingActivity.class);
        startActivity(intent);
    }
}