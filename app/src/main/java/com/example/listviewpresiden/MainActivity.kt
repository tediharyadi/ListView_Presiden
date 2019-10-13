package com.example.listviewpresiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir soekarno", "Presiden ke-1 Indonesia.", R.drawable.soekarno))
        list.add(Model("Soeharto", "Presiden ke-2 Indonesia.", R.drawable.suharto))
        list.add(Model("BJ Habibie", "Presiden ke-3 Indonesia.", R.drawable.habibie))
        list.add(Model("Abdurrahman Wahid", "Presiden ke-4 Indonesia.", R.drawable.abdullrahman))
        list.add(Model("megawati", "Presiden ke-5 Indonesia", R.drawable.megawati))
        list.add(Model("Susilo Bambang Yudhoyono", "Presiden ke-6 Indonesia", R.drawable.sby))
        list.add(Model("Joko Widodo", "Presiden ke-7 Indonesia", R.drawable.jw))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "(Soekkarno)(lahir di Surabaya, Jawa Timur, 6 Juni 1901 – meninggal di Jakarta, 21 Juni 1970 pada umur 69 tahun) adalah Presiden Indonesia pertama yang menjabat pada periode 1945–1966.", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, "(Soeharto)lahir di Dusun Kemusuk, Desa Argomulyo, Kecamatan Sedayu, Bantul, Yogyakarta, 8 Juni 1921 – meninggal di Jakarta, 27 Januari 2008 pada umur 86 tahun) adalah Presiden ke-dua Indonesia yang menjabat dari tahun 1967 sampai 1998. ", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "Prof. Dr.-Ing. H. Bacharuddin Jusuf Habibie, Freng (lahir di Parepare, Sulawesi Selatan, 25 Juni 1936; umur 80 tahun) adalah Presiden Republik Indonesia yang ketiga. Ia menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1998. ", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "Dr.(H.C.) K. H. Abdurrahman Wahid atau yang akrab disapa Gus Dur (lahir di Jombang, Jawa Timur, 7 September 1940 – meninggal di Jakarta, 30 Desember 2009 pada umur 69 tahun)[1] adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001.", Toast.LENGTH_LONG).show()
            }
            if (position == 4 ){
                Toast.makeText(this@MainActivity, "Dr.(H.C.) Hj. Dyah Permata megawati Setyawati Soekarnoputri atau umumnya lebih dikenal sebagai megawati Soekarnoputri atau biasa disapa dengan panggilan \"Mbak Mega\" (lahir di Yogyakarta, 23 Januari 1947) adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 - 20 Oktober 2004.", Toast.LENGTH_LONG).show()
            }
            if (position == 5 ){
                Toast.makeText(this@MainActivity, "Jenderal TNI (Purn.) Prof. Dr. H. Susilo Bambang Yudhoyono GCB AC (lahir di Tremas, Arjosari, Pacitan, Jawa Timur, Indonesia, 9 September 1949) adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014.", Toast.LENGTH_LONG).show()
            }
            if (position == 6 ){
                Toast.makeText(this@MainActivity, "Ir. H. Joko Widodo atau yang lebih akrab disapa Jokowi (lahir di Surakarta, Jawa Tengah, 21 Juni 1961) adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014.", Toast.LENGTH_LONG).show()
            }
        }
    }
}