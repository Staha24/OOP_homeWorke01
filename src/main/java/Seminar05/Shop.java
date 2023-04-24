package Seminar05;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements SellTelephone {

    private ArrayList<Telephone> listTelephone;


    @Override
    public ArrayList<Telephone> create(ArrayList<Telephone> listTelephone) {



        Telephone nokia = new Telephone("Nokia", 4500, 6.14, "3310", "Android", 5500);
        Telephone samsung = new Telephone("Samsung", 6000, 9.8, "Galaxy", "Android", 35000);
        Telephone apple = new Telephone("Apple", 5000, 7.20, "14", "IOS", 55000);
        Telephone xiaomi = new Telephone("Xiaomi", 3000, 9.0, "Red me note", "Android", 40000);

        listTelephone.add(nokia);
        listTelephone.add(samsung);
        listTelephone.add(apple);
        listTelephone.add(xiaomi);

        return listTelephone;

    }


    @Override
    public ArrayList<Telephone> sell(ArrayList<Telephone>listTelephone) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Какой телефон выбрали? ");
        String byePhone = sc.next();
        sc.close();

        ArrayList<Telephone> tempList = new ArrayList<>();
        for (Telephone telephone: listTelephone){

            if (!byePhone.equals(telephone.getName())){
                tempList.add(telephone);
            }

        }
        listTelephone.clear();
        listTelephone.addAll(tempList);
        return listTelephone;
    }

    @Override
    public ArrayList<Telephone> add(ArrayList<Telephone> listTelephone) {
        Telephone phone = new Telephone();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название производителя: ");
        String name = sc.next();
        System.out.println("Введите емкость акб: ");
        Integer qualityAkb = sc.nextInt();
        System.out.println("Введите размер экрана: ");
        Double sizeDisplay =sc.nextDouble();
        System.out.println("Введите модель телефона: ");
        String model =sc.next();
        System.out.println("Введите тип ОС телефона: ");
        String typeOs = sc.next();
        System.out.println("Введите стоимость телефона: ");
        String price = sc.next();

        //listTelephone.add(sc);
        sc.close();

        return listTelephone;
    }
}
