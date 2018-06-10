package com.example.enjin.web.component

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

@Configuration
class CustomRouter(private val handler: CustomHandler) {
    @Bean
    fun routeIndex() = router {
        accept(MediaType.TEXT_HTML).nest {
            GET("/", handler::getIndex)
        }
    }

    @Bean
    fun routeMain() = router {
        accept(MediaType.TEXT_HTML).nest {
            GET("/main", handler::getMain)
        }
    }
}