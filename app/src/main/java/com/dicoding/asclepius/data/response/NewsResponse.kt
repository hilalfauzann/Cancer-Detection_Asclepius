package com.dicoding.asclepius.data.response

import com.google.gson.annotations.SerializedName


data class ArticlesItem(

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("author")
	val author: String,

	val urlToImage: String
)

data class NewsResponse(

	@field:SerializedName("totalResults")
	val totalResults: Int,

	@field:SerializedName("status")
	val status: String,

	@field:SerializedName("articles")
	val articles: List<ArticlesItem>,
)


