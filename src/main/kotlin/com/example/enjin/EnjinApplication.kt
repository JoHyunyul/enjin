package com.example.enjin

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication

@SpringBootApplication
class EnjinApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .sources(EnjinApplication::class.java)
            .web(WebApplicationType.REACTIVE)
            .run(*args)
}