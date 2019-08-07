package senac.reciclabelem;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab4Fragment extends SupportMapFragment implements GoogleMap.OnInfoWindowClickListener,OnMapReadyCallback {

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
        LatLng belém = new LatLng(-1.4615468, -48.4920082);

        mMap.addMarker(new MarkerOptions().position(belém).title("marker in Belém"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4403006,-48.4789357)).title("Bosque Rodrigues Alves Jardim Zoobotânico da Amazônia").snippet(""));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4464529,-48.4963969)).title("Avenida Arthur Bernardes, próximo à igreja do Perpétuo Socorro").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4433728,-48.4789357)).title("Feira da Bandeira Branca").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4035158, -48.4971134)).title("Feira da 25").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.3776506,-48.5436248)).title("Icoaraci, na rua Manoel Barata").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4300463,-48.4731497)).title("Igreja Quadrangular").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.3515987,-48.5340035)).title("Funbosque - Fundação Escola Bosque").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4254091,-48.4897006)).title("Praça Dom Alberto Ramos").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.457824,-48.4957999)).title("Praça Amazonas").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4573513,-48.4938582)).title("Praça Batista Campos").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.461005,-48.479553)).title("Praça Benedito Monteiro").snippet("Av. Alm. Barroso, 2305 - Marco, Belém - Abre às 08:00"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4506353,-48.489317)).title("Praça Brasil").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4536664,-48.4977181)).title("Praça da Bandeira").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4530375,-48.4928965)).title("Praça da República").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4358365,-48.4929929)).title("Praça do Jaú").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.3881384,-48.5086042)).title("Residencial Viver Primavera").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4536664,-48.4989983)).title("Praça Dom Pedro II").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4536664,-48.4988308)).title("Praça Felipe Patroni").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4529932,-48.4826286)).title("Praça Floriano Peixoto,\n em frente ao Mercado de São Brás").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4222709,-48.4910943)).title("Praça do Marex,\n na avenida Júlio César").snippet("Population: 4,137,400"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4407881,-48.4784203)).title("Secretaria Municipal de Saneamento (Sesan) \n na avenida Almirante Barroso").snippet("Population: 4,137,400"));

        mMap.setOnInfoWindowClickListener(this);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(belém, 14.5f));
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        marker.showInfoWindow();
    }
}
