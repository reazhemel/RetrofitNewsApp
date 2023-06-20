package com.example.retrofitnewsapp.data

import com.example.retrofitnewsapp.models.NewsResponse
import com.example.retrofitnewsapp.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/top_headlines")
    suspend fun getBreakingNews(
        @Query("country")
        country: String = "bn",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = Constants.API_KEY
    ): Response<NewsResponse>
}