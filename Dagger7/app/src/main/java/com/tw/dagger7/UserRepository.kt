package com.tw.dagger7

import android.util.Log
import javax.inject.Inject

//This is how we loosely couple the classes as per future requirement/changes
interface UserRepository{
    fun saveUser(email: String, password: String)
}

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