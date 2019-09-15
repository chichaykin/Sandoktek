package com.sandoktek.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sandoktek.data.TestHomeRepository

class HomeViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(
                repository = TestHomeRepository()
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}