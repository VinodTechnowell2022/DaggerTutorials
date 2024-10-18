package com.tw.dagger11

import javax.inject.Inject


//Problem 1
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {


    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.sendEmail(email, "no-reply@cheezycode.com", "User Registered")
    }


    /*
    * Unit Testing - (not possible bcz first we need prepared UserRepository and EmailService objects then we go for testing)
    * Single Responsibility violation - (1) creating objects 2) user registration )
    * Lifetime of these Object - (object of UserRepository and EmailService cannot be destroyed but they can be destroyed with this class)
    * Extensible - (UserRepository and EmailService are hardcoded with this class and cannot be used any other class)
    * */
}