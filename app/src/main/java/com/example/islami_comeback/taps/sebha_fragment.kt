package com.example.islami_comeback.taps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.islami_comeback.R
import com.example.islami_comeback.databinding.FragmentSebhaFragmentBinding


class sebha_fragment : Fragment() {
 lateinit var viewbinding:FragmentSebhaFragmentBinding
 var conter=0
lateinit var iv_sebha:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
          viewbinding= FragmentSebhaFragmentBinding.inflate(layoutInflater,container,false)
        return viewbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_sebha=viewbinding.bodyOfSebha
      viewbinding.counterSebha.text="$conter"
        viewbinding.convertertext.text=constants.SOBHAN_ALLAH

        viewbinding.bodyOfSebha.setOnClickListener{
         onsebhaclick()

        }

    }
         fun onsebhaclick(){

       iv_sebha.rotation=iv_sebha.rotation + 5
             conter++
             viewbinding.counterSebha.text="$conter"

             if (conter==33){

                 if (viewbinding.convertertext.text==constants.SOBHAN_ALLAH){
                     viewbinding.convertertext.text=constants.ALHMDU_LLAH
                     conter=0
                     viewbinding.counterSebha.text="$conter"

                 }
                 else if (viewbinding.convertertext.text==constants.ALHMDU_LLAH){
                     viewbinding.convertertext.text=constants.ALLAH_AKBAR
                     conter=0
                     viewbinding.counterSebha.text="$conter"

                 }
                 else if (viewbinding.convertertext.text==constants.ALLAH_AKBAR){
                     viewbinding.convertertext.text=constants.SOBHAN_ALLAH
                     conter=0
                     viewbinding.counterSebha.text="$conter"

                 }

             }



           }


}