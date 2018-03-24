package pl.sternik.kk.zadania.spring.zad11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


public class DbBeanConfigurator {

	private String driverClass;
	private String jdbcUrl;
	private String user;
	private String password;

	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer ppc = new PropertySourcesPlaceholderConfigurer();
		return ppc;
	}

	public Connection dataSource() {
		return new Connection(jdbcUrl + ":" + driverClass);
	}
}
