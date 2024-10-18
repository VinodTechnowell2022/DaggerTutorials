package com.tw.daggermvvmretrofitroomdemo.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "product")
data class Product(

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("price")
	val price: String,

	@field:SerializedName("description")
	val description: String,

	@PrimaryKey(autoGenerate = false)
	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("category")
	val category: String
)


