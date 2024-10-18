package com.tw.dagger11

import dagger.BindsInstance
import dagger.Component

//https://www.youtube.com/watch?v=2NT1Ef3F_Y0&list=PLRKyZvuMYSIPwjYw1bt_7u7nEwe6vATQd&index=5

@ActivityScope
@Component(dependencies = [AppComponent::class], modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    //Define all the functions that needs to be injected or which object you needs in MainActivity
    //or tell dagger to where you use dependency objects
    fun injectAllDependency(mainActivity: MainActivity)

   // fun getEmailService(): EmailService

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int, appComponent: AppComponent): UserRegistrationComponent
    }

}