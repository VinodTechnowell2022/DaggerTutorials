package com.tw.dagger10

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalyticsService(): AnalyticService {
        return MixPanel()
    }


}