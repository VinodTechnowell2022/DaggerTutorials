package com.tw.daggermvvmretrofitroomdemo.di

import android.content.Context
import com.tw.daggermvvmretrofitroomdemo.MainActivity
import com.tw.daggermvvmretrofitroomdemo.db.DatabaseModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, DatabaseModule::class])
interface ApplicationComponent{

    fun inject(mainActivity: MainActivity)

    @Component.Factory  //This factory method is defined here bcz we needs context at runtime
    interface Factory{
        fun create(@BindsInstance context: Context): ApplicationComponent

    }

}