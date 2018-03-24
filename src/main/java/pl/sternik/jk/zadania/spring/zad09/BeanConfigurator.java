package pl.sternik.jk.zadania.spring.zad09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import pl.sternik.jk.zadania.spring.zad01.MyFirstBean;
import pl.sternik.jk.zadania.spring.zad02.MySecondBean;
import pl.sternik.jk.zadania.spring.zad03.MyThirdBean;

@Configuration
public class BeanConfigurator {
	@Bean
	public MySecondBean myDrugi() {
		return new MySecondBean("AAAA");
	}
	@Bean
	public MySecondBean myDrugiNazwany() {
		MySecondBean t = new MySecondBean();
		t.setName("Tralal ala");
		return t;
	}
	@Bean
	public MyThirdBean mySkomplikowany() {
        MyThirdBean mtb = new MyThirdBean("skomplikowany");
        mtb.setBean(getMyFirstBean());
		return mtb;
	}
	@Bean
	public MyFirstBean getMyFirstBean(){return new MyFirstBean("ale pierwszy");}
}
