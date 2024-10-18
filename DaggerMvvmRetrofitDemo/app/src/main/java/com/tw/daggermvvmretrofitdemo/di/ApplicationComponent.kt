package com.tw.daggermvvmretrofitdemo.di

import com.tw.daggermvvmretrofitdemo.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent{

    fun inject(mainActivity: MainActivity)
}