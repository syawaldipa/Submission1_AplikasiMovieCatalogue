package com.example.submission1.aplikasimoviecatalogue.ardi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.ListViewHolder> {
    private ArrayList<Film> listfilm;
    public ListFilmAdapter(ArrayList<Film> list) {
        this.listfilm = list;
    }

    private OnItemClickCallBack onItemClickCallBack;
    public void setOnItemClickCallBack (ListFilmAdapter.OnItemClickCallBack onItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack;
    }

    @NonNull
    @Override
    public ListFilmAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.item_row_film, viewGroup, false );
        return new ListViewHolder( view );
    }

    @Override
    public void onBindViewHolder(@NonNull final ListFilmAdapter.ListViewHolder holder, int position) {
        Film film = listfilm.get( position );
        Glide.with( holder.itemView.getContext() )
                .load( film.getPhoto() )
                .apply( new RequestOptions().override( 55, 55 ) )
                .into( holder.imgPhotoFilm );
        holder.tvNamaFilm.setText( film.getNamaFilm() );
        holder.tvGenreFilm.setText( film.getGenre() );
        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallBack.onItemClicked(listfilm.get( holder.getAdapterPosition() ));
            }
        } );

    }

    @Override
    public int getItemCount() {
        return listfilm.size();
    }

    public interface OnItemClickCallBack {
        void onItemClicked(Film data);
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhotoFilm;
        TextView tvNamaFilm, tvGenreFilm;

        public ListViewHolder(@NonNull View itemView) {
            super( itemView );
            imgPhotoFilm = itemView.findViewById( R.id.img_item_photo );
            tvNamaFilm = itemView.findViewById( R.id.tv_item_name );
            tvGenreFilm = itemView.findViewById( R.id.tv_item_genre );
        }
    }
}

