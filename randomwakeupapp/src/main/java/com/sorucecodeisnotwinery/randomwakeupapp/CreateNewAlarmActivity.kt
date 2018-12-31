package com.sorucecodeisnotwinery.randomwakeupapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class CreateNewAlarmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_alarm)
    }

    fun createAlarm(view: View) {
        val alarmName = findViewById<EditText>(R.id.alarmNameInputText).text.toString();
        val result = findViewById<TextView>(R.id.resultLabel).apply {
            text = alarmName
        }
    }
}
