package com.example.islami_comeback

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami_comeback.databinding.ActivityHadeethDetailsBinding
import com.example.islami_comeback.hadeeth_tab.hadeeth

class HadeethDetails : AppCompatActivity() {
    lateinit var viewbinding:ActivityHadeethDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding= ActivityHadeethDetailsBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)
        initviews()
        initpram()
        bindhadeth()
    }

    private fun bindhadeth() {
        viewbinding.hadethContent.text=hadeeth?.content
    }

    private fun initviews() {
        setSupportActionBar(viewbinding.toolparr)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title=""
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    var hadeeth: hadeeth?=null
    private fun initpram() {
        if (Build.VERSION.SDK_INT >= 33) {
            hadeeth=  intent.getSerializableExtra(constants.CONSTANT_HADETH,hadeeth!!::class.java)
        }
        else{
            hadeeth=  intent.getSerializableExtra(constants.CONSTANT_HADETH)as hadeeth

        }
    }
}