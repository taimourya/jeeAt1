package Presentation;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAvecSring {

    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("confBean.xml");
        IMetier metier = (IMetier) context.getBean("metier");

        System.out.println("calculer : " + metier.calculer());

    }


}
