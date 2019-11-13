 package com.example.intent_animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import maes.tech.intentanim.CustomIntent

 class MainActivity : AppCompatActivity() {

     // add following dependency in our gradle
     //     implementation'com.github.hajiyevelnur92:intentanimation:1.0'

     // add following code in our intent_Animation gradle file
     // allprojects {
     //    repositories {
     //        google()
     //        jcenter()
     //   maven link add only
     //      maven{url 'https://jitpack.io'}
     //    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        CustomIntent.customType(this,"fadein-to-fadeout")

        }
    }

}
