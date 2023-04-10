package Seminar01_homeWorke;
//Наследованный интерфейс дя собак от интерыейса животное
public interface Animal_dog extends Animal{
    void bark(); //добавлен метод лаять
}
class Dog implements Animal_dog{ //создан наследованный класс собак

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

