package com.f4l.tugas_topic5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val listProv : ArrayList<DataList>):RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val prov = itemView.findViewById<TextView>(R.id.vProvinsi)
        val kota = itemView.findViewById<TextView>(R.id.vKota)
        val img = itemView.findViewById<ImageView>(R.id.img_rumahAdat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.prov.text = listProv[position].prov
        holder.kota.text = listProv[position].kota
        holder.img.setImageResource(listProv[position].img)
    }

    override fun getItemCount(): Int {
        return listProv.size
    }
}