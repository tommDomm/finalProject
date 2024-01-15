package by.itacademy.flat;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableFeignClients
@SpringBootApplication
@EnableWebMvc
public class FlatsApplication {
    public static void main(String[] args) { SpringApplication.run(FlatsApplication.class,args); }
}
