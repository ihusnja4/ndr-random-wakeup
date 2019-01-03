package com.sorucecodeisnotwinery.randomwakeupapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.ArrayAdapter
import android.widget.Spinner



class CreateNewAlarmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_alarm)

        //get the spinner from the xml.
        val dropdown = findViewById<Spinner>(R.id.spanSpinner)
        //create a list of items for the spinner.
        val items = arrayOf("exact", "± 2min", "± 5min", "± 10min")
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        //set the spinners adapter to the previously created one.
        dropdown.adapter = adapter
        dropdown.setSelection(0)
    }

    fun createAlarm(view: View) {
        val alarmName = findViewById<EditText>(R.id.alarmNameInputText).text.toString();
        val result = findViewById<TextView>(R.id.resultLabel).apply {
            text = alarmName
        }
    }
}
