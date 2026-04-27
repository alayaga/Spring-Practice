package animal_by_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("animal_by_xml/applicationContext.xml");

        Dog dog1 = (Dog) ctx.getBean("yellowDog");
        Dog dog2 = (Dog) ctx.getBean("yellowDog");
        Dog dog3 = (Dog) ctx.getBean("blackDog");
        dog1.say();dog2.say();dog3.say();
        dog2.setColor("浅黄");
        dog1.say();dog2.say();

        Cat cat1 = (Cat) ctx.getBean("blueCat");
        Cat cat2 = (Cat) ctx.getBean("blueCat");
        Cat cat3 = (Cat) ctx.getBean("yellowCat");
        cat1.say();cat2.say();cat3.say();
        cat1.setColor("浅蓝");cat2.setColor("深蓝");
        cat1.say();cat2.say();

        System.out.println("---------------------------------");

        Person Eren = (Person) ctx.getBean("jaeger");
        Eren.say_my_name();
        Eren.setName("Eren Yeager");
        Eren.showFamily();

    }
}