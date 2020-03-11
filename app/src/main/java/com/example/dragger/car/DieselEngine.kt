package com.example.dragger

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor():Engine{

    companion object{
        private final val TAG="Car"
    }

    override fun start() {
        Log.e(TAG,"Diesel Engine Started")

    }
}