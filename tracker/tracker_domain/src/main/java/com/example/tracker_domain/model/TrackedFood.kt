package com.example.tracker_domain.model

import java.time.LocalDate

data class TrackedFood(
    val name:String,
    val carb: Int,
    val protein:Int,
    val fat: Int,
    val imageUrl: String?,
    val mealType :MealType,
    val amount: Int,
    val date: LocalDate,
    val calories :Int,
    val id: Int? = null
)

val defaultTrackedFood = listOf(
    TrackedFood(
        name = "Hamburger",
        carb = 30,
        protein = 12,
        fat = 23,
        imageUrl = "https://static-00.iconduck.com/assets.00/burger-icon-2048x1894-mby72fuh.png",
        mealType = MealType.Breakfast,
        amount = 300,
        date = LocalDate.now(),
        calories = 30 * 4 + 12 * 4 + 23 * 9,
        id = 1
    )
)