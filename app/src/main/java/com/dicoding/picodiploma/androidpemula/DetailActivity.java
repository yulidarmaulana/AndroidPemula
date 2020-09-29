package com.dicoding.picodiploma.androidpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        grabIntent();
    }

    private void grabIntent() {
        String item_nama = getIntent().getStringExtra("Nama");
        String item_detail = getIntent().getStringExtra("Detail");
        int item_photo = getIntent().getIntExtra("Photo", 0);

        TextView nama = findViewById(R.id.nama);
        TextView detail = findViewById(R.id.detail);
        ImageView photo = findViewById(R.id.img);

        nama.setText(item_nama);
        detail.setText(item_detail);

        Glide.with(this)
                .load(item_photo)
                .apply(new RequestOptions().override(450, 450))
                .into(photo);
    }
}
