package lutfi_kharisma.tugas1resepmakanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep   = (RecyclerView) findViewById(R.id.list_resep);

        adapter     = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("Grombyang","Soto Daging Kerbau khas Pemalang",
                "<b>Bahan Dasar :</b><br>" +
                        "Daging 1 kg<br>" +
                        "Lengkuas 1cm<br>" +
                        "Daun Salam 3 Lembar<br>" +
                        "Daun Jeruk 2 lembar<br>" +
                        "Kemiri 4 Butir<br>" +
                        "Bawang merah 5 butir<br>" +
                        "Bawang Putih 5 butir<br>" +
                        "2cm laos/lengkuas<br>" +
                        "Garam Halus secukupnya<br>" +
                        "Daun salam<br>" +
                        "<br>" +
                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Daging sapi diiris kotak lalu direbus bersama campuran bumbu rebus,<br>" +
                        " rebus hingga empuk lalu angkat dan tiriskan. Buang ½ air rebusan daging<br>" +
                        "2.Selanjutnya tumiskan bumbu halus lalu tambahkan dengan gula jawa dan air, lalu aduk rata.<br>" +
                        "3.Masukkan daging sapi bersama air kaldunya kedalam tumisan, aduk dan masak hingga mendidih.<br>" +
                        "4.Berikutnya masukkan serundeng halus disusul cabe rawit utuh, lalu aduk kembali<br>" +
                        "5.Sebelum diangkat koreksi rasanya hingga terasa enak lalu angkat<br>" +
                        "6.Ambil cabe rawit yang mengambang pada masakan tersebut lalu simpan pada wadah terpisah<br>" +
                        "7.Untuk menatanya siapkan nasi pada piring lalu siramkan masakan daging bersama kuah diatasnya, taburi dengan bawang goreng dan irisan daun bawang.<br>" +
                        "8.Untuk cabe rawit yang dipisahkan dalam wadah terpisah bisa digerus terlebih dahulu dengan sendok lalu sajikan dengan nasi gerombyang<br>" +
                        "9.nasi grombyang siap di hidangkan<br>"



                ,"grombyang"));

        dataResep.add(new Resep("Lontong Dekem","Makanan khas pemalang yang kaya akan rempah",
                "<b>Bahan Dasar :</b><br>" +
                        "1 1/2 ekor (400 gram) ayam dipotong-potong<br>" +
                        "5 siung bawang merah<br>" +
                        "3 siung bawang putih<br>" +
                        "2 buah kemiri<br>" +
                        "1 buah tomat besar<br>" +
                        "5 buah belimbing wuluh<br>" +
                        "10 buah cabe rawit<br>" +
                        "2cm laos/lengkuas<br>" +
                        "1cm jahe<br>" +
                        "5 lembar daun alam<br>" +
                        "2lembar daun jeruk<br>" +
                        "secukupnya kemangi<br>" +
                        "1 lontong<br>" +
                        "secukupnya garam<br>" +
                        "secukupnya gula<br>" +
                        "<br>" +
                        "<b>Langkah Pembuatan :</b><br>" +
                        "1.Rebuslah ayam dengan air yang sudah disediakan dengan daun salam.<br>" +
                        "2.Taburi ayam denan garam dan jeruk nipis untuk menghilangkan bau amis dan diamkan 10 menit.<br>" +
                        "3.Rebus Ayam dan Buang Airnya.<br>" +
                        "4.buat bumbu halus (bawang merah bawang putih kemiri)<br>" +
                        "5.potongi cabe, tomat, bimbing wuluh. (bumbu potong)<br>" +
                        "6.siapkan bumbu2 lain, potong agar tidak terlalu panjang<br>" +
                        "7.tumis bumbu halus, setelah harum masukkan laos, jahe, serai, daun jeruk, tambahkan air sedikit dan masukkan ayam. Beri garam dan gula.<br>" +
                        "8.ambil ayam secukupnya, beri bumbu potong, daun salam, kemangi, dan bungkus daun pisang<br>" +
                        "9.masukkan ayam beserta lontong<br>" +
                        "10.Sajikan.<br>"


                ,"dekem"));

    }

}
