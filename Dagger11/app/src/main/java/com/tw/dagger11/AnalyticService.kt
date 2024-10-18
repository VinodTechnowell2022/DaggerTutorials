package com.tw.dagger11

import android.util.Log
import com.tw.dagger11.Constants.TAG

interface AnalyticService {

    fun trackEvent(eventName: String, eventType: String)


}

class MixPanel: AnalyticService {

    override fun trackEvent(eventName: String, eventType: String) {
        Log.e(TAG, "MixPanel - $eventName, $eventType ", )
    }

}


class FirebaseAnalytics: AnalyticService {

    override fun trackEvent(eventName: String, eventType: String) {
        Log.e(TAG, "FirebaseAnalytics - $eventName, $eventType ", )
    }

}