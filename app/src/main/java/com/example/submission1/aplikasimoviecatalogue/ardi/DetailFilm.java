package com.example.submission1.aplikasimoviecatalogue.ardi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailFilm extends AppCompatActivity {

    public static final String EXTRA_DATA = "extra_data";

    ImageView imgPhotoFilm;
    TextView tvNamaFilm, tvTanggalRilis, tvGenreFilm, tvDeskripsiFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail_film );

        imgPhotoFilm = findViewById( R.id.img_item_photo );
        tvNamaFilm = findViewById( R.id.tv_item_name );
        tvGenreFilm = findViewById( R.id.tv_item_genre );
        tvTanggalRilis= findViewById( R.id.tv_item_tanggal );
        tvDeskripsiFilm = findViewById( R.id.tv_item_fulldeskripsi );

        final Film pindahdetail = getIntent().getParcelableExtra( EXTRA_DATA );

        String name = null;
             if (pindahdetail !=null){
                 name = pindahdetail.getNamaFilm();
                 tvNamaFilm.setText( name );
             }
        String genre = null;
            if (pindahdetail != null){
            genre = pindahdetail.getGenre();
            tvGenreFilm.setText( genre );
        }
        String tanggal = null;
            if (pindahdetail != null){
            tanggal = pindahdetail.getTanggalFilm();
            tvTanggalRilis.setText( tanggal );
        }
        String deskripsi = null;
            if (pindahdetail != null){
            deskripsi = pindahdetail.getDeskripsi();
            tvDeskripsiFilm.setText( deskripsi );
        }
        if (pindahdetail != null){
            Glide.with( getApplicationContext() )
                    .load( pindahdetail.getPhoto() )
                    .apply( new RequestOptions().override( 525,350 ) )
                    .into( imgPhotoFilm );
            }
    }


}
