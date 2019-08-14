package senac.reciclabelem.models;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;

class BeneficioFirebaseHelper {

    DatabaseReference db;
    Boolean saved = null;
    List<Beneficio> beneficioList = new ArrayList<>();

    public BeneficioFirebaseHelper(DatabaseReference db) {
        this.db = db;
    }

    //SAVE
    public Boolean save(Beneficio beneficio) {
        if (beneficio == null) {
            saved = false;
        } else {

            try {
                db.child("beneficios").push().setValue(beneficioList);
                saved = true;
            } catch (DatabaseException e) {
                e.printStackTrace();
                saved = false;
            }

        }

        return saved;
    }

    //READ
    public List<Beneficio> retrieve() {
        db.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                fetchData(dataSnapshot);

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return beneficioList;
    }

    private void fetchData(DataSnapshot dataSnapshot) {
        beneficioList.clear();
        for (DataSnapshot ds : dataSnapshot.getChildren()) {
            Beneficio beneficio = ds.getValue(Beneficio.class);
            beneficioList.add(beneficio);
        }
    }

}