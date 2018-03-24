package pl.sternik.kk.zadania.spring.zad11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunIt {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(DbBeanConfigurator.class);

		Connection obj = ctx.getBean(Connection.class);
		System.out.println(obj);

		ctx.close();

	}
}
