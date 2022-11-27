package com.tro.tarotcardsimpl.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi openApi() {
        return GroupedOpenApi
                .builder()
                .group("taro")
                .packagesToScan("com/tro/tarotcardsimpl/controller")
                .build();
    }
}
