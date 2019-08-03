package senac.reciclabelem;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab4Fragment extends SupportMapFragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    public Tab4Fragment() {
        // Required empty public constructor
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng belém = new LatLng(-1.4615468,-48.4920082);

        mMap.addMarker(new MarkerOptions().position(belém).title("marker in Belém"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4574703,-48.4962724)).title("EcoArt"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4601204,-48.4907819)).title("Cooperativa Filhos Do Sol & Ascapel"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4678905,-48.4917843)).title("Galpão CONCAVES"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4035158,-48.4971134)).title("Jorge Reciclagem"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4495951,-48.4927807)).title("Só O Senhor e Deus Comércio"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(belém, 14.5f));
    }
}
