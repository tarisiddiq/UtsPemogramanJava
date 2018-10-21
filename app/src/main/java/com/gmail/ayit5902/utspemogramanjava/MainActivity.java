package com.gmail.ayit5902.utspemogramanjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String Item[] = {"Subahanale", "Serat Penginang", "Ragi Genep", "Bintang Empat", "Keker", "Wayang"};
    String SubItem[] = {"Motif subhanale mempunyai makna keikhlasan dan kesabaran, serta bentuk berserah diri kepada Tuhan Yang Maha Esa. Pada mulanya yang dinamakan motif Subhanale adalah motif geometris segi enam, didalamnya diberi isian atu dekorasi berbagai bentuk bunga seperti bunga remawa, kenanga atau tanjung.",
            "Dalam bahasa Sasak “Serat Penginang“  artinya  tempat menginang (makan sirih). Ciri motif corak ini berbentuk kotak-kotak segi empat dan diberi hiasan motif binatang, tepak dara atau garis silang menyilang. Motif Serat Penginang bisa digunakan oleh pria atau wanita saat melakukan upacara adat. Motif ini bermakna manusia harus memiliki sikap kebersamaan dan rukun terhadap sesamanya.",
            "Ragi dalam ungkapan bahasa Sasak berarti syarat. Tata cara “Genep“ berarti cukup. Makna ungkapan ini adalah orang yang hendak berpergian sebaiknya berpakaian yang memenuhi syarat, sesuai dengan tata cara/norma yang berlaku di masyarakat tersebut.  Biasanya dipakai sarung dan dapat digunakan untuk kegiatan sehari-hari, baik oleh pria ataupun wanita. Pria untuk dodot sementara Wanita sebagai Selendang.",
            "Ciri khas motif bintang empat ini menggunakan corak kotak-kotak warna merah dan hijau muda, atau garis-garis mendatar dengan warna merah dan hitam. Penggambaran bentuk bintang empat ini menyerupai bunga ceplok. Istilah bintang empat berhubungan dengan arah mata angin, yang diambil sebagai inpirasi keluarnya bintang timur pada pagi hari. Sebagai pertanda bahwa fajar segera tiba.",
            "Motif Keker menggambarkan kedamaian dalam memadu kasih sambil bernaung di bawah pohon.  Motif Keker merupakan motif klasik, digambarkan berupa hewan merak berhadap-hadapan yang bernaung di bawah pohon. Motif Keker ini mencerminkan kebahagiaan dan kedamaian dalam memadu kasih di bawah pohon. Motif keker menggunakan dasar benang katun dan berkembang menjadi benang sutra. Seiring dengan berjalannya waktu, motif keker berbahan benang emas atau perak. Penggunaan kain tenun dengan motif keker ini sebagai pakaian pesta.",
            "Pada prinsipnya wayang selalu digambarkan berpasang-pasangan, biasanya diselingi/diapit oleh paying (pohon hayat). Motif wayang bermakna bahwa sebenarnya manusia itu tidak bisa hidup individualis (sendiri-sendiri). Sehingga memerlukan bantuan orang lain untuk bermusyawarah dibawah naungan paying agung (pohon hayat). Pohon Hayat adalah lambang kehidupan. Kain dengan motif ini digunakan untuk pesta atau upacara adat baik laki-laki ataupun perempuan."};
    int flags[] = {R.drawable.songket1, R.drawable.songket2, R.drawable.songket3, R.drawable.songket4, R.drawable.songket5, R.drawable.songket6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView) findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item, SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}


