package Seminar01_homeWorke;

import Seminar04.Task01.Gen;
import Seminar04.Task02.Numerec;
import Seminar04.Task05.Sum;
import Seminar05.Shop;
import Seminar05.Telephone;

import java.util.ArrayList;
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

        Shop_fish shop = new Shop_fish();
        ArrayList<Fish> listFish = new ArrayList<>();
        shop.create_fish(listFish);

        for (Fish temp:listFish) {
            System.out.println(temp.toString());
        }

        shop.sell_fish(listFish);
        for (Fish temp:listFish) {
            System.out.println(temp.toString());
        }


    }

}
