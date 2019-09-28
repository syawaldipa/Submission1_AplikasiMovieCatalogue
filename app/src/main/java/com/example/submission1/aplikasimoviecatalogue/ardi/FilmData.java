package com.example.submission1.aplikasimoviecatalogue.ardi;

import java.util.ArrayList;

public class FilmData {
    private static String[] FilmName = {
            "Dilan",
            "Dua Garis Biru",
            "Gundala",
            "Habibie Ainun",
            "Makmum",
            "My Stupid Bos",
            "Pengabdi Setan",
            "Pretty Boys",
            "Single 2",
            "Warkop DKI Reborn 3"
    };

    private static String[] GendreFilm = {
            "Genre: Drama",
            "Genre: Drama",
            "Genre: Aksi",
            "Genre: Drama",
            "Genre: Horor",
            "Genre: Komedi",
            "Genre: Horor",
            "Genre: Komedi",
            "Genre: Komedi/Drama",
            "Genre: Komedi"

    };
    private static String[] DeskripsiFilm = {
            "Dilan: Kisah cinta Dilan dan Milea akan kembali berlanjut. Di film Dilan 1991 ini kisah cinta mereka akan mulai diuji. Banyak rintangan yang harus Dilan dan Milea lalui, mampukah cinta mereka bertahan?",
            "Dua Garis Biru: Bima dan Dara adalah sepasang kekasih yang masih duduk di bangku SMA. Pada usia 17 tahun, mereka nekat bersanggama di luar nikah. Dara pun hamil. Keduanya kemudian dihadapkan pada kehidupan yang tak terbayangkan bagi anak seusia mereka, kehidupan sebagai orangtua.",
            "Gundala: Sancaka hidup di jalanan sejak ditinggal ayah dan ibunya. Menghadapi hidup yang keras, Sancaka belajar untuk bertahan hidup dengan tidak peduli dengan orang lain dan hanya mencoba untuk mendapatkan tempat yang aman bagi dirinya sendiri. Ketika situasi kota semakin tidak aman dan ketidakadilan merajalela di seluruh negeri, Sancaka harus buat keputusan yang berat, tetap hidup di zona amannya, atau keluar sebagai Gundala untuk membela orang-orang yang ditindas.",
            "Habibie Ainun: ni adalah kisah tentang apa yang terjadi bila kau menemukan belahan hatimu. Kisah tentang cinta pertama dan cinta terakhir. Kisah tentang Presiden ketiga Indonesia dan ibu negara. Kisah tentang Habibie dan Ainun. Rudy Habibie seorang jenius ahli pesawat terbang yang punya mimpi besar: berbakti kepada bangsa Indonesia dengan membuat truk terbang untuk menyatukan Indonesia. Sedangkan Ainun adalah seorang dokter muda cerdas yang dengan jalur karir terbuka lebar untuknya. Pada tahun 1962, dua kawan SMP ini bertemu lagi di Bandung. Habibie jatuh cinta seketika pada Ainun yang baginya semanis gula. Tapi Ainun, dia tak hanya jatuh cinta, dia iman pada visi dan mimpi Habibie. Mereka menikah dan terbang ke Jerman. Punya mimpi tak akan pernah mudah. Habibie dan Ainun tahu itu. Cinta mereka terbangun dalam perjalanan mewujudkan mimpi. Dinginnya salju Jerman, pengorbanan, rasa sakit, kesendirian serta godaan harta dan kuasa saat mereka kembali ke Indonesia mengiringi perjalanan dua hidup menjadi satu. Bagi Habibie, Ainun adalah segalanya. Ainun adalah mata untuk melihat hidupnya. Bagi Ainun, Habibie adalah segalanya, pengisi kasih dalam hidupnya. Namun setiap kisah mempunyai akhir, setiap mimpi mempunyai batas. Kemudian pada satu titik, dua belahan jiwa ini tersadar; Apakah cinta mereka akan bisa terus abadi?",
            "makmum : Dari film pendek peraih berbagai penghargaan karya Riza Pahlevi. Sosok ghaib yang disebut MAKMUM oleh para penghuni asrama semakin sering mengganggu sejak RINI (Titi Kamal) menetap kembali di asrama untuk memenuhi permintaan IBU KINANTI (Jajang C Noer) yang kesehatannya terus menurun. Rini menyadari ada sesuatu yang memang tidak beres di dalam asrama ini, ia mencoba membantu para siswi dan berusaha menguak misteri tersebut, hingga ia tidak sadar bahwa nyawanya sedang terancam.",
            "My Stupid Bos: Karena krisis kekurangan karyawan pabrik, akhirnya Bossman berniat untuk mencari karyawan pabrik baru di Vietnam. Berangkatlah Bossman, Diana, Mr.Kho, dan Adrian ke Vietnam. Di Vietnam alih-alih mendapatkan karyawan, justru mereka mendapatkan masalah demi masalah bertubi-tubi karena ulah Bossman.",
            "Pengabdi Setan : Setelah sakit aneh selama 3 tahun, Ibu akhirnya meninggal dunia. Bapak lalu memutuskan untuk kerja di luar kota meninggalkan anak-anak. Tak lama kemudian, anak-anak merasa bahwa Ibu kembali berada di rumah. Situasi semakin menyeramkan ketika mereka mengetahui bahwa Ibu datang lagi tidak sekedar untuk menjenguk, tapi untuk menjemput mereka.",
            "Pretty Boys : Setelah sakit aneh selama 3 tahun, Ibu akhirnya meninggal dunia. Bapak lalu memutuskan untuk kerja di luar kota meninggalkan anak-anak. Tak lama kemudian, anak-anak merasa bahwa Ibu kembali berada di rumah. Situasi semakin menyeramkan ketika mereka mengetahui bahwa Ibu datang lagi tidak sekedar untuk menjenguk, tapi untuk menjemput mereka.",
            "Single 2 : Ebi, menuju usia 30 tahun dan masih Single. Menuju usia 30 tahun tanpa pernah Pacaran.Menuj usia 30 tahun dan masih sendirian. Sekarang Ebi bertekad sebelum ulang tahunnya yang ke 30 ia harus melepaskan statusSinglenya. Ia harus punya pacar. Walau Ebi sama sekali tidak tahu bagaimana caranya.",
            "Warkop DKI Reborn 3 : Warkop DKI - Dono, Kasino, Indro kali ini mendapat tugas sebagai agen polisi rahasia. Mereka dibawah komando Komandan Cok, yang kehilangan tangan kanannya, Karman, saat mensinyalir adanya money laundry di dunia perfilman Indonesia. Tepatnya di sebuah PH yang dimiliki Amir Muka. Warkop DKI akhirnya bisa masuk dalam dunia film dan terlibat dalam sebuah pembuatan film komedi berpasangan dengan artis sinetron yang hijrah ke dunia film, Inka. Saat party, Warkop DKI yang sedang menyelidiki malah membuat Inka terjebak bersama mereka di sebuah ruangan. Warkop DKI dan Inka jatuh pingsan. Saat terbangun, Warkop DKI kaget karena berada di padang pasir! Tapi Inka lenyap! Pencarian Warkop DKI mencari jejak Inka, malah menyeret mereka dalam petualangan seru di padang pasir..."

    };

    private static String[] TanggalFilm = {
            "Rilis: 24 Februari 2019",
            "Rilis: 11 Juli 2019",
            "Rilis: 29 Agustus 2019",
            "Rilis: 20 Desember 2012",
            "Rilis: 15 Agustus 2019 ",
            "Rilis: 28 Maret 2019",
            "Rilis: 28 September 2017",
            "Rilis: 28 September 2017",
            "Rilis: 4 Juni 2019",
            "Rilis: 12 September 2019"

    };
    private static int[] GambarFilm = {
            R.drawable.dilan,
            R.drawable.dua_garis_biru,
            R.drawable.gundala,
            R.drawable.habibi_ainun,
            R.drawable.makmum,
            R.drawable.my_stupid_bos,
            R.drawable.pengabdi_setan,
            R.drawable.pretty_boys,
            R.drawable.single,
            R.drawable.warkop_dki_reborn,
    };

    static ArrayList<Film> getListData() {
        ArrayList<Film> list = new ArrayList<>();
        for (int position = 0; position < FilmName.length; position++) {
            Film film = new Film();
            film.setNamaFilm( FilmName[position] );
            film.setGenre( GendreFilm[position] );
            film.setDeskripsi( DeskripsiFilm[position] );
            film.setTanggalFilm( TanggalFilm[position] );
            film.setPhoto( GambarFilm[position] );
            list.add( film );
        }
        return list;

    }
}
