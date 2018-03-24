package pl.sternik.jk.zadania.spring.zad03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunIt 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
        MyThirdBean obj = (MyThirdBean) context.getBean("myThirdBean");
        System.out.println(obj.getCompoundName());
        
        context.close();
    }
}
