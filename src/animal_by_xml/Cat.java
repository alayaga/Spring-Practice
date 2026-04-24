package animal_by_xml;

public class Cat implements Animal {
    private int age;
    private String color;

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
        System.out.println("一只" + this.age + "岁的" + this.color + "猫被创建");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void say() {

        System.out.println("喵，我是年龄为" + age + "的" + color + "色的猫");
    }
}
