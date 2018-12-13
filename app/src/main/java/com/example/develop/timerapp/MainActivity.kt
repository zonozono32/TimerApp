package com.example.develop.timerapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import java.util.*

class MainActivity : AppCompatActivity() {

    var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timer = Timer()
        val timerTask = CountUpTimerTask()

        timer.schedule(timerTask, 0, 100);
    }

    inner class CountUpTimerTask : TimerTask() {
        override fun run() {
            count = count + 1
            Log.d("MainActivity", "test" + count)
        }
    }
}
