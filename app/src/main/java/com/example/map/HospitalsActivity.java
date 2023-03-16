package com.example.map;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
public class HospitalsActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap gMap;
    FrameLayout map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        map = findViewById(R.id.hospitals);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.hospitals);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        this.gMap = googleMap;

        LatLng vgh = new LatLng(49.261484699974055, -123.12149051426388);
        this.gMap.addMarker(new MarkerOptions().position(vgh).title("Vancouver General Hospital"));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(vgh));
        gMap.moveCamera(CameraUpdateFactory.zoomTo(13));

        LatLng saint = new LatLng(49.257938297067525, -123.09472061611967);
        this.gMap.addMarker(new MarkerOptions().position(saint).title("Mount Saint Joseph Hospital"));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(saint));

        LatLng paul = new LatLng( 49.28080015508415, -123.1275798486663);
        this.gMap.addMarker(new MarkerOptions().position(paul).title("St. Paul's Hospital "));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(paul));

        LatLng women = new LatLng( 49.24380554280125, -123.12440323703302);
        this.gMap.addMarker(new MarkerOptions().position(women).title("BC Women's Hospital"));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(women));

        LatLng children = new LatLng(49.24440974151571,  -123.12329449149648);
        this.gMap.addMarker(new MarkerOptions().position(children).title("BC Children's Hospital"));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(children));


    }
}