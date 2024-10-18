package com.tw.daggermvvmretrofitroomdemo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.tw.daggermvvmretrofitroomdemo.utils.MyApp
import com.tw.daggermvvmretrofitroomdemo.viewmodels.MainViewModelFactory
import com.tw.daggermvvmretrofitroomdemo.viewmodels.MainViewModels
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    lateinit var mainViewModel: MainViewModels

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    private val products: TextView
        get() = findViewById(R.id.products)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Using this line Component check the fields annotated with @Inject and then inject their objects here
        (application as MyApp).applComponent.inject(this)
        mainViewModel = ViewModelProvider(this, mainViewModelFactory)[MainViewModels::class.java]

        mainViewModel.productLiveData.observe(this) {
            products.text = it.joinToString { x ->
                x.title+"\n\n"
            }
        }
    }

}