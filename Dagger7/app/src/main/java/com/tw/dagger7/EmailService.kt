package com.tw.dagger7

import android.util.Log
import javax.inject.Inject

//This is how we loosely couple the classes

interface NotificationService{

    fun sendEmail(email: String, s: String, s1: String)

}

class EmailService @Inject constructor(): NotificationService {
    override fun sendEmail(email: String, s: String, s1: String) {
        Log.e(this.javaClass.simpleName, "Email send", )
    }
}


class MessageService: NotificationService {
    override fun sendEmail(email: String, s: String, s1: String) {
        Log.e(this.javaClass.simpleName, "message send", )
    }


}