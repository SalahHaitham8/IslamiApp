package com.example.islami_comeback.taps

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islami_comeback.databinding.FragmentQuranFragmentBinding
import com.example.islami_comeback.sura_activity
import com.example.islami_comeback.sura_name_adapter


class quran_fragment : Fragment() {
lateinit var viewbinding:   FragmentQuranFragmentBinding
    var names= listOf("الفاتحه","البقرة","آل عمران","النساء","المائدة","الأنعام","الأعراف","الأنفال","التوبة","يونس","هود"
        ,"يوسف","الرعد","إبراهيم","الحجر","النحل","الإسراء","الكهف","مريم","طه","الأنبياء","الحج","المؤمنون"
        ,"النّور","الفرقان","الشعراء","النّمل","القصص","العنكبوت","الرّوم","لقمان","السجدة","الأحزاب","سبأ"
        ,"فاطر","يس","الصافات","ص","الزمر","غافر","فصّلت","الشورى","الزخرف","الدّخان","الجاثية","الأحقاف"
        ,"محمد","الفتح","الحجرات","ق","الذاريات","الطور","النجم","القمر","الرحمن","الواقعة","الحديد","المجادلة"
        ,"الحشر","الممتحنة","الصف","الجمعة","المنافقون","التغابن","الطلاق","التحريم","الملك","القلم","الحاقة","المعارج"
        ,"نوح","الجن","المزّمّل","المدّثر","القيامة","الإنسان","المرسلات","النبأ","النازعات","عبس","التكوير","الإنفطار"
        ,"المطفّفين","الإنشقاق","البروج","الطارق","الأعلى","الغاشية","الفجر","البلد","الشمس","الليل","الضحى","الشرح"
        ,"التين","العلق","القدر","البينة","الزلزلة","العاديات","القارعة","التكاثر","العصر",
        "الهمزة","الفيل","قريش","الماعون","الكوثر","الكافرون","النصر","المسد","الإخلاص","الفلق","الناس")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewbinding=FragmentQuranFragmentBinding.inflate(layoutInflater)
        return viewbinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initrecycler()
    }
 lateinit var adapter: sura_name_adapter
    private fun initrecycler() {
        adapter= sura_name_adapter(names)
        adapter.onsuraclick=object :sura_name_adapter.onsuraclicklistner{
            override fun onclick(name: String, position: Int) {
               startchapaterdetailactivity(name,position)

            }
        }
        viewbinding.recyclerSuraname.adapter=adapter

    }
    fun startchapaterdetailactivity(name:String,position:Int){
        val intent=Intent(context,sura_activity::class.java)
        intent.putExtra(constants.CONSTANT_NAME,name)
        intent.putExtra(constants.CONSTANT_INDEX,position+1)
        startActivity(intent)


    }


}