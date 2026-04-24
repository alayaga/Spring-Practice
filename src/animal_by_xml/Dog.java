package animal_by_xml;

public class Dog implements Animal {
    private int age;
    private String color;

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("汪，我是年龄为" + age + "的" + color + "色的狗");
    }
}