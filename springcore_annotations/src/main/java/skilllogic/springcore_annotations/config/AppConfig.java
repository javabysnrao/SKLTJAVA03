package skilllogic.springcore_annotations.config;

import java.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "skilllogic.springcore_annotations.beans")
public class AppConfig {
	@Bean("ldt")
	public LocalDateTime getLocalTime() {
		return LocalDateTime.now();
	}
}
