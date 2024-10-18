package com.tw.dagger8

import android.util.Log
import com.tw.dagger8.Constants.TAG
import javax.inject.Inject

//This is how we loosely couple the classes

interface NotificationService{

    fun sendEmail(email: String, s: String, s1: String)

}

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