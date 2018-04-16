package be.javaacademy.amauryroyers.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"be.javaacademy.amauryroyers"})
public class OrderWithDatabases {
    public static void main(String[] args) {
        SpringApplication.run(OrderWithDatabases.class, args);
    }
}
