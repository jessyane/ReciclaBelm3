package senac.reciclabelem;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

import senac.reciclabelem.adapters.BeneficioAdapter;
import senac.reciclabelem.models.Beneficio;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {

    RecyclerView recyclerView;

    public Tab2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tab2, container, false);

        ImageButton buttonr = (ImageButton) view.findViewById(R.id.btnAdd);
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), BeneficioActivity.class);
                getActivity().startActivity(myIntent);
            }
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        if (!FIREBASE_OFFLINE) {
            database.setPersistenceEnabled(true);
            FIREBASE_OFFLINE = true;
        }

        myRef = database.getReference("beneficios");
        myRef.keepSynced(true);

        recyclerView = view.findViewById(R.id.listBeneficio);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setHasFixedSize(true);

        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        progressDialog = new ProgressDialog(getActivity());

        progressDialog.setMessage("Carregando...");

        progressDialog.show();

        myRef.limitToFirst(100).addValueEventListener(ListenerGeral);


        return view;
    }

    private TextView mTextMessage;

    BeneficioAdapter adapter;

    static DatabaseReference myRef;

    private List<Beneficio> beneficioList = new ArrayList<>();

    ProgressDialog progressDialog;

    private static boolean FIREBASE_OFFLINE;

    private ValueEventListener ListenerGeral = new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
            beneficioList.clear();

            for (DataSnapshot ds : dataSnapshot.getChildren()) {
                Beneficio beneficio = ds.getValue(Beneficio.class);
                beneficioList.add(beneficio);
            }

            adapter = new BeneficioAdapter(beneficioList, getContext());

            recyclerView.setAdapter(adapter);

            progressDialog.dismiss();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {
            progressDialog.dismiss();
        }
    };
}
