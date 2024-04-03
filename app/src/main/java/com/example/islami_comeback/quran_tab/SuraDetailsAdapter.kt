package com.example.islami_comeback.quran_tab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_comeback.databinding.VresesDetailsBinding

class SuraDetailsAdapter(val verses:List<String>) :RecyclerView.Adapter<SuraDetailsAdapter.Viewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
       val viewbinding=VresesDetailsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Viewholder(viewbinding)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.viewbinding.verseDetaillsLayout.text=verses[position]
    }

    override fun getItemCount(): Int =verses.size

    class Viewholder(val viewbinding: VresesDetailsBinding) :
        RecyclerView.ViewHolder(viewbinding.root)


}