package com.tw.dagger9

import com.tw.dagger9.SQLRepository
import com.tw.dagger9.UserRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @Singleton
    abstract fun getFirebaseRepository(sqlRepository: SQLRepository): UserRepository


}