package com.tw.dagger10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


/*
* In this example we are understanding Application level Singleton dependency injection.
* */
class MainActivity : AppCompatActivity() {


    //https://www.youtube.com/watch?v=szs80OgMsy8&list=PLRKyZvuMYSIPwjYw1bt_7u7nEwe6vATQd&index=10
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


        val component = (application as MyApp).userRegistrationComponent
        component.injectAllDependency(this)

//        (MyApp()) as DaggerUserRegistrationComponent.appComponent.injectAllDependency(this)
        userRegistrationService.registerUser("cheesycode@gmail.com", "123456")

    }
}