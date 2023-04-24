package Seminar01_homeWorke;
//создан магазин для продажи рыбок

import Seminar05.Telephone;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop_fish implements I_fish_shop{
    private ArrayList<Fish> listFish;


    @Override //ьуеод формирования списка рыб
    public ArrayList<Fish> create_fish(ArrayList<Fish> listFish) {

        Fish fish1 = new Fish("Dora","yellow","big");
        Fish fish2 = new Fish("MIS","green","big");
        Fish fish3 = new Fish("Boss","black","young");
        Fish fish4 = new Fish("Duk","red","young");
        Fish fish5 = new Fish("Som","grey","big");

        listFish.add(fish1);
        listFish.add(fish2);
        listFish.add(fish3);
        listFish.add(fish4);
        listFish.add(fish5);

        return listFish;
    }

    @Override //метод продажи рыбок
    public ArrayList<Fish> sell_fish(ArrayList<Fish> listFish) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Какую рыбку хотите приобрести? ");
        String byeFish = sc.next();
        sc.close();

        ArrayList<Fish> tempList = new ArrayList<>();
        for (Fish fish: listFish){

            if (!byeFish.equals(fish.getName())){
                tempList.add(fish);
            }

        }
        listFish.clear();
        listFish.addAll(tempList);
        return listFish;
    }



}
