package pl.sternik.jk.zadania.spring.zad10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

import pl.sternik.jk.zadania.spring.zad01.MyFirstBean;
import pl.sternik.jk.zadania.spring.zad03.MyThirdBean;
import pl.sternik.jk.zadania.spring.zad09.BeanConfigurator;

@Configuration
//@Import(BeanConfigurator.class)
public class AdditionalBeanConfigurator {

	@Bean
	public MyThirdBean getMyTrzeciNazwany() {
		MyThirdBean t = new MyThirdBean();
		MyFirstBean b = new MyFirstBean();
		b.setName("First bean a kuku");
		t.setBean(b);
		t.setName("Trzeci a kuku");
		return t;
	}

}
