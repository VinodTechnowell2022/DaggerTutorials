package com.tw.daggermvvmretrofitroomdemo.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tw.daggermvvmretrofitroomdemo.db.ProductDB
import com.tw.daggermvvmretrofitroomdemo.models.Product
import com.tw.daggermvvmretrofitroomdemo.retrofit.ApiClient
import javax.inject.Inject

class ProductRepository @Inject constructor(private val apiClient: ApiClient, private val productDb: ProductDB) {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products


    suspend fun getProducts() {
        val result = apiClient.getProducts()
        if (result.isSuccessful && result.body() != null) {

            productDb.productDao().addProduct(result.body()!!)
            _products.postValue(result.body())
        }

    }

}