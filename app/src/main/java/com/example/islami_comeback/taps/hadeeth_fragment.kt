package com.example.islami_comeback.taps

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islami_comeback.HadeethDetails
import com.example.islami_comeback.databinding.FragmentHadeethFragmentBinding
import com.example.islami_comeback.hadeeth_tab.hadeeth
import com.example.islami_comeback.hadeeth_tab.hadeethNameAdapter


class hadeeth_fragment : Fragment() {
lateinit var viewbinding:FragmentHadeethFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      viewbinding=FragmentHadeethFragmentBinding.inflate(layoutInflater)
        return viewbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initviews()

    }


    lateinit var adapter:hadeethNameAdapter
    private fun initviews() {
        adapter=hadeethNameAdapter(null)

        adapter.onitemclick=object :hadeethNameAdapter.onitemclicklistner{
            override fun onitemclick(position: Int, item: hadeeth) {
                starthadethdetail(item)
            }
        }
        viewbinding.hadeethRecycler.adapter=adapter

    }
    private fun starthadethdetail(item: hadeeth) {
        val intent=Intent(activity, HadeethDetails::class.java)
         intent.putExtra(constants.CONSTANT_HADETH,item)

        startActivity(intent)
    }
    override fun onStart() {
        super.onStart()
        loadhadethfile()
        binddata()
    }

    private fun binddata() {
            adapter.bindlist(hadeethlist)
    }

    val hadeethlist= mutableListOf<hadeeth>()
    private fun loadhadethfile() {
        val hadeethfile = requireActivity().assets.open("hadeeth.txt").bufferedReader().use{ it.readText() }
        val singelhadeth=hadeethfile.trim().split("#")
        singelhadeth.forEach { element->
            val lines=element.trim().split("\n")
            val title=lines[0]
            val content=lines.joinToString("\n")
            val hadeth= hadeeth(title,content)
            hadeethlist.add(hadeth)
        }

    }

}