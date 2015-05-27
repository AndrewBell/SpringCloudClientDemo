package springCloudServerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
public class SpringCloudServerDemoApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello World.";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerDemoApplication.class, args);
    }
}
