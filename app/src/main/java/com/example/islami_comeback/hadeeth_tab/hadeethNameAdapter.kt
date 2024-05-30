package com.example.islami_comeback.hadeeth_tab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_comeback.databinding.ItemHadethBinding
import com.example.islami_comeback.databinding.VresesDetailsBinding
import com.example.islami_comeback.hadeeth

class hadeethNameAdapter(var ahadethlist:MutableList<hadeeth>?) :RecyclerView.Adapter<hadeethNameAdapter.Viewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
       val viewbinding=ItemHadethBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Viewholder(viewbinding)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        holder.viewbinding.NameOfHadeeth.text=ahadethlist!![position].title
        if (onitemclick!=null){
            holder.viewbinding.root.setOnClickListener{
                onitemclick?.onitemclick(position,ahadethlist!![position])
            }
        }
    }

    override fun getItemCount(): Int =ahadethlist?.size?:0

    class Viewholder(val viewbinding: ItemHadethBinding) :
        RecyclerView.ViewHolder(viewbinding.root)

fun bindlist(newlist:MutableList<hadeeth>){
    ahadethlist=newlist
    notifyDataSetChanged()
}
    var onitemclick:onitemclicklistner?=null
interface onitemclicklistner{
    fun onitemclick(position: Int,item:hadeeth)
}
}