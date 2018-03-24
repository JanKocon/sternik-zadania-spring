package pl.sternik.jk.zadania.spring.zad02;

import org.springframework.stereotype.Component;

@Component("mySecondBean")
public class MySecondBean {
    private String name;

    public String getName() {
        return name;
    }

	public void setName(String name) {
	    System.out.println("Cos wywoałało settera");
		this.name = name;
	}

	public MySecondBean(String name) {
		super();
		System.out.println("Robie drugiego z name");
		this.name = name;
	}

    public MySecondBean() {
        System.out.println("Robie drugiego");
    }
}
