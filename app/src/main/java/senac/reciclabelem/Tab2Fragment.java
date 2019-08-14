package senac.reciclabelem;


import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
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

    public Tab2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab2, container, false);
    }
    private TextView mTextMessage;

    private RecyclerView recyclerView;
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
                Beneficio ebook = ds.getValue(Beneficio.class);
                beneficioList.add(ebook);
            }

            adapter = new BeneficioAdapter(beneficioList, Tab2Fragment.this);

            recyclerView.setAdapter(adapter);

            progressDialog.dismiss();
        }

        @Override
        public void onCancelled(@NonNull DatabaseError databaseError) {
            progressDialog.dismiss();
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        if (!FIREBASE_OFFLINE) {
            database.setPersistenceEnabled(true);
            FIREBASE_OFFLINE = true;
        }

        myRef = database.getReference("ebooks");
        myRef.keepSynced(true);

        recyclerView = getView().findViewById(R.id.listBeneficio);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        progressDialog = new ProgressDialog(getActivity());

        progressDialog.setMessage("Carregando...");

        progressDialog.show();

        myRef.limitToFirst(100).addValueEventListener(ListenerGeral);
    }

}
