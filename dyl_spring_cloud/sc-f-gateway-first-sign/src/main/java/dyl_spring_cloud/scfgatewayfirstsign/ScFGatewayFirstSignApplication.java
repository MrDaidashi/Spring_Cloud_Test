package dyl_spring_cloud.scfgatewayfirstsign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ScFGatewayFirstSignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScFGatewayFirstSignApplication.class, args);
	}

//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder){
//		return builder.routes()
//				.route(p -> p.path("/get")
//				.filters(f -> f.addRequestHeader("Hello","world"))
//				.uri("http://httpbin.org:80"))
//				.build();
//	}
}
