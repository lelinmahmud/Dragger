package com.example.dragger.dagger

import com.example.dragger.car.Car
import com.example.dragger.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(modules = [WheelsModule::class, PetrolEngileModule::class])
interface ActivityComponet {

    fun getCar(): Car
    fun inject(mainActivity: MainActivity)
/*    @Subcomponent.Builder
    interface Builder{
        fun build(): ActivityComponet
    @BindsInstance
    fun horsePower(@Named("horse power")horsePower:Int): Builder

    @BindsInstance
    fun engineCapacity(@Named("engine capacity")engineCapacity:Int):Builder

}*/
    @Subcomponent.Factory
    interface Factory{
        fun create( @BindsInstance @Named("horse power")horsePower:Int, @BindsInstance @Named("engine capacity")engineCapacity:Int):ActivityComponet
    }
}