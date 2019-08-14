package senac.reciclabelem.adapters;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import senac.reciclabelem.R;
import senac.reciclabelem.Tab2Fragment;
import senac.reciclabelem.models.Beneficio;

public class BeneficioAdapter extends RecyclerView.Adapter<BeneficioAdapter.BeneficioViewHolder> {

    private List<Beneficio> beneficioList;
    private Context context;
    public View.OnClickListener mOnItemClickListener;

    public BeneficioAdapter(List<Beneficio> beneficioList, Tab2Fragment context) {
        this.beneficioList = beneficioList;
        this.context = context;
    }

    @NonNull
    @Override
    public BeneficioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_beneficios, parent, false);

        BeneficioViewHolder holder = new BeneficioViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BeneficioViewHolder holder, int position) {
        final Beneficio beneficio = beneficioList.get(position);

        holder.txtTitulo.setText(beneficio.getTitulo());
        holder.txtDescricao.setText(beneficio.getDescricao());
        holder.txtLink.setText(beneficio.getLink());

        if (beneficio.getImageUrl() == null || beneficio.getImageUrl().isEmpty()){
            holder.imgBeneficio.setImageResource(R.drawable.ic_logo);
        } else {
            Picasso.get().load(beneficio.getImageUrl()).into(holder.imgBeneficio);
        }
    }

    @Override
    public int getItemCount() {
        return beneficioList.size();
    }

    public void setOnItemClickListener(View.OnClickListener itemClickListener) {
        mOnItemClickListener = itemClickListener;
    }

    private void removerItem(int position) {
        beneficioList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, beneficioList.size());
    }

    public class BeneficioViewHolder extends RecyclerView.ViewHolder {

        final ImageView imgBeneficio;
        final TextView txtTitulo, txtDescricao, txtLink;

        public BeneficioViewHolder(@NonNull View itemView) {
            super(itemView);

            imgBeneficio = itemView.findViewById(R.id.imgBeneficio);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtDescricao = itemView.findViewById(R.id.txtDescricao);
            txtLink = itemView.findViewById(R.id.txtLink);

            itemView.setTag(this);
            itemView.setOnClickListener(mOnItemClickListener);
        }
    }

}