package com.example.mvvmtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DrinksVM : ViewModel() {
    val drinksILike = MutableLiveData<String>()

}