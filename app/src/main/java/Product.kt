package com.example.api3
data class Product (
    val id: Int = 0,
    val name : String = "",
    val description: String = "",
    val price : Double = 0.0,
    val currency : String = "",
    val in_stock: Boolean = false
)
data class ProductResponse(
    val products: List<Product>
)