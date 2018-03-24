package pl.sternik.jk.zadania.spring.zad03;

import pl.sternik.jk.zadania.spring.zad01.MyFirstBean;

public class MyThirdBean {
    private String name;
    private MyFirstBean bean;

    public MyThirdBean() {
        System.out.println("Robie trzeciego");
    }

    public String getCompoundName() {
        return name + "[" + bean.getName() + "]";
    }

    public MyFirstBean getBean() {
        return bean;
    }

    public void setBean(MyFirstBean bean) {
        System.out.println("Cos wywolalo setter bean");
        this.bean = bean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Cos wywolalo setter name");
        this.name = name;
    }

    public MyThirdBean(String name) {
        super();
        this.name = name;
        System.out.println("Robię trzeciego z nazwa");
    }


}
