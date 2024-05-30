package com.example.islami_comeback.hadeeth_tab

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami_comeback.R
import com.example.islami_comeback.databinding.ActivityHadethDetailsBinding
import com.example.islami_comeback.hadeeth

class hadeth_details : AppCompatActivity() {
    lateinit var viewbinding:ActivityHadethDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding= ActivityHadethDetailsBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)
       // initpram()

    }

     var hadeeth:hadeeth?=null
    private fun initpram() {
        if (Build.VERSION.SDK_INT >= 33) {
            hadeeth=  intent.getSerializableExtra(constants.CONSTANT_HADETH,hadeeth!!::class.java)
        }
        else{
            hadeeth=  intent.getSerializableExtra(constants.CONSTANT_HADETH)as hadeeth

        }
    }
}