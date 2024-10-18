package com.tw.dagger9

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

//This is how we loosely couple the classes as per future requirement/changes
interface UserRepository{
    fun saveUser(email: String, password: String)
}

@Singleton
class SQLRepository @Inject constructor(): UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.e(this.javaClass.simpleName, "User saved in DB", )
    }

}


class FirebaseRepository: UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(this.javaClass.simpleName, "User saved in Firebase", )
    }

}