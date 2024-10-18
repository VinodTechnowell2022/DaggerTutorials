package com.tw.dagger6

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

    @Binds
    abstract fun getFirebaseRepository(sqlRepository: SQLRepository): UserRepository


}