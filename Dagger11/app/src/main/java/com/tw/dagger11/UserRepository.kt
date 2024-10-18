package com.tw.dagger11

import android.util.Log
import javax.inject.Inject

//This is how we loosely couple the classes as per future requirement/changes
interface UserRepository{
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticService: AnalyticService): UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.e(this.javaClass.simpleName, "User saved in DB", )
        analyticService.trackEvent("Save User", "CREATE")
    }

}


class FirebaseRepository(val analyticService: AnalyticService): UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(this.javaClass.simpleName, "User saved in Firebase", )
        analyticService.trackEvent("Save User", "CREATE")
    }

}