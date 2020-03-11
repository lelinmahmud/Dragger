package com.example.dragger

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DieselEngileModule {

    @Binds
    abstract fun provideEngine(engine: DieselEngine):Engine
}