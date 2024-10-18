package com.tw.dagger10

import java.lang.annotation.Documented
import javax.inject.Scope


@Scope
@Documented
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationScope()
