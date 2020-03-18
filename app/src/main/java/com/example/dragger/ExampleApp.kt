package com.example.dragger

import android.app.Application
import com.example.dragger.dagger.AppComponent
import com.example.dragger.dagger.DaggerAppComponent
import com.example.dragger.dagger.DriverModule


class ExampleApp: Application() {
    private lateinit var appComponent:AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.factory().create(DriverModule("Lelin"))

    }

    fun getAppComponent():AppComponent{
        return appComponent
    }


}