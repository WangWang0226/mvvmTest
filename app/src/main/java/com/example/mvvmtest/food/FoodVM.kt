package com.example.mvvmtest.food

import androidx.lifecycle.ViewModel

class FoodVM(val repo: FoodRepo):ViewModel() {
    val foodILike = repo.foodILike

    fun change(){
        repo.change()
    }
}