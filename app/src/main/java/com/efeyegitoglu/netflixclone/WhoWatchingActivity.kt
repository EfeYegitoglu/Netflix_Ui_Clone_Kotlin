package com.efeyegitoglu.netflixclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_who_watching.*

class WhoWatchingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_who_watching)

        setSupportActionBar(toolbarWhoWatching)


        imageView3.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_edit,menu)
        return super.onCreateOptionsMenu(menu)
    }
}