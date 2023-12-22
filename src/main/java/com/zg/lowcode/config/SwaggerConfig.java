package com.zg.lowcode.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵刚
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("供需系统API")
                .description("供需系统API")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .contact(new Contact("", "", ""))
                .build();
    }

    @Bean
    public Docket customImplementation() {
//        ParameterBuilder tokenBuilder = new ParameterBuilder();
        List<Parameter> params = new ArrayList<>();
//        tokenBuilder.name("access_token")
//                .description("user access token")
//                .modelRef(new ModelRef("String"))
//                .parameterType("header")
//                .required(false)
//                .build();
//        params.add(tokenBuilder.build());
//        ParameterBuilder refreshTokenBuilder = new ParameterBuilder();
//        refreshTokenBuilder.name("refresh_token")
//                .description("user refresh token")
//                .modelRef(new ModelRef("String"))
//                .parameterType("header")
//                .required(false)
//                .build();
//        params.add(refreshTokenBuilder.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zg.lowcode"))
                .build()
                .globalOperationParameters(params)
                .directModelSubstitute(LocalDate.class,
                        java.util.Date.class)
                .apiInfo(apiInfo());
    }
}
