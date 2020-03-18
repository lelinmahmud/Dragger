package com.example.dragger

import com.example.dragger.car.DieselEngine
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
 class DieselEngileModule(val horsePower:Int) {

    @Provides
     fun provideEngine(engine:DieselEngine):Engine{
        return engine
    }

    @Provides
    fun prividesHorsePower():Int{
        return horsePower
    }
}