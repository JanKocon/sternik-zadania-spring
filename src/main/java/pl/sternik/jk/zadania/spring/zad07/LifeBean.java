package pl.sternik.jk.zadania.spring.zad07;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import pl.sternik.jk.zadania.spring.zad01.MyFirstBean;


public class LifeBean {

	private MyFirstBean firstBean;

	public LifeBean() {
		try {
			System.out.println(firstBean.getName());
		} catch (NullPointerException e) {
			System.out.println("No jeszcze nie ma!");
		}
	}

	public void setup() {
		System.out.println("po konstrukcji!");
		System.out.println("Teraz jest.." + firstBean.getName());
	}

	public void clean() {
		System.out.println("sprzątam!");
	}

}
