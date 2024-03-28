package com.example.islami_comeback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami_comeback.databinding.ActivitySuraBinding

class sura_activity : AppCompatActivity() {
    lateinit var viewbinding:ActivitySuraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding= ActivitySuraBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)

        initpram()
    }
lateinit var name1: String
var index:Int=0
    private fun initpram() {
      name1= intent.getStringExtra(constants.CONSTANT_NAME)?:""
        index=intent.getIntExtra(constants.CONSTANT_INDEX,0)
    }
}