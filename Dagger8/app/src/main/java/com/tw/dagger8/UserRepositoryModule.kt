package com.tw.dagger8

import com.tw.dagger8.SQLRepository
import com.tw.dagger8.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getFirebaseRepository(sqlRepository: SQLRepository): UserRepository


}