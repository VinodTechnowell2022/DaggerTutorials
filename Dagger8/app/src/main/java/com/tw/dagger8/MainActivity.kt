package com.tw.dagger8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    //https://www.youtube.com/watch?v=LvAiu9yVFT0&list=PLRKyZvuMYSIPwjYw1bt_7u7nEwe6vATQd&index=7
    //Factory example with BindInstance
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)

        component.injectAllDependency(this)
        userRegistrationService.registerUser("cheesycode@gmail.com", "123456")

    }


}