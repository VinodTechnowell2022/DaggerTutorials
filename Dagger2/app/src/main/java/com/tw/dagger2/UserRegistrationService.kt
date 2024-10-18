package com.tw.dagger2


//Problem 1
class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {


    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "no-reply@cheezycode.com", "User Registered")
    }


    /*
    * Unit Testing - (not possible bcz first we need prepared UserRepository and EmailService objects then we go for testing)
    * Single Responsibility violation - (1) creating objects 2) user registration )
    * Lifetime of these Object - (object of UserRepository and EmailService cannot be destroyed but they can be destroyed with this class)
    * Extensible - (UserRepository and EmailService are hardcoded with this class and cannot be used any other class)
    * */
}