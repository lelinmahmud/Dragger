package com.example.dragger

import dagger.Component

@Component
interface CarComponent {

    fun getCar():Car
    fun inject(mainActivity: MainActivity)
}