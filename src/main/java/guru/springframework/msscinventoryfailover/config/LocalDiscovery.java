package guru.springframework.msscinventoryfailover.config;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@EnableEurekaClient
@Profile("local-discovery")
public class LocalDiscovery {
}
