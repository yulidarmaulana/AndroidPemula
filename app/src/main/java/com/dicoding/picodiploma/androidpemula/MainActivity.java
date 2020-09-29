package com.dicoding.picodiploma.androidpemula;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.dicoding.picodiploma.androidpemula.adapter.ListKelasAdapter;
import com.dicoding.picodiploma.androidpemula.model.Kelas;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKelas;
    private ArrayList<Kelas> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKelas = findViewById(R.id.rv_Kelas);
        rvKelas.setHasFixedSize(true);

        list.addAll(DataKelas.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKelas.setLayoutManager(new LinearLayoutManager(this));
        ListKelasAdapter listKelasAdapter = new ListKelasAdapter(list);
        rvKelas.setAdapter(listKelasAdapter);

        listKelasAdapter.setOnItemClickCallback(new ListKelasAdapter.onItemClickCallBack() {
            @Override
            public void onItemClicked(Kelas data) {
                showSelectedKelas(data);
            }
        });
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.profile, menu);
            return true;
        }

        public boolean onOptionsItemSelected(MenuItem item) {
            if (item.getItemId()==R.id.profile){
                startActivity(new Intent(this, ProfileActivity.class));
            }
            return true;
        }

        private void showSelectedKelas(Kelas kelas){
        Toast.makeText(this,"Detail " + kelas.getNama(), Toast.LENGTH_SHORT).show();
        }

}