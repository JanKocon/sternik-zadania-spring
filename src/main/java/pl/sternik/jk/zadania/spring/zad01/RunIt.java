package pl.sternik.jk.zadania.spring.zad01;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunIt 
{
    public static void main( String[] args ) throws IOException
    {
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
        System.out.println("Kontener Spring wstał i zainicjalizował sie.");
    	System.out.println("Nacisnij enter");
    	System.in.read();
    	MyFirstBean obj = (MyFirstBean) context.getBean("myFirstBean");
        System.out.println(obj.getName());
        
        context.close();
    }
}
