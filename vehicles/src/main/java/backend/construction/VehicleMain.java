package backend.construction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class VehicleMain {
    public static void main(String[] args) {
        SpringApplication.run(VehicleMain.class, args);

        String url = "http://localhost:8080/employee";
        WebClient.Builder builder = WebClient.builder();

        String employee = builder.build().get().uri(url).retrieve().bodyToMono(String.class).block();

        System.out.println("Responseeeeeeeeeeee " + employee);

    }
}