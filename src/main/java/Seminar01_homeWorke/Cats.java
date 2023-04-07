package Seminar01_homeWorke;

public class Cats implements Animal{

    void hant(){
        System.out.println("Шипит");
    }

    @Override
    public void eat() {
        System.out.printf("Мяяяяяяяяяяу!");
    }

    @Override
    public void sleep() {
        System.out.println(" Мур-мур");

    }

    @Override
    public void drink() {
        System.out.println("Мур-мяу");

    }
}
