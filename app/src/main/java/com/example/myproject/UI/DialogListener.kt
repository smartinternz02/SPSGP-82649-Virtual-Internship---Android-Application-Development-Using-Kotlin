package com.example.myproject.UI

import com.example.myproject.Database.Entity.GroceryItems

interface DialogListener {
     fun onAddButtonClicked(item:GroceryItems)
}