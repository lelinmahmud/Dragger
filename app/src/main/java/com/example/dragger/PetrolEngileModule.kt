package com.example.dragger

import dagger.Module
import dagger.Provides

@Module
class PetrolEngileModule {

    @Provides
    fun provideEngine(petrolEngine: PetrolEngine):Engine{
        return petrolEngine
    }
}