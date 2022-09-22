package com.example.myproject.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myproject.Database.GroceryRepository

class GroceryViewModelFactory (private val repository: GroceryRepository): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GroceryViewModel(repository) as T
    }
}