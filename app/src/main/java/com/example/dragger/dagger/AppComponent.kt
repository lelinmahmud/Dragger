package com.example.dragger.dagger

import com.example.dragger.DieselEngileModule
import com.example.dragger.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponentBuilder():ActivityComponet.Builder
}