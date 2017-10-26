package com.example.prashant.cbs.Activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import butterknife.BindView
import butterknife.ButterKnife

import com.example.prashant.cbs.About_us
import com.example.prashant.cbs.Facilities
import com.example.prashant.cbs.LifeAtCbs
import com.example.prashant.cbs.R

class SscbsActivity : AppCompatActivity() {

    lateinit var toolbar:Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sscbs)


        toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener { onBackPressed() }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "SSCBS"


        findViewById(R.id.about).setOnClickListener {
            val intent = Intent(this@SscbsActivity, About_us::class.java)
            startActivity(intent)
        }

        findViewById(R.id.lifeCbs).setOnClickListener {
            val intent = Intent(this@SscbsActivity, LifeAtCbs::class.java)
            startActivity(intent)
        }

        findViewById(R.id.facilities).setOnClickListener {
            val intent = Intent(this@SscbsActivity, Facilities::class.java)
            startActivity(intent)
        }

    }
}