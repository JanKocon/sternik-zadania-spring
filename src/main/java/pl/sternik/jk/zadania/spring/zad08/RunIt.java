package pl.sternik.jk.zadania.spring.zad08;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunIt
{
	public static void main( String[] args )
    {
    	ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        SingletonBean sb1 = ctx.getBean(SingletonBean.class);
        SingletonBean sb2 = ctx.getBean(SingletonBean.class);
        System.out.println("S równe?:"+Boolean.valueOf(sb1==sb2));
        
        
        PrototypeBean pb1 = ctx.getBean(PrototypeBean.class);
        PrototypeBean pb2 = ctx.getBean(PrototypeBean.class);
        System.out.println("P równe?:"+Boolean.valueOf(pb1==pb2));
        ctx.close();
    }
}
