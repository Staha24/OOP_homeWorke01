package Seminar01_homeWorke;

public interface Animal_dog extends Animal{
    void bark();
}
class Dog implements Animal_dog{

    @Override
    public void eat() {
        System.out.println("Ест");
    }

    @Override
    public void sleep() {
        System.out.println("Спит");

    }

    @Override
    public void drink() {
        System.out.println("Пьет");

    }

    @Override
    public void bark() {
        System.out.println("Гав-гав");

    }
}

