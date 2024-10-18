package com.tw.daggermvvmretrofitdemo.retrofit

import com.tw.daggermvvmretrofitdemo.models.ProductItem
import com.tw.daggermvvmretrofitdemo.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {

    @GET(Constants.END_POINT)
    suspend fun getProducts(): Response<List<ProductItem>>

}