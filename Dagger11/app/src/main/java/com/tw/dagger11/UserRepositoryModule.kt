package com.tw.dagger11

import com.tw.dagger11.ApplicationScope
import com.tw.dagger11.SQLRepository
import com.tw.dagger11.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getFirebaseRepository(sqlRepository: SQLRepository): UserRepository


}