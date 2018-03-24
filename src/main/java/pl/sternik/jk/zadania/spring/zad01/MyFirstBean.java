package pl.sternik.jk.zadania.spring.zad01;

public class MyFirstBean {
    private String name;

    public String getName() {
        return name;
    }

	public void setName(String name) {
	    System.out.println("Cos wywoałało settera");
	    this.name = name;
	}

	public MyFirstBean(String name) {
		super();
		System.out.println("Robie pierwszego z name");
		this.name = name;
	}

    public MyFirstBean() {
        System.out.println("Robie pierwszego");
    }
}
