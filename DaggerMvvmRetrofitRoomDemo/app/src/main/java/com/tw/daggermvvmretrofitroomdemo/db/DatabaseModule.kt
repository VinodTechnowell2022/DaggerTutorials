package com.tw.daggermvvmretrofitroomdemo.db

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideProductDB(context: Context): ProductDB {
        return Room.databaseBuilder(context, ProductDB::class.java, "ProductDB").build()

    }

}