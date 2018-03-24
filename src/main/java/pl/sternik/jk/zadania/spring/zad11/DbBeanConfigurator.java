package pl.sternik.jk.zadania.spring.zad11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@PropertySource("database.properties")
public class DbBeanConfigurator {

	@Value("${jdbc.driverClassName}")
	private String driverClass;
	@Value("${jdbc.url}")
	private String jdbcUrl;
	@Value("${jdbc.username}")
	private String user;
	@Value("${jdbc.password}")
	private String password;

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer ppc = new PropertySourcesPlaceholderConfigurer();
		return ppc;
	}

	@Bean
	public pl.sternik.kk.zadania.spring.zad11.Connection dataSource() {
		return new pl.sternik.kk.zadania.spring.zad11.Connection(jdbcUrl + ":" + driverClass);
	}
}