package com.example.dragger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngileModule {

    @Binds
    abstract fun provideEngine(petrolEngine: PetrolEngine):Engine
}