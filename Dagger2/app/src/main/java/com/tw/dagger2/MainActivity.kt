package com.tw.dagger2

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
        * To avoid manual dependency injection we use Dagger2, It will help us to create objects automatically
        * suppose we needs these objects in many classes then repeated code will be created
        * and dagger will avoid our boilerplate repeated codes
        * */
        val userRepository = UserRepository()
        val emailService = EmailService()

        val userRegistrationService = UserRegistrationService(userRepository, emailService)
        userRegistrationService.registerUser("cheesycode@gmail.com", "123456")

    }


}