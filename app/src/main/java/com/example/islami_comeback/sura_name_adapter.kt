package com.example.islami_comeback

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_comeback.databinding.SuraNameBinding

 class  sura_name_adapter (val names:List<String>):RecyclerView.Adapter<sura_name_adapter.viewholder> (){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
       var viewbinding=SuraNameBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return viewholder(viewbinding)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {

        holder.viewbinding.suraname.text=names[position]
        if (onsuraclick!=null){
            holder.viewbinding.root.setOnClickListener{
                onsuraclick?.onclick(names[position],position)
            }
        }

    }

    override fun getItemCount(): Int =names.size

     class viewholder(val viewbinding: SuraNameBinding) : RecyclerView.ViewHolder(viewbinding.root)
     var onsuraclick:onsuraclicklistner?=null
     interface onsuraclicklistner{
         fun onclick(item:String,position:Int)
     }

}