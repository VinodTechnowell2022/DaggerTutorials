package com.tw.daggermvvmretrofitroomdemo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.tw.daggermvvmretrofitroomdemo.models.Product

@Database(entities = [Product::class], version = 1)
abstract class ProductDB: RoomDatabase() {

    abstract fun productDao(): ProductDao


}