package com.tw.dagger8

import com.tw.dagger8.EmailService
import com.tw.dagger8.MessageQualifier
import com.tw.dagger8.MessageService
import com.tw.dagger8.NotificationService
import dagger.Module
import dagger.Provides
import jakarta.inject.Named


@Module
class NotificationServiceModule() {


    @MessageQualifier
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