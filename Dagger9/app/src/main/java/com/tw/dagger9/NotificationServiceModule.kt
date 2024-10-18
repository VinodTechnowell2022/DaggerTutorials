package com.tw.dagger9

import com.tw.dagger9.EmailService
import com.tw.dagger9.MessageQualifier
import com.tw.dagger9.MessageService
import com.tw.dagger9.NotificationService
import dagger.Module
import dagger.Provides
import jakarta.inject.Named
import javax.inject.Singleton


@Module
class NotificationServiceModule() {


    @Singleton
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