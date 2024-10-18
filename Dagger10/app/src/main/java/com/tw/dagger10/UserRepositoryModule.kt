package com.tw.dagger10

import com.tw.dagger10.SQLRepository
import com.tw.dagger10.UserRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @ApplicationScope
    abstract fun getFirebaseRepository(sqlRepository: SQLRepository): UserRepository


}