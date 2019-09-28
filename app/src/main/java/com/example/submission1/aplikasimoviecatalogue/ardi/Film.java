package com.example.submission1.aplikasimoviecatalogue.ardi;

import android.os.Parcel;
import android.os.Parcelable;

public class Film implements Parcelable {
    private String NamaFilm;

    public String getNamaFilm() {
        return NamaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        NamaFilm = namaFilm;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public String getTanggalFilm() {
        return TanggalFilm;
    }

    public void setTanggalFilm(String tanggalFilm) {
        TanggalFilm = tanggalFilm;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    private String Genre;
    private String Deskripsi;
    private String TanggalFilm;
    private int photo;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString( this.NamaFilm );
        dest.writeString( this.Genre );
        dest.writeString( this.Deskripsi );
        dest.writeString( this.TanggalFilm );
        dest.writeInt( this.photo );
    }

    public Film() {
    }

    protected Film(Parcel in) {
        this.NamaFilm = in.readString();
        this.Genre = in.readString();
        this.Deskripsi = in.readString();
        this.TanggalFilm = in.readString();
        this.photo = in.readInt();
    }

    public static final Parcelable.Creator<Film> CREATOR = new Parcelable.Creator<Film>() {
        @Override
        public Film createFromParcel(Parcel source) {
            return new Film( source );
        }

        @Override
        public Film[] newArray(int size) {
            return new Film[size];
        }
    };
}
