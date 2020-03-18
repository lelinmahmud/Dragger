package com.example.dragger

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horse power")val horsePower:Int, @Named("engine capacity")val engineCapacity:Int):Engine{
    companion object{
        private final val TAG="Car"
    }

    override fun start() {
        Log.e(TAG,"Petrol Engine Started...\n horsepower :${horsePower} \n engine capacity :${engineCapacity}")

    }

}