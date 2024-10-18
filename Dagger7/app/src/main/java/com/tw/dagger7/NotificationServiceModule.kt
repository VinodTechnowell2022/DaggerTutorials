package com.tw.dagger7

import com.tw.dagger7.MessageService
import com.tw.dagger7.NotificationService
import dagger.Module
import dagger.Provides
import jakarta.inject.Named


@Module
class NotificationServiceModule {


    @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }


    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }

}