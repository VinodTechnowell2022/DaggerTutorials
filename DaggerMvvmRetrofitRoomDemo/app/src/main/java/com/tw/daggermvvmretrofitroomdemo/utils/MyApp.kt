package com.tw.daggermvvmretrofitroomdemo.utils

import android.app.Application
import com.tw.daggermvvmretrofitroomdemo.di.ApplicationComponent
import com.tw.daggermvvmretrofitroomdemo.di.DaggerApplicationComponent

class MyApp: Application() {

    lateinit var applComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applComponent = DaggerApplicationComponent.factory().create(this)
    }

}