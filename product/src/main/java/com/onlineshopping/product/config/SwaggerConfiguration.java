package com.onlineshopping.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.any()).build()
                .apiInfo(getApiInfo());

    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("Product Microservice",
                "Product Microservice for Online Shopping Portal",
                "1.0",
                "https://github.com/jahnavigunda/onlineShopping",
                new Contact("Jahnavi", "https://github.com/jahnavigunda/onlineShopping", "jahnavi.gunda93@gmail.com"),
                "Terms of Use", "", Collections.emptyList());
    }
}
