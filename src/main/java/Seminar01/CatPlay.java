package Seminar01;

public class CatPlay {

    public static void main(String[] args) {
        //Animal cat = new Animal("кот","Барсик", 0.8, false, true, true); вместо этого пишем
        Cat cat = new Cat("кот","Барсик", 0.8, false, true, true);
        cat.say();
        Cat2 cat2 = new Cat2("кот","Барсик", 0.8, false, true, true);
        cat2.say();
        cat2.age = 25;
        System.out.println(cat2.age);
        cat2.setRost(56);
        System.out.println(cat2.getRost());

        //cat.type = "кот";
        //cat.name = "Барсик";
        //cat.age = 15;
        //cat.weight = 0.8;
        //cat.isFly = false;
        //cat.isWalke = true;
        //cat.isSwim = true;



        //System.out.println(cat.display());

    }
}
