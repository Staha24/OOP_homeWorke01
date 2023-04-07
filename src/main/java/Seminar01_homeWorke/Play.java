package Seminar01_homeWorke;

import java.util.Scanner;

public class Play {


    public static void main(String[] args) {
        //Human parents = new Human("мужской", 35, "Николай", "Николаев", "отец");
        Parents parents = new Parents("мужчина", 25, "Oleg", "Olegovich", "папа");
        parents.scanner();
        parents.say();
        Parents mather = new Parents("женщина", 23, "Елена", "Olegovich", "мама");
        mather.scanner();
        mather.asks();
        mather.says();
        Kids son = new Kids("мальчик", 8, "Миша", "Olegovich", "сын") {
            @Override
            public void say() {

            }
        };
        son.scanner();
        Cats cat = new Cats();
        cat.sleep();
        cat.hant();
        Dog ob = new Dog();
        ob.bark();
        ob.sleep();
    }

}
