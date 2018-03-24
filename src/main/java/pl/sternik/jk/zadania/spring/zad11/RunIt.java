package pl.sternik.jk.zadania.spring.zad11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sternik.jk.zadania.spring.zad11.DbBeanConfigurator;

public class RunIt {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(DbBeanConfigurator.class);

		pl.sternik.kk.zadania.spring.zad11.Connection obj = ctx.getBean(pl.sternik.kk.zadania.spring.zad11.Connection.class);
		System.out.println(obj);

		ctx.close();

	}
}
