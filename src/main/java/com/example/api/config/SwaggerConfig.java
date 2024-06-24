package com.example.api.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "list 명세서",
                description = "API에 대한 자세한 설명을 기록한 문서입니다.",
                version = "v1",
                contact = @Contact(
                        name = "sein",
                        email = "did756984@example.com",
                        url = "https://www.example.com"
                )
        )
)
@Configuration
public class SwaggerConfig {



}