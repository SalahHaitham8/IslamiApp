package com.example.islami_comeback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.islami_comeback.databinding.ActivityHomeBinding
import com.example.islami_comeback.taps.hadeeth_fragment
import com.example.islami_comeback.taps.quran_fragment
import com.example.islami_comeback.taps.radio_fragment
import com.example.islami_comeback.taps.sebha_fragment
import com.google.android.material.navigation.NavigationBarView

class home_activity : AppCompatActivity() {
    lateinit var viewbinding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)
       supportActionBar?.hide()
        viewbinding.botoomNav.setOnItemSelectedListener(object :NavigationBarView.OnItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when(item.itemId){
                    R.id.quran_icon->{showfragment(quran_fragment())}
                    R.id.hadeeth_icon->{showfragment(hadeeth_fragment())}
                    R.id.sebha_icon->{showfragment(sebha_fragment())}
                    R.id.radio_icon->{showfragment(radio_fragment())}


                }




                return true
            }
        })
        viewbinding.botoomNav.selectedItemId=R.id.quran_icon
    }
    fun showfragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.container,fragment).commit()
    }
}