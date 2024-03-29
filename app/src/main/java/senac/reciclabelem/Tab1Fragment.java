package senac.reciclabelem;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment {


    public Tab1Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab1,
                container, false);
        ImageButton buttonr = (ImageButton) view.findViewById(R.id.btn_1);
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), Reciclagem.class);
                getActivity().startActivity(myIntent);
            }
        });
        ImageButton buttonb = (ImageButton) view.findViewById(R.id.btn_2);
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), Beneficios.class);
                getActivity().startActivity(myIntent);
            }
        });
        ImageButton buttona = (ImageButton) view.findViewById(R.id.btn_3);
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), Artesanato.class);
                getActivity().startActivity(myIntent);
            }
        });
        ImageButton buttonn = (ImageButton) view.findViewById(R.id.btn_4);
        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), Noticias.class);
                getActivity().startActivity(myIntent);
            }
        });
        return view;


    }
}
