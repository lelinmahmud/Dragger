package com.example.dragger

import android.util.Log
import com.example.dragger.car.Car
import javax.inject.Inject

class Remote @Inject constructor() {

    companion object{
        private final val TAG="Car"
    }

    fun setListener(car: Car){
        Log.e(TAG,"Remote Connected")
    }
}