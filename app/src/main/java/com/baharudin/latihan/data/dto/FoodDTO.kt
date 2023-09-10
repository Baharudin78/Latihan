package com.baharudin.latihan.data.dto

data class FoodDTO(
    val number: Int,
    val offset: Int,
    val foodResponses: List<FoodResponse>,
    val totalResults: Int
)