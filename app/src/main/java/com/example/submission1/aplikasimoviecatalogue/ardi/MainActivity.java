package com.example.submission1.aplikasimoviecatalogue.ardi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFilm;
    private ArrayList<Film>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        rvFilm = findViewById(R.id.rv_film);
        rvFilm.setHasFixedSize(true);

        list.addAll(FilmData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvFilm.setLayoutManager(new LinearLayoutManager(this));
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(list);
        rvFilm.setAdapter(listFilmAdapter);

        listFilmAdapter.setOnItemClickCallBack( new ListFilmAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Film data) {
                showselectWisataSumbar(data);
            }
        } );
    }
            private void showselectWisataSumbar(Film data) {
                Intent pindahdetail = new Intent( MainActivity.this, DetailFilm.class );
                pindahdetail.putExtra( DetailFilm.EXTRA_DATA,data );
                startActivity(pindahdetail);
            }

}
