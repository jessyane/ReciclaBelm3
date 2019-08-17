package senac.reciclabelem;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import senac.reciclabelem.models.Beneficio;

public class BeneficioActivity extends AppCompatActivity {

    TextView txtNumero, txtTitulo, txtDescricao, txtLink, txtImageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beneficio);

        txtNumero = findViewById(R.id.txtNumero);
        txtTitulo = findViewById(R.id.txtTitulo);
        txtDescricao = findViewById(R.id.txtDescricao);
        txtLink = findViewById(R.id.txtLink);
        txtImageUrl = findViewById(R.id.txtImagem);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero = txtNumero.getText().toString();
                String titulo = txtTitulo.getText().toString();
                String descricao = txtDescricao.getText().toString();
                String link = txtLink.getText().toString();
                String UrlImage = txtImageUrl.getText().toString();

                if (numero.isEmpty()) {
                    txtNumero.setError("Campo obrigatório!");
                    txtNumero.requestFocus();
                    return;
                }
                if (titulo.isEmpty()) {
                    txtTitulo.setError("Título obrigatório!");
                    txtTitulo.requestFocus();
                    return;
                }
                if (descricao.isEmpty()) {
                    descricao = "Sem descrição";
                }
                if (link.isEmpty()) {
                    link = "Sem link...";
                }


                Beneficio beneficio = new Beneficio(numero, UrlImage, titulo, descricao, link, null);

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("beneficios").child(beneficio.getNumero());

                myRef.setValue(beneficio);

                finish();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}