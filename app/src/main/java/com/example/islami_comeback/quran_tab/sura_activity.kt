package com.example.islami_comeback.quran_tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.islami_comeback.databinding.ActivitySuraBinding

class sura_activity : AppCompatActivity() {
    lateinit var viewbinding: ActivitySuraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewbinding = ActivitySuraBinding.inflate(layoutInflater)
        setContentView(viewbinding.root)
        initpram()
       loadfiles()
        initviews()



    }

    private fun initviews() {
        setSupportActionBar(viewbinding.toolparr)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        viewbinding.suranameAppbar.text=suraname
        supportActionBar?.title=""


    }

    private fun loadfiles() {
        val filecontent =
        assets.open("$suraposition.txt").bufferedReader().use{ it.readText() }
        val verse = filecontent.trimEnd().split("\n")
        bindverses(verse)
    }

lateinit var suraDetailAdapter: SuraDetailsAdapter
    private fun bindverses(verse: List<String>) {
     suraDetailAdapter= SuraDetailsAdapter(verse)

       viewbinding.contentChapterSura.chapterSuraDetailsRecycler.adapter=suraDetailAdapter

    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    lateinit var suraname: String
    var suraposition: Int? = 0
    private fun initpram() {
        suraname = intent.getStringExtra(constants.CONSTANT_NAME) ?: ""
        suraposition = intent.getIntExtra(constants.CONSTANT_INDEX, 0)
    }

}