package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ClinicActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic);

        imageView = findViewById(R.id.imageBackArrow);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFeverActivity();
            }

        });
    }

    public void  openUrgentActivity(){
        Intent intent = new Intent(this, UrgentActivity.class);
        startActivity(intent);
    }
    public void  openFeverActivity(){
        Intent intent = new Intent(this, FeverActivity.class);
        startActivity(intent);
    }
}