package com.tw.dagger10

import dagger.Module
import dagger.Provides
import jakarta.inject.Named
import javax.inject.Singleton


@Module
class NotificationServiceModule() {


    @ApplicationScope
    @MessageQualifier   //this quaifier tells the component which obj is required
    @Provides
    fun getMessageService(retryCount: Int): NotificationService {
        return MessageService(retryCount)
    }


    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }

}