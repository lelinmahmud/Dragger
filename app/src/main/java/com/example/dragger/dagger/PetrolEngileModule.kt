package com.example.dragger.dagger

import com.example.dragger.Engine
import com.example.dragger.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngileModule {

    @Binds
    abstract fun provideEngine(petrolEngine: PetrolEngine): Engine
}