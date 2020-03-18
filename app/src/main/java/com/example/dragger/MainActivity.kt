package com.example.dragger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dragger.car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car1: Car
    @Inject lateinit var car2: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent= ((application as ExampleApp).getAppComponent()).getActivityComponentFactory().create(150,1500)
        //car=carComponent.getCar()
        carComponent.inject(this)

        car1.drive()
        car2.drive()
    }


}
