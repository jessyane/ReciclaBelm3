package senac.reciclabelem;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
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

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


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
                DatabaseReference myRef = database.getReference("beneficio").child(beneficio.getNumero());

                myRef.setValue(beneficio);

                finish();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:  //ID do seu botão (gerado automaticamente pelo android, usando como está, deve funcionar
                startActivity(new Intent(this, MainActivity.class));  //O efeito ao ser pressionado do botão (no caso abre a activity)
                finishAffinity();  //Método para matar a activity e não deixa-lá indexada na pilhagem
                break;
            default:break;
        }
        return true;
    }

}