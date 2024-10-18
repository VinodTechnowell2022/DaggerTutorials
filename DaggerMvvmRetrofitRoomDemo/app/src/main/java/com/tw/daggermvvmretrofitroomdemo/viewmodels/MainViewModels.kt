package com.tw.daggermvvmretrofitroomdemo.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tw.daggermvvmretrofitroomdemo.models.Product
import com.tw.daggermvvmretrofitroomdemo.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModels(private val repository: ProductRepository) :ViewModel() {


    val productLiveData : LiveData<List<Product>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }

}