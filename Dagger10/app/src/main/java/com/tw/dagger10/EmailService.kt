package com.tw.dagger10

import android.util.Log
import com.tw.dagger10.Constants.TAG
import javax.inject.Inject
import javax.inject.Singleton

//This is how we loosely couple the classes

interface NotificationService{

    fun sendEmail(email: String, s: String, s1: String)

}

@ApplicationScope
class EmailService @Inject constructor(): NotificationService {
    override fun sendEmail(email: String, s: String, s1: String) {
        Log.e(TAG, "Email send", )
    }
}


class MessageService(private val retryCount:Int): NotificationService {
    override fun sendEmail(email: String, s: String, s1: String) {
        Log.e(TAG, "message send retryCount $retryCount", )
    }


}