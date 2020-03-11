package com.example.dragger

import dagger.Component

@Component(modules = [WheelsModule::class,PetrolEngileModule::class])
interface CarComponent {

    fun getCar():Car
    fun inject(mainActivity: MainActivity)
}