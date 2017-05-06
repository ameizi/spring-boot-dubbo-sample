package net.aimeizi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Starter {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Starter.class, args);
        HelloService helloService = context.getBean(HelloService.class);
        for (int i = 0; i < 1000; i++) {
            System.out.println(helloService.echoService.echo(String.valueOf(i)));
        }
    }
}
