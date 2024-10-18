package com.tw.daggermvvmretrofitroomdemo.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.tw.daggermvvmretrofitroomdemo.models.Product

@Dao
interface ProductDao {

    @Insert
   suspend fun addProduct(product: List<Product>)

   @Query("SELECT * FROM product")
   suspend fun getProducts(): List<Product>

}