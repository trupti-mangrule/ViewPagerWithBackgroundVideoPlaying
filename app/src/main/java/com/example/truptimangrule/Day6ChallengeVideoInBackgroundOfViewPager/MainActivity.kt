package com.example.truptimangrule.day6challenge

import android.app.FragmentManager
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.widget.MediaController
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.example.truptimangrule.day6challenge.R.id.videoView



class MainActivity : AppCompatActivity() {


    var TAG:String="MainActivity"
    var adapter:ViewPagerAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.bringToFront()
        btn_log_in.bringToFront()
        btn_sign_up.bringToFront()
        circle_indicator.bringToFront()
        imageView.bringToFront()

        //videoView.onKeyDown(164, KeyEvent())
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback))
        Log.d(TAG,Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback).toString())
        videoView.start()
        videoView.setOnCompletionListener {
            videoView.start()

        }
        adapter= ViewPagerAdapter(this.supportFragmentManager,this)

        viewPager.setAdapter(adapter)
        //viewPager.setCurrentItem(100,true)
       // circle_indicator.setViewPager(viewPager)

    }

    override fun onResume() {
        super.onResume()
        videoView.start()
    }
}
