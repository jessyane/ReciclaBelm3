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
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4403006,-48.4789357)).title("Bosque Rodrigues Alves Jardim Zoobotânico da Amazônia").snippet("funciona de terça-Feira ao Domingo, Às 8h até 16h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4464529,-48.4963969)).title("Avenida Arthur Bernardes, próximo à igreja do Perpétuo Socorro").snippet("Rod. Arthur Bernardes, 459 - Telégrafo, Belém/PA (91) 3233-1797"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4433728,-48.4789357)).title("Feira da Bandeira Branca").snippet("Funciona de Segunda-Feira ao Domingo, Às 5h até 13h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4035158, -48.4971134)).title("Feira da 25").snippet("Funciona de Segunda-Feira à Sexta-Feira, Às 6h até 18h, Sábado e Domingo, às 6h até 15h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.3776506,-48.5436248)).title("Rua Manoel Barata, 659 - Icoaraci").snippet("Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4300463,-48.4731497)).title("Igreja Quadrangular - Pedreira").snippet(" Tv Timbó, 1212 - Pedreira, Belém/PA, (91) 3244-3350"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.3515987,-48.5340035)).title("Funbosque - Fundação Escola Bosque").snippet("Funciona de Segunda-Feira à Sexta-Feira, Às 8h até 17h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4254091,-48.4897006)).title("Praça Dom Alberto Ramos").snippet("Funciona de Segunda-feira à Domingo, Às 6h até 22h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.457824,-48.4957999)).title("Praça Amazonas - Jurunas").snippet("R. Cesário Alvim entre Tv. Hórario José dos satos e Praça Amazonas"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4573513,-48.4938582)).title("Praça Batista Campos").snippet("Tv. Padre Eutíquio, S/N - Batista Campos, Belém/PA, Aberto 24 horas"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.461005,-48.479553)).title("Praça Benedito Monteiro").snippet("Tv. Ezeriel Mônico de Matos, 469-591 - Guamá, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4506353,-48.489317)).title("Praça Brasil").snippet("Av Senador Lemos, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4536664,-48.4977181)).title("Praça da Bandeira").snippet(" 458, R. João Diogo, 316 - Campina, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4530375,-48.4928965)).title("Praça da República").snippet("Av. Pres. Vargas, 814 - Campina, Belém/PA, Aberto 24 horas"));
            mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4358365,-48.4929929)).title("Praça do Jaú").snippet("Av. Sen. Lemos, 53 - Umarizal, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.3881384,-48.5086042)).title("Residencial Viver Primavera").snippet("Estr. do Ranário, 79-107 - Tapanã (Icoaraci), Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4536664,-48.4989983)).title("Praça Dom Pedro II").snippet("Cidade Velha, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4536664,-48.4988308)).title("Praça Felipe Patroni").snippet("Cidade Velha, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4529932,-48.4826286)).title("Praça Floriano Peixoto").snippet("Em frente ao Mercado de São Brás, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4222709,-48.4910943)).title("Praça do Marex").snippet("Av. Júlio César, 145 - Val de Caes, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4407881,-48.4784203)).title("Sesan - Secretaria Municipal de Saneamento").snippet("Av. Alm. Barroso, 3110 - Marco, Belém/PA"));

        mMap.setOnInfoWindowClickListener(this);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(belém, 14.5f));
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        marker.showInfoWindow();
    }
}
