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
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4605302,-48.4903761)).title("Viggiano Rei do Ferro Velho"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4277733,-48.5027262)).title("Instituto Alachaster"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4580835,-48.5045545)).title("Sucataria Taco"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4506111,-48.4867292)).title("Sucataria José"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4488924,-48.4945159)).title("JVR-Sucata"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4506111,-48.4867292)).title("Sucata Vasconcelos"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4303321,-48.5042176)).title("Sucataria 2 amigos"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4249461,-48.4890269)).title("Riopel"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.39507,-48.497911)).title("Transforma"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4589147,-48.4882546)).title("reciclagem luz do amanha"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.453033,-48.4908251)).title("Pretória - Formação de Vigilantes"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4257569,-48.5038247)).title("SUCATÃO DO BETO "));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4520054,-48.4896194)).title("Brechó da Celina"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4497907,-48.5011763)).title("Ong noolhar"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4549346,-48.5022275)).title("Coleta de Entulho Belém Hidrovac"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4560648,-48.4914237)).title("DRES SESAN"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4270648,-48.4927201)).title("CRS Resíduos"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-1.4562207,-48.4914341)).title("Servmix"));









        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(belém, 14.5f));
    }
}
