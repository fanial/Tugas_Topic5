package com.f4l.tugas_topic5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //list
        val listProv = arrayListOf(
            DataList("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.aceh),
            DataList("Sumatra Utara", "Medan", R.drawable.sumut),
            DataList("Sumatra Selatan", "Palembang", R.drawable.sumsel),
            DataList("Sumatra Barat", "Padang", R.drawable.sumbar),
            DataList("Bengkulu", "Bengkulu", R.drawable.bengkulu),
            DataList("Riau", "Pekanbaru", R.drawable.riau2),
            DataList("Kepulauan Riau", "Tanjung Pinang", R.drawable.kep_riau),
            DataList("Jambi", "Jambi", R.drawable.jambi),
            DataList("Lampung", "Bandar Lampung", R.drawable.lampung),
            DataList("Bangka Belitung", "Pangkal Pinang", R.drawable.bangka_belitung),
            DataList("Kalimantan Timur", "Samarinda", R.drawable.kaltim),
            DataList("Kalimantan Barat", "Pontianak", R.drawable.kalbar),
            DataList("Kalimantan Tengah", "Palangkaraya", R.drawable.kalteng),
            DataList("Kalimantan Selatan", "Banjarbaru", R.drawable.kalsel),
            DataList("Kalimantan Utara", "Tanjung Selor", R.drawable.kaltara),
            DataList("DKI Jakarta", "Jakarta", R.drawable.dki),
            DataList("Banten", "Serang", R.drawable.banten),
            DataList("Jawa Barat", "Bandung", R.drawable.jabar),
            DataList("Jawa Tengah", "Semarang", R.drawable.jateng),
            DataList("DI Yogyakarta", "Yogyakarta", R.drawable.diy),
            DataList("Jawa Timur", "Surabaya", R.drawable.jatim),
            DataList("Bali", "Denpasar", R.drawable.bali),
            DataList("Nusa Tenggara Barat", "Mataram", R.drawable.ntb),
            DataList("Nusa Tenggara Timur", "Kupang", R.drawable.ntt),
            DataList("Sulawesi Utara", "Manado", R.drawable.sulut),
            DataList("Sulawesi Barat", "Mamuju", R.drawable.sulbar),
            DataList("Sulawesi Tengah", "Palu", R.drawable.sulteng),
            DataList("Gorontalo", "Gorontalo", R.drawable.gorontalo),
            DataList("Sulawesi Tenggara", "Kendari", R.drawable.sul_tenggara),
            DataList("Sulawesi Selatan", "Makassar", R.drawable.sulsel),
            DataList("Maluku Utara", "Sofifi ", R.drawable.maluku_utara),
            DataList("Maluku", "Ambon", R.drawable.maluku),
            DataList("Papua Barat", "Manokwari", R.drawable.papua_barat),
            DataList("Papua", "Jayapura", R.drawable.jayapura),
            DataList("Papua Selatan", "Kabupaten Merauke", R.drawable.papua_selatan),
            DataList("Papua Tengah", "Kabupaten Nabire", R.drawable.papua_tengah),
            DataList("Papua Pegunungan", "Kabupaten Jayawijaya", R.drawable.papua_pegunungan),

            )

        val adapter = ListAdapter(listProv)
        val lManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val rView = findViewById<RecyclerView>(R.id.rv_lat2)
        rView.layoutManager = lManager
        rView.adapter = adapter
    }
}