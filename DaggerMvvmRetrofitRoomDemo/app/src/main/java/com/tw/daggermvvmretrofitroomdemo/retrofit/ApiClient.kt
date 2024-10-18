package com.tw.daggermvvmretrofitroomdemo.retrofit

import com.tw.daggermvvmretrofitroomdemo.models.Product
import com.tw.daggermvvmretrofitroomdemo.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {

    @GET(Constants.END_POINT)
    suspend fun getProducts(): Response<List<Product>>

}