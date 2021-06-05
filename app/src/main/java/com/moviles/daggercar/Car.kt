package com.moviles.daggercar

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(engine:Engine, wheels:Wheels) {
    private val TAG = "car"

    fun drive(){
        Log.d(TAG, "driving...");
    }
}