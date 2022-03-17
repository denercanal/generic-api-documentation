package com.generic.api.documentation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket( DocumentationType.SWAGGER_2 )
				.apiInfo( apiInfo() )
				.select()
				.apis( RequestHandlerSelectors.any() )
				.paths( PathSelectors
						.any() )
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title( "Generic API Documentation" )
				.description( "Generic API Documentation for Springboot Projects" )
				.contact( getContact() )
				.version( "1.0.0" )
				.build();
	}

	private Contact getContact() {
		return new Contact( "Dener Cezati Canal", "", "denercanal@hotmail.com" );
	}

}
