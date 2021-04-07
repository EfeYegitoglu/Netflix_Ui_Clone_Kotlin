package com.efeyegitoglu.netflixclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_start.*
import me.relex.circleindicator.CircleIndicator3

class StartActivity : AppCompatActivity() {

    private var imageList = mutableListOf<Int>()
    private var titleList = mutableListOf<String>()
    private var aboutList = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        val handler = Handler()
        handler.postDelayed({
            progressBarSplash.visibility = View.GONE
            splashScreen.visibility = View.GONE
        }, 1000)

        setSupportActionBar(toolbarStartScreen)

        addToList()

        viewPager2.adapter = ViewPagerAdapter(imageList,titleList,aboutList)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        val indicator = findViewById<CircleIndicator3>(R.id.circleIndicator3)
        indicator.setViewPager(viewPager2)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_start_screen,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.option_privacy){

        }else if (item.itemId == R.id.option_login){
            startActivity(Intent(this,LoginActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

    private fun addToList(){
        imageList.add(R.drawable.slider_bg_one)
        imageList.add(R.drawable.slider_bg_two)
        imageList.add(R.drawable.slider_bg_three)
        imageList.add(R.drawable.slider_bg_four)
        titleList.add("Sınırsız film, dizi ve çok daha fazlası")
        titleList.add("İndirin ve çevirimdışı izleyin")
        titleList.add("Eğlence çok, taahhüt yok")
        titleList.add("İstediğiniz her yerde izleyin")
        aboutList.add("İstediğiniz her yerde izleyin. İstediğinizzaman iptal edebilirsiniz.")
        aboutList.add("Her zaman çevirimdışı izleyecek bir şeyleriniz olsun.")
        aboutList.add("Bugün katılın, istediğiniz zaman iptal edin.")
        aboutList.add("Telefonda, tablette, dizüstü bilgisayarda, televizyonda ve daha fazlasında ileyin")
    }
}