package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<String> hargaMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, hargaMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaMakanan.add("Ayam Geprek \n RP. 10.000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2019/07/Ayam-Geprek.jpg");
        infoMakanan.add("Ya, kini, gerai ayam geprek banyak bertebaran. Ada yang menyajikannya dengan sambal matah, sambal korek, sambal domba, sambal daun jeruk sampai sambal kemangi. Ada pula yang menambahkan lelehan keju mozzarella atau keju tabur agar citarasanya semakin lezat. Hidangan ayam geprek ini umumnya disajikan dan dinikmati dengan nasi serta kol goreng. Biasanya, ayam untuk ayam geprek dimasak layaknya ayam krispi, lalu dibubuhi sambal di atasnya.");
        hargaMakanan.add("RP. 10.000");

        namaMakanan.add("Tahu Cabe Garam \n RP. 10.000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2017/12/Tahu-Cabe-Garam.jpg");
        infoMakanan.add("Sajian ringan ini sedang populer dimana-mana. Hampir setiap tempat makan, baik cafe atau restoran selalu menghadirkan makanan hits ini di daftar menu mereka. Ya, adalah tahu cabe garam, snack yang terdiri dari potongan tahu yang digoreng kering, kemudian diberi potongan cabe hijau dan merah.");
        hargaMakanan.add("RP. 10.000");

        namaMakanan.add("Pisang Nugget \n RP. 15.000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2018/01/yuk-bikin-nugget-pisang-nih-resepnya_c_165573.jpg");
        infoMakanan.add("Biasanya, nugget terbuat dari daging ayam atau sayuran. Nah, kini, makanan ini sudah ada inovasinya. Yup, sekarang, nugget tidak hanya dibuat dari bahan-bahan tersebut, melainkan dari pisang. Cita rasanya pun tentu berbeda. Bukan asin nan gurih, tapi manis dan legit. Apalagi, ada banyak varian topping yang bisa dipilih. Mulai dari green tea, oreo, chocolate, tiramisu hingga alpukat dan mint.");
        hargaMakanan.add("RP. 15.000");

        namaMakanan.add("Baso Aci \n RP. 12.000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2018/12/Baso-Aci.jpg");
        infoMakanan.add("Ada baso aci! Baso aci ini merupakan snack asal Garut yang sedang digandrungi, Satu porsi baso aci terdiri dari cilok dengan aneka ragam isian, cuanki lidah, tahu hingga cuanki mini dan juga pilus.");
        hargaMakanan.add("RP. 12.000");

        namaMakanan.add("Sate Taichan \n RP. 20.000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2018/01/Sate-Taichan-Copy.jpg");
        infoMakanan.add("Salah satu makanan hits yang masih digemari pencinta makanan pedas adalah sate taichan. Sate taichan adalah sate yang dagingnya sudah dibumbui sebelum dibakar, jadi bumbu dibiarkan meresap lebih dulu sebelum diolah. Lalu setelah daging sate matang, biasanya sate taichan disajikan dengan nasi dan sambal khas khusus sate taichan yang pedas sekali.");
        hargaMakanan.add("RP. 20.000");

        namaMakanan.add("Churros \n RP. 15.000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2018/01/Churros-Copy.jpg");
        infoMakanan.add("Siapa yang nggak kenal dengan camilan enak bernama churros ini? Makanan ini sedang hits di Bandung karena selain rasanya memang enak untuk jadi camilan, tapi ternyata churros mudah dibuat sendiri. Churros juga mengalami banyak inovasi seperti rasa atau saus cocolannya. Kini ada churros red velvet, churros saus cocol rasa cokelat, atau masih banyak lagi.");
        hargaMakanan.add("RP. 15.000");

        namaMakanan.add("Salmon Mentai Rice \n RP. 35.000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2018/01/Salmon-Mentai-Rice-Copy.jpg");
        infoMakanan.add("Makanan hits satu ini memang memiliki rasa yang sangat enak sekali. Salmon Mentai Rice memiliki cita rasa yang unik. Untuk yang belum biasa dengan mentai, saus mentai adalah campuran telur ikan yang diasinkan dan dicampur dengan mayoneis. Rasanya yang unik  ini sangat cocok jika dicampur dengan ikan salom atau ikan laut lainnya.");
        hargaMakanan.add("RP. 35.000");

        namaMakanan.add("Kue Balok \n RP. 20.000");
        fotoMakanan.add("https://bacaterus.com/wp-content/uploads/2018/01/Kue-Balok-Copy.jpg");
        infoMakanan.add("Kue Balok menjadi makanan hits selanjutnya nih! Meskipun kue balok itu sudah ada sejak lama sekali, tapi sekarang kue balok menjadi kembali terkenal lagi. Kenapa? Karena banyaknya perkembangan yang terjadi seperti topping-nya yang makin beragam hingga ke kue balok yang berisi cokelat meleleh. Rasanya sih jangan ditanya lagi ya, dijamin enak!");
        hargaMakanan.add("RP. 20.000");

        prosesRecyclerViewAdapter();
    }
}