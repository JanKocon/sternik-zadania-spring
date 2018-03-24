package pl.sternik.jk.zadania.spring.zad02;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunIt 
{
    public static void main( String[] args ) throws IOException
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        System.out.println("Kontener Spring wstał i zainicjalizował sie.");
        System.out.println("Nacisnij enter");
        System.in.read();
    	MySecondBean obj = (MySecondBean) context.getBean("mySecondBean");
        System.out.println(obj.getName());
        
        context.close();
    }
}
