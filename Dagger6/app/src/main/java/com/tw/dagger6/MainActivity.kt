package com.tw.dagger6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject


/*
* In this example we will learn how to use Dagger's below annotation
* Problem- error: [Dagger/MissingBinding] com.tw.dagger6.UserRepository cannot be provided without an @Provides-annotated method.
* Solution below
*
* 1) @Module
*
* 2) @Provides
*
* 3) @Binds
*
*
* */
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.injectAllDependency(this)
        userRegistrationService.registerUser("cheesycode@gmail.com", "123456")

    }


}