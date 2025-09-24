package com.example.appomarbravo.viewmodels


import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.appomarbravogrupoX.model.Product

class MainViewModel : ViewModel() {
    var productList by mutableStateOf(getDummyProducts())
        private set

    private fun getDummyProducts(): List<Product> {
        return listOf(
            Product(
                id = 1,
                name = "Laptop Gamer ASUS",
                description = "Potente laptop para gaming de última generación con procesador i7 y 16GB de RAM.",
                price = 1200.00,
                imageUrl = "https://via.placeholder.com/150"
            ),
            Product(
                id = 2,
                name = "Monitor UltraWide 4K",
                description = "Monitor de alta resolución ideal para diseñadores y gamers.",
                price = 450.00,
                imageUrl = "https://via.placeholder.com/150"
            ),
            Product(
                id = 3,
                name = "Teclado Mecánico RGB",
                description = "Teclado con switches mecánicos y retroiluminación RGB personalizable.",
                price = 85.50,
                imageUrl = "https://via.placeholder.com/150"
            ),
            Product(
                id = 4,
                name = "Mouse Inalámbrico",
                description = "Mouse ergonómico con batería de larga duración y sensor de alta precisión.",
                price = 35.00,
                imageUrl = "https://via.placeholder.com/150"
            )
        )
    }
}