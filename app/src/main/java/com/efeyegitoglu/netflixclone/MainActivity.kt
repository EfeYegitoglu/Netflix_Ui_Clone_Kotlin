package com.efeyegitoglu.netflixclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var tempFragment: Fragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.main_frame_layout, HomeFragment())
            .commit()



        bottomNavigationView.setOnNavigationItemSelectedListener {
            if (it.itemId == R.id.option_home) {
                tempFragment = HomeFragment()

            }
            if (it.itemId == R.id.option_soon) {
                tempFragment = ComingSoonFragment()

            }
            if (it.itemId == R.id.option_download) {
                tempFragment= DownloadsFragment()
            }

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_frame_layout, tempFragment)
                .commit()

            true
        }


    }

}