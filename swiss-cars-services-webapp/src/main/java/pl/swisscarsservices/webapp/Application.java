package pl.swisscarsservices.webapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.swisscarsservices.core.CoreModule;

@SpringBootApplication
@EntityScan("pl.swisscarsservices")
@EnableJpaRepositories("pl.swisscarsservices")
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class, CoreModule.class).run(args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
