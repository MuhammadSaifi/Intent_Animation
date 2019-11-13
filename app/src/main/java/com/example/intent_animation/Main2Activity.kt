package com.example.intent_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import maes.tech.intentanim.CustomIntent

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    override fun finish(){
        super.finish()
        CustomIntent.customType(this,"fadein-to-fadeout")
    }
}
