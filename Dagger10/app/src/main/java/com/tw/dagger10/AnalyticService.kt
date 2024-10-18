package com.tw.dagger10

import android.util.Log
import com.tw.dagger10.Constants.TAG

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