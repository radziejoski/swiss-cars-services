package pl.swisscarsservices.webapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;
import pl.swisscarsservices.core.CoreModule;

@SpringBootApplication
//@Import(WebAppConfiguration.class)
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class, CoreModule.class).run(args);
	}
}
