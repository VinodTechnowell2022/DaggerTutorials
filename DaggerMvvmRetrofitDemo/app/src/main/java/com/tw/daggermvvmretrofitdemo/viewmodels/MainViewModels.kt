package com.tw.daggermvvmretrofitdemo.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tw.daggermvvmretrofitdemo.models.ProductItem
import com.tw.daggermvvmretrofitdemo.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModels(private val repository: ProductRepository) :ViewModel() {


    val productLiveData : LiveData<List<ProductItem>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }

}