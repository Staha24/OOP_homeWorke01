package Seminar01_homeWorke;

import java.util.Objects;

public class Fish {
    //создан класс рыбок для продажи
    private  String name;
    private  String color;
    private  String age;

    public Fish(String name, String color, String age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish fish)) return false;
        return Objects.equals(getName(), fish.getName()) && Objects.equals(getColor(), fish.getColor()) && Objects.equals(getAge(), fish.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getAge());
    }
}
