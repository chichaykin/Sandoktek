package com.sandoktek.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sandoktek.data.TestHomeRepository
import com.sandoktek.data.model.Transaction

class HomeViewModel(val repository: TestHomeRepository) : ViewModel() {

    private val _data = MutableLiveData<List<Transaction>>().apply {
        value = repository.getData()
    }
    val data: LiveData<List<Transaction>> = _data

    private val _amount = MutableLiveData<String>().apply {
        value = repository.getTotalAmount()
    }

    val amount: LiveData<String> = _amount
}