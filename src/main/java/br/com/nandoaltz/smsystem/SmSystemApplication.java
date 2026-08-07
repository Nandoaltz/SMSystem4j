package br.com.nandoaltz.smsystem;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SmSystemApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SmSystemApplication.class, args);

        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(SmSystemApplication.class);
        springApplicationBuilder.bannerMode(Banner.Mode.OFF);
        springApplicationBuilder.run(args);

    }
}