package com.example.islami_comeback.taps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islami_comeback.databinding.FragmentRadioFragmentBinding


class radio_fragment : Fragment() {
lateinit var viewbinding:FragmentRadioFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewbinding=FragmentRadioFragmentBinding.inflate(layoutInflater,container,false)

        return viewbinding.root
    }


}