package com.tw.dagger4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Getting Object via Dagger
        val component = DaggerUserRegistrationComponent.builder().build()
        component.injectAllDependency(this@MainActivity) //all fields are initialized when this function invoked


        userRegistrationService.registerUser("cheesycode@gmail.com", "123456")

    }


}