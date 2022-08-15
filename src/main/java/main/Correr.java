package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Correr {
    private Carro carro;

    public Correr() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        this.carro = context.getBean("Carro1", Carro.class);
        System.out.println(this.carro);
    }

    public void aumentaPuertas(){
        carro.setPuertas(carro.getPuertas()+1);
    }
}
