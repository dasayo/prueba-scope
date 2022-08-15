package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Carro car1 = context.getBean("Carro1", Carro.class);
        Carro car2 = context.getBean("Carro1", Carro.class) ;
        car1.pitar();
        car2.setPuertas(5);
        System.out.println(car1.getPuertas());
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car2.getContPit());

        Correr correr = new Correr();
        correr.aumentaPuertas();

    }
}
