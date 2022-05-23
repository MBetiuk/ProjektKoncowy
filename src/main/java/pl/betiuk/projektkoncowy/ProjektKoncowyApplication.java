package pl.betiuk.projektkoncowy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableJpaRepositories
public class ProjektKoncowyApplication {



    public static void main(String[] args) {
        SpringApplication.run(ProjektKoncowyApplication.class, args);
    }

}
