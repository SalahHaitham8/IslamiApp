package com.example.islami_comeback.quran_tab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_comeback.databinding.SuraNameBinding

 class  sura_name_adapter (val names:List<String>):RecyclerView.Adapter<sura_name_adapter.viewholder> (){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
       var viewbinding=SuraNameBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return viewholder(viewbinding)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {

        holder.viewbinding.suraname.text = names[position]
        if (onsuraname!= null) {
            holder.viewbinding.root.setOnClickListener {
                onsuraname?.onsuraclick(position,names[position])
            }

        }
    }

    override fun getItemCount(): Int =names.size

     class viewholder(val viewbinding: SuraNameBinding) : RecyclerView.ViewHolder(viewbinding.root)

     var onsuraname: onsuranameclick?=null
     interface onsuranameclick{
         fun onsuraclick(position:Int,name:String)
     }

}