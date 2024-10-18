package com.tw.dagger6

import dagger.Component

//https://www.youtube.com/watch?v=2NT1Ef3F_Y0&list=PLRKyZvuMYSIPwjYw1bt_7u7nEwe6vATQd&index=5

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    //Define all the functions that needs to be injected or which object you needs in MainActivity
    //or tell dagger to where you use dependency objects
    fun injectAllDependency(mainActivity: MainActivity)


}