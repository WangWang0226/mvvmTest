package com.example.mvvmtest.food

import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class FoodRepoImp:FoodRepo {
    override val foodILike: MutableLiveData<String> = MutableLiveData()


    override fun change() {
        val i = Random.nextInt(0,3)
        when(i){
            0->foodILike.value = "fried chicken"
            1->foodILike.value = "fish"
            2->foodILike.value = "beef noodles"
        }

    }
}