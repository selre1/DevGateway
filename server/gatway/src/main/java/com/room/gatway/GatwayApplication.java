package com.room.gatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatwayApplication.class, args);
	}

	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder, ApiFilter apiFilter){
		return builder.routes()
				.route("dev-api1",
						routeSpec ->routeSpec.path("/api1/**")
								.filters(filterSpec -> filterSpec.filter(apiFilter.apply(new ApiFilter.Config())))
								.uri("http://localhost:8081")
				)
				.route("dev-api2",
						routeSpec ->routeSpec.path("/api2/**").uri("http://localhost:8082")
				)
				.build();
	}

}
