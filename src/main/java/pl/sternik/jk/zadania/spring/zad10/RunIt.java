package pl.sternik.jk.zadania.spring.zad10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.sternik.jk.zadania.spring.zad02.MySecondBean;
import pl.sternik.jk.zadania.spring.zad03.MyThirdBean;


public class RunIt {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
//	     new AnnotationConfigApplicationContext();
	     new AnnotationConfigApplicationContext(AdditionalBeanConfigurator.class);
//		 ctx.register(AdditionalBeanConfigurator.class);
//		 ctx.register(BeanConfigurator.class);
//		 ctx.refresh();

		System.out.println(ctx.getBean("myDrugiNazwany",MySecondBean.class).getName());
		System.out.println(ctx.getBean("getMyTrzeciNazwany",MyThirdBean.class).getCompoundName());

		ctx.close();
	}
}
