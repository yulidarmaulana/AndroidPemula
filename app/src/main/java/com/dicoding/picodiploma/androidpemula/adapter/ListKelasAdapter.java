package com.dicoding.picodiploma.androidpemula.adapter;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.androidpemula.DetailActivity;
import com.dicoding.picodiploma.androidpemula.ItemActivity;
import com.dicoding.picodiploma.androidpemula.MainActivity;
import com.dicoding.picodiploma.androidpemula.ProfileActivity;
import com.dicoding.picodiploma.androidpemula.model.Kelas;
import com.dicoding.picodiploma.androidpemula.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListKelasAdapter extends RecyclerView.Adapter<ListKelasAdapter.ListViewHolder> {
    private ArrayList<Kelas> listKelas;
    private onItemClickCallBack onItemClickCallback;

    public void setOnItemClickCallback(onItemClickCallBack onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListKelasAdapter(ArrayList<Kelas> list) {
        this.listKelas = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        Kelas kelas = listKelas.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kelas.getPhoto())
                .apply(new RequestOptions().override(450, 450))
                .into(holder.imgPhoto);


        final Context context = holder.btnDetail.getContext();
        Glide.with(holder.btnDetail.getContext())
                .load(kelas.getPhoto())
                .apply(new RequestOptions().override(500,500))
                .into(holder.imgPhoto);
        holder.tvNama.setText(kelas.getNama());
        holder.tvDetail.setText(kelas.getDetail());

        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listKelas.get(holder.getAdapterPosition()));
                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("Nama",listKelas.get(holder.getAdapterPosition()).getNama());
                intent.putExtra("Detail",listKelas.get(holder.getAdapterPosition()).getDetail());
                intent.putExtra("Photo",listKelas.get(holder.getAdapterPosition()).getPhoto());

                context.startActivity(intent);

                    Toast.makeText(holder.itemView.getContext(), "Detail " +
                            listKelas.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
               }
            });
    }
    private void startActivity(Intent intent) {
    }

    @Override
    public int getItemCount() {
        return listKelas.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDetail;
        Button btnDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img);
            tvNama = itemView.findViewById(R.id.txt_title);
            tvDetail = itemView.findViewById(R.id.txt_detail);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }

    public interface onItemClickCallBack {
        void onItemClicked(Kelas data);
    }
}