package com.example.prashant.cbs.Activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ViewFlipper

import com.example.prashant.cbs.Contact_us
import com.example.prashant.cbs.Faculty
import com.example.prashant.cbs.Portal
import com.example.prashant.cbs.R
import com.example.prashant.cbs.Sscbs
import com.example.prashant.cbs.Stu

class HomeActivity : AppCompatActivity() {

    internal var fade_in: Animation? = null
    internal var fade_out: Animation? = null
    internal var viewFlipper: ViewFlipper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        /*    viewFlipper= (ViewFlipper) this.findViewById(R.id.flipper);
        fade_in= AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        fade_out= AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(1500);
        viewFlipper.startFlipping();
*/

        findViewById(R.id.btnHome).setOnClickListener {
            println("Home Clicked...")
            val intent = Intent(this@HomeActivity, Splash_Activity::class.java)
            startActivity(intent)
        }

        findViewById(R.id.btnSscbs).setOnClickListener {
            println("SSCBS Clicked...")
            val intent = Intent(this@HomeActivity, SscbsActivity::class.java)
            startActivity(intent)
        }


        findViewById(R.id.btnLogin).setOnClickListener {
            val text = "http://sscbsweb.co.in/main/login.php"
            val intent = Intent(this@HomeActivity, Portal::class.java)
            intent.putExtra("web_add", text)
            startActivity(intent)
        }

        findViewById(R.id.btnStudent).setOnClickListener {
            println("Students Clicked...")
            val intent = Intent(this@HomeActivity, Stu::class.java)
            startActivity(intent)
        }

        findViewById(R.id.faculty).setOnClickListener {
            val intent = Intent(this@HomeActivity, Faculty::class.java)
            startActivity(intent)
        }

        findViewById(R.id.btnVictory).setOnClickListener {
            val intent = Intent(this@HomeActivity, Contact_us::class.java)
            startActivity(intent)
        }

    }
}
