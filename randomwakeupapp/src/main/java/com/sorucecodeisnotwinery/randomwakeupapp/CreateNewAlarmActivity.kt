package com.sorucecodeisnotwinery.randomwakeupapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView

class CreateNewAlarmActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private lateinit var span: Spinner
    private val spanOptions = arrayOf("exact", "± 2min", "± 5min", "± 10min")
    private var selectedSpan = "exact"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_alarm)

        // get the spinner from the xml.
        span = findViewById(R.id.spanSpinner)
        // create an adapter to describe how the items are displayed, adapters are used in several places in android.
        // There are multiple variations of this, but this is the basic variant.
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, spanOptions)
        // set the spinners adapter to the previously created one.
        span.adapter = adapter
        span.setSelection(0)
        span.setOnItemSelectedListener(this)
    }

    fun createAlarm(view: View) {
        val alarmName = findViewById<EditText>(R.id.alarmNameInputText).text.toString()
        val timeControl = findViewById<TimePicker>(R.id.timeInputTime)
        val time = "${padZero(timeControl.hour)}:${padZero(timeControl.minute)}"
        val result = findViewById<TextView>(R.id.resultLabel).apply {
            text = getString(R.string.created_text, alarmName, time, selectedSpan)
        }
    }

    fun padZero(value: Int): String {
        return if (value > 9) value.toString() else "0${value}"
    }

    override fun onItemSelected(parent: AdapterView<*>, v: View, position: Int, id: Long) {
        selectedSpan = spanOptions[position]
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // do nothing
    }

}
