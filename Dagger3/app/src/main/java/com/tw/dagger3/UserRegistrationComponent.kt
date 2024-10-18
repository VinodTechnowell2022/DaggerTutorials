package com.tw.dagger3

import dagger.Component

//https://www.youtube.com/watch?v=vcr-wW50t8g&list=PLRKyZvuMYSIPwjYw1bt_7u7nEwe6vATQd&index=3
@Component
interface UserRegistrationComponent {

    //Define all the functions that needs to be injected or which object you needs in MainActivity

    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService(): EmailService


}