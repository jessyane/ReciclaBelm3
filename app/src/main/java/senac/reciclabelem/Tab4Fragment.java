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

        mMap.addMarker(new MarkerOptions().position(new LatLng(-48.4568647,-1.4301853)).title("Bosque Rodrigues Alves - Jardim Botânico da Amazônia").snippet("funciona de terça-Feira ao Domingo, Às 8h até 16h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.423709,-48.490117)).title("Santuário de Nossa Senhora do Perpétuo Socorro").snippet("Rod. Arthur Bernardes, 459 - Telégrafo, Belém/PA (91) 3233-1797"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-48.452585,-1.4283836)).title("Feira da Bandeira Branca").snippet("Funciona de Segunda-Feira ao Domingo, Às 5h até 13h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4460631,-48.4720107)).title("Feira da 25 de Março").snippet("Funciona de Segunda-Feira à Sexta-Feira, Às 6h até 18h, Sábado e Domingo, às 6h até 15h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.3001946,-48.4873091)).title("Rua Manoel Barata, 659 - Icoaraci").snippet("Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-48.472838,-1.4311975)).title("Igreja Quadrangular - Pedreira").snippet(" Tv Timbó, 1212 - Pedreira, Belém/PA, (91) 3244-3350"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-48.4673561, -1.2621702)).title("Funbosque - Fundação Escola Bosque").snippet("Funciona de Segunda-Feira à Sexta-Feira, Às 8h até 17h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-48.4543255,-1.3981705)).title("Praça Dom Alberto Ramos").snippet("Funciona de Segunda-feira à Domingo, Às 6h até 22h"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4635819,-48.4960458)).title("Praça Amazonas - Jurunas").snippet("R. Cesário Alvim entre Tv. Hórario José dos satos e Praça Amazonas"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4599749,-48.4896585)).title("Praça Batista Campos").snippet("Tv. Padre Eutíquio, S/N - Batista Campos, Belém/PA, Aberto 24 horas"));
        mMap.addMarker(new MarkerOptions().position(new LatLng( -1.4675118,-48.4625582)).title("Praça Benedito Monteiro").snippet("Tv. Ezeriel Mônico de Matos, 469-591 - Guamá, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.437405,-48.4867852)).title("Praça Brasil").snippet("Av Senador Lemos, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4548935,-48.500213)).title("Praça da Bandeira").snippet(" 458, R. João Diogo, 316 - Campina, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4548935,-48.500213)).title("Praça da República").snippet("Av. Pres. Vargas, 814 - Campina, Belém/PA, Aberto 24 horas"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.418025,-48.479813)).title("Praça do Jaú").snippet("Av. Sen. Lemos, 53 - Umarizal, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-48.4649085,-1.3251053)).title("Residencial Viver Primavera").snippet("Estr. do Ranário, 79-107 - Tapanã (Icoaraci), Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4556518,-48.5027974)).title("Praça Dom Pedro II").snippet("Cidade Velha, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4561304,-48.5020937)).title("Praça Felipe Patroni").snippet("Cidade Velha, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4510859,-48.4685722)).title("Praça Floriano Peixoto").snippet("Em frente ao Mercado de São Brás, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-48.4755327,-1.3985228)).title("Praça do Marex").snippet("Av. Júlio César, 145 - Val de Caes, Belém/PA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-48.4508831,-1.4251574)).title("Sesan - Secretaria Municipal de Saneamento").snippet("Av. Alm. Barroso, 3110 - Marco, Belém/PA"));

        mMap.setOnInfoWindowClickListener(this);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(belém, 14.5f));
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
        marker.showInfoWindow();
    }
}
