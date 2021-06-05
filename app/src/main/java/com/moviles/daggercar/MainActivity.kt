package com.moviles.daggercar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val applicationGraph = DaggerCarComponent.create()
        val car:Car = applicationGraph.getCar()
        car.drive()
    }
}