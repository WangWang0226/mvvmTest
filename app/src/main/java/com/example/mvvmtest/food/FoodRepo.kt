package com.example.mvvmtest.food

import androidx.lifecycle.MutableLiveData

interface FoodRepo {

    val foodILike:MutableLiveData<String>

    fun change()
}