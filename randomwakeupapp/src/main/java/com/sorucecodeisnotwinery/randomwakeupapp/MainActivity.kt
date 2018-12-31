package com.sorucecodeisnotwinery.randomwakeupapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startCreateNewAlarmActivity(view: View) {
        val intent = Intent(this, CreateNewAlarmActivity::class.java)
        startActivity(intent)
    }
}
