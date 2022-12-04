package com.romankudryashov.eventdrivenarchitecture.notificationservice

import com.romankudryashov.eventdrivenarchitecture.commonmodel.spring.CommonRuntimeHints
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportRuntimeHints
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@ImportRuntimeHints(CommonRuntimeHints::class)
@EnableScheduling
class NotificationServiceApplication

fun main(args: Array<String>) {
    runApplication<NotificationServiceApplication>(*args)
}
