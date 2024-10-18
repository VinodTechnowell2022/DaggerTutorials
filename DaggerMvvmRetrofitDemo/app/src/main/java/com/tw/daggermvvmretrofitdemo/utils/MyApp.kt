package com.tw.daggermvvmretrofitdemo.utils

import android.app.Application
import com.tw.daggermvvmretrofitdemo.di.ApplicationComponent
import com.tw.daggermvvmretrofitdemo.di.DaggerApplicationComponent

class MyApp: Application() {

    lateinit var applComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applComponent = DaggerApplicationComponent.builder().build()
    }

}