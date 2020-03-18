package com.example.dragger.dagger

import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun getActivityComponentFactory():ActivityComponet.Factory

    @Component.Factory
    interface Factory{
        fun create(driverModule:DriverModule):AppComponent
    }
}