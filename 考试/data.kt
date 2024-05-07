package com.example.middleexam

data class Commodity(
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int
)

data class Equipment(
    val id: Int,
    val name: String,
    val category: String,
    val quantity: Int,
    val condition: String
)

val commodityList = listOf(
    Commodity(1, "Apple", 1.0, 10),
    Commodity(2, "Banana", 0.5, 20),
    Commodity(3, "Orange", 0.8, 15)
)

val equipmentList = listOf(
    Equipment(1, "Laptop", "Electronics", 5, "Good"),
    Equipment(2, "Chair", "Furniture", 20, "Fair"),
    Equipment(3, "Hammer", "Tools", 10, "Excellent")
)
