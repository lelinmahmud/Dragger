package com.example.dragger.dagger

import com.example.dragger.car.Driver
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
 class DriverModule(val driverName:String) {
    @Provides
    @Singleton
     fun bindsDriver():Driver{
        return Driver(driverName)
    }
}