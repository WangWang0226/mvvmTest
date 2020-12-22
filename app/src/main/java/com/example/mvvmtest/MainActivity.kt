package com.example.mvvmtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.mvvmtest.food.FoodRepoImp
import com.example.mvvmtest.food.FoodVM
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    val foodVM by lazy {
        getViewModel { FoodVM(FoodRepoImp()) }
    }



    lateinit var drinksVM : DrinksVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drinksVM = getViewModel()

        initObserve()

        btn_change_drinks.setOnClickListener {
            val i = Random.nextInt(0,3)
            when(i){
                0->drinksVM.drinksILike.value = "wine"
                1->drinksVM.drinksILike.value = "beer"
                2->drinksVM.drinksILike.value = "milk tea"
            }

        }

        btn_change_food.setOnClickListener {
            foodVM.change()
        }




    }


    fun initObserve(){

        drinksVM.drinksILike.observe(this, Observer {
            tv_drinks.text = "$it"
        })


        foodVM.foodILike.observe(this, Observer {
            tv_food.text = it
        })


    }
}
