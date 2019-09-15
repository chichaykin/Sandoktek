package com.sandoktek.data

import com.sandoktek.R
import com.sandoktek.data.model.Transaction

class TestHomeRepository {
    fun getTotalAmount() = "Balance: 102.34 SGD"
    fun getData() = listOf(
        Transaction(name = "Insurance", amount = "-100", imageId = R.drawable.sharp_house_24),
        Transaction(name = "Transport", amount = "-10", imageId = R.drawable.sharp_commute_24),
        Transaction(name = "Starbucks", amount = "-10", imageId = R.drawable.sharp_free_breakfast_24),
        Transaction(name = "Shop", amount = "-10", imageId = R.drawable.sharp_shopping_cart_24),
        Transaction(name = "Utilities", amount = "30", imageId = R.drawable.sharp_house_24),
        Transaction(name = "Income", amount = "150", imageId = R.drawable.sharp_face_24)
    )
}
