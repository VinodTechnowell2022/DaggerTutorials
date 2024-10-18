package com.tw.daggermvvmretrofitdemo.models

import com.google.gson.annotations.SerializedName

data class ProductsResponse(

	@field:SerializedName("ProductsResponse")
	val productsResponse: List<ProductItem?>
)

data class ProductItem(

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("price")
	val price: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("category")
	val category: String
)


