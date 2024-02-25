package SUShuttleService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("ShuttleService.SUBackEnd")
public class ShuttleApp {
    public static void main(String[] args) {
        SpringApplication.run(ShuttleApp.class, args);
    }
}
