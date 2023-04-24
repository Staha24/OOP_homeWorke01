package Seminar04.Task01;

public class Main {
    public static void main(String[] args) {
        //Gen<Integer> num = new Gen<>(88);
        //num.showType();

        //Gen<String> str = new Gen<>("test");
        //str.showType();

        //System.out.println(num.ob);
        //System.out.println(str.ob);

        Gen<Integer, String>ob = new Gen<>(88, "test");
        ob.showType();
        System.out.println(ob.getOb());
        System.out.println(ob.getOb2());
    }
}
