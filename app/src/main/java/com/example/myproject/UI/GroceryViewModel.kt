package com.example.myproject.UI

import androidx.lifecycle.ViewModel
import com.example.myproject.Database.Entity.GroceryItems
import com.example.myproject.Database.GroceryRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository): ViewModel() {
    fun insert(item: GroceryItems) = GlobalScope.launch {
        repository.insert(item)
    }
    fun delete(item: GroceryItems) = GlobalScope.launch {
        repository.delete(item)
    }
    fun allGroceryItems() = repository.allGroceryItems()
}