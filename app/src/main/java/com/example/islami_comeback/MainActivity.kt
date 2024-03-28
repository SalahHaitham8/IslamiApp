package com.example.islami_comeback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler(Looper.getMainLooper()).postDelayed(object :Runnable{
            override fun run() {
                val intent=Intent(this@MainActivity,home_activity::class.java)
                startActivity(intent)
            }
                                                                    }

            ,2000)
    }

}