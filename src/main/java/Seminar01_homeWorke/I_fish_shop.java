package Seminar01_homeWorke;

import Seminar05.Telephone;

import java.util.ArrayList;

public interface I_fish_shop {
    //интерфейс для продажи рыб
    ArrayList<Fish> create_fish(ArrayList<Fish> listFish);


    ArrayList<Fish> sell_fish (ArrayList<Fish> listFish);
}
