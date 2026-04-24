package animal_by_xml;

import java.util.List;

public class Person {
    private String name;
    private Animal Dog;
    private List<Animal> cats;

    public void setName(String name) { this.name = name; }
    public void setDog(Animal Dog) { this.Dog = Dog; }
    public void setCats(List<Animal> cats) { this.cats = cats; }

    public void say_my_name(){
        System.out.println("我是"+this.name);
    }

    public void showFamily() {
        say_my_name();
        System.out.println("我有一条狗：");
        Dog.say();
        System.out.println("我还有一群猫：");
        for (Animal cat : cats) {
            cat.say();
        }
    }
}