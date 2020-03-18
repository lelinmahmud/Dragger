package com.example.dragger.car

import android.util.Log
import com.example.dragger.Engine
import com.example.dragger.Remote
import com.example.dragger.Wheels
import com.example.dragger.dagger.PerActivity
import javax.inject.Inject
@PerActivity
class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels, val driver: Driver) {
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