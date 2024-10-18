package com.tw.dagger7

import com.tw.dagger7.SQLRepository
import com.tw.dagger7.UserRepository
import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getFirebaseRepository(sqlRepository: SQLRepository): UserRepository


}