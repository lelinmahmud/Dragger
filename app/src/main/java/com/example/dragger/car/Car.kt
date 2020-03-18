package com.example.dragger

import android.util.Log
import com.example.dragger.car.Driver
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine,private val wheels: Wheels,val driver: Driver) {
    companion object{
        private final val TAG="Car"
    }



    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive(){
        engine.start()
        Log.e(TAG,"${driver} Drives ${this}")
    }
}