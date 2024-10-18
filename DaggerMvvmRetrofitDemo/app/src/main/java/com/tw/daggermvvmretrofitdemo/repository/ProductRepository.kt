package com.tw.daggermvvmretrofitdemo.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tw.daggermvvmretrofitdemo.models.ProductItem
import com.tw.daggermvvmretrofitdemo.retrofit.ApiClient
import javax.inject.Inject

class ProductRepository @Inject constructor(private val apiClient: ApiClient) {

    private val _products = MutableLiveData<List<ProductItem>>()
    val products: LiveData<List<ProductItem>> get() = _products


    suspend fun getProducts() {
        val result = apiClient.getProducts()
        if (result.isSuccessful && result.body() != null) {
            _products.postValue(result.body())
        }

    }

}