package com.baharudin.latihan.data.network

import com.baharudin.latihan.data.dto.FoodDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface FoodApi {
    @GET("recipes/complexSearch")
    suspend fun getRecipes() : Response<FoodDTO>

    @GET("recipes/{id}/information")
    suspend fun getRecipeDetail(
        @Path("id") id : Int
    )
}