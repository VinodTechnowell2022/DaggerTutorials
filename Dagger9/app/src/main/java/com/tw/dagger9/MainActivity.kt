package com.tw.dagger9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tw.dagger8.DaggerUserRegistrationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    //https://www.youtube.com/watch?v=pdS2JtfrXFs&list=PLRKyZvuMYSIPwjYw1bt_7u7nEwe6vATQd&index=8
    //Factory example with BindInstance
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService1: EmailService

    @Inject
    lateinit var emailService2: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)

        component.injectAllDependency(this)
        userRegistrationService.registerUser("cheesycode@gmail.com", "123456")

    }


}