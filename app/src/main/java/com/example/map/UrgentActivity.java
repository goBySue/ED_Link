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

public class UrgentActivity  extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap gMap;
    FrameLayout maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urgent);

        maps = findViewById(R.id.urgentCare);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.urgentCare);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap  gMap){

        this.gMap = gMap;

        LatLng cityCentre = new LatLng(49.27756947149384, -123.12825141662036);
        this.gMap.addMarker(new MarkerOptions().position(cityCentre).title("City Centre Urgent and Primary Care Centre"));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(cityCentre));
        gMap.moveCamera(CameraUpdateFactory.zoomTo(13));

        LatLng reach = new LatLng(49.2746060766487, -123.0692949449554);
        this.gMap.addMarker(new MarkerOptions().position(reach).title("REACH  Urgent and Primary Care Centre "));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(reach));

        LatLng northeast = new LatLng( 49.2811359508195, -123.0464853393885);
        this.gMap.addMarker(new MarkerOptions().position(northeast).title("Northeast  Urgent and Primary Care Centre"));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(northeast));

    }
}