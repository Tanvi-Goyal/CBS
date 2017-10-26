package com.example.prashant.cbs.Activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.prashant.cbs.R


import java.util.Timer
import java.util.TimerTask

class Splash_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)




        val timer = Timer()
        timer.schedule(object : TimerTask() {

            override fun run() {

                val intent = Intent(applicationContext, HomeActivity::class.java)
                startActivity(intent)
                finish()

            }
        }, 1000)
    }


}
