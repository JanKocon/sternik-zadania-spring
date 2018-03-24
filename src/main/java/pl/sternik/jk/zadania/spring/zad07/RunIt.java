package pl.sternik.jk.zadania.spring.zad07;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

public class RunIt
{
	public static void main( String[] args )
    {
    	ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        LifeBean lb = ctx.getBean(LifeBean.class);
        ctx.close();
    }
    @PostConstruct
    public void setup()
    {
        System.out.println("Po konstrukcji");
    }
}
