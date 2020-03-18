package com.example.dragger.car

import android.util.Log
import com.example.dragger.Engine
import javax.inject.Inject

class DieselEngine @Inject constructor (val horsePower:Int): Engine {

    companion object{
        private final val TAG="Car"
    }

    override fun start() {
        Log.e(TAG,"Diesel Engine Started...horse power : ${horsePower}")

    }
}