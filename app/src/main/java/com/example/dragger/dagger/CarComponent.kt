package com.example.dragger.dagger

import com.example.dragger.Car
import com.example.dragger.MainActivity
import com.example.dragger.WheelsModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelsModule::class, PetrolEngileModule::class])
interface CarComponent {

    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
    @Component.Builder
    interface Builder{
        fun build(): CarComponent
        @BindsInstance
        fun horsePower(@Named("horse power")horsePower:Int): Builder
        @BindsInstance
        fun engineCapacity(@Named("engine capacity")engineCapacity:Int):Builder

    }
}