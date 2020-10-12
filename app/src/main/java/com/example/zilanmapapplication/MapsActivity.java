package com.example.zilanmapapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.sample.basiclocationsample.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;

public class MapsActivity extends AppCompatActivity implements LocationListener, View.OnClickListener {

    private GoogleMap mMap;
    double latitude;
    double longitude;
    Button koordinat;
    Button posisi_user;
    private FusedLocationProviderClient fusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        koordinat = (Button) findViewById(R.id.koordinat);
        posisi_user = (Button) findViewById(R.id.posisi_user);

        koordinat.setOnClickListener(this);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        //SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
          //      .findFragmentById(R.id.map);
        //mapFragment.getMapAsync(this);
        //fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        //if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
          //  return;
        //}
        //fusedLocationClient.getLastLocation()
          //      .addOnSuccessListener(this, new OnSuccessListener<Location>() {
            //        @Override
              //      public void onSuccess(Location location) {
                //        if (location != null) {

                  //      }
                   // }
                //});
   // }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
   // @Override
   // public void onMapReady(GoogleMap googleMap) {
   //     mMap = googleMap;

        // Add a marker in Sydney and move the camera
    //    LatLng sydney = new LatLng(-34, 151);
    //    mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
    //    mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
   }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onLocationChanged(Location location) {

    }
}