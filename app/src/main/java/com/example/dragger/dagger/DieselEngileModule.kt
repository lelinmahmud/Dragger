package com.example.dragger.dagger

import com.example.dragger.Engine
import com.example.dragger.car.DieselEngine
import dagger.Module
import dagger.Provides

@Module
 class DieselEngileModule(val horsePower:Int) {

    @Provides
     fun provideEngine(engine:DieselEngine): Engine {
        return engine
    }

    @Provides
    fun prividesHorsePower():Int{
        return horsePower
    }
}