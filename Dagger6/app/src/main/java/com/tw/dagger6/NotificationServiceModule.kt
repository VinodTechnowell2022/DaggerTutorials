package com.tw.dagger6

import dagger.Module
import dagger.Provides


@Module
class NotificationServiceModule {


    @Provides
    fun getEmailService(): NotificationService {
        return MessageService()
    }

}