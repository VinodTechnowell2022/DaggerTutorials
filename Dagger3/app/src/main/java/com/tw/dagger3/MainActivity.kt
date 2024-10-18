package com.tw.dagger3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        * This is manual dependency injection example as we are creating objects manually and passing it to UserRegistrationService
        *
        * We should say 2 things to Dagger
        * 1) How to create an Object
        * 2) Where we use the object
        * */
//        val userRepository = UserRepository()
//        val emailService = EmailService()


        //Getting Object via Dagger
        val component = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()

        userRegistrationService.registerUser("cheesycode@gmail.com", "123456")

    }


}