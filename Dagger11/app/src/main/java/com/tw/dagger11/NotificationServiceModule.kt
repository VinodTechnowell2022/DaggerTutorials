package com.tw.dagger11

import com.tw.dagger11.ApplicationScope
import com.tw.dagger11.EmailService
import com.tw.dagger11.MessageQualifier
import com.tw.dagger11.MessageService
import com.tw.dagger11.NotificationService
import dagger.Module
import dagger.Provides
import jakarta.inject.Named


@Module
class NotificationServiceModule() {


    @ActivityScope
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