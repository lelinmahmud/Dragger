package com.example.dragger

import android.app.Application
import com.example.dragger.dagger.AppComponent
import com.example.dragger.dagger.DaggerAppComponent


class ExampleApp: Application() {
    private lateinit var appComponent:AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.create()

    }

    fun getAppComponent():AppComponent{
        return appComponent
    }


}