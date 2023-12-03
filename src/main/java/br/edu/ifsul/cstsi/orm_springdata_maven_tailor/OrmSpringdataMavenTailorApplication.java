package br.edu.ifsul.cstsi.orm_springdata_maven_tailor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class OrmSpringdataMavenTailorApplication {

    public static void main(String[] args) {
        run(OrmSpringdataMavenTailorApplication.class, args);
        HomeController.main(null);
    }

}
