package Seminar04.Task02;

public class Main {
    public static void main(String[] args) {
        Numerec<Integer> ob = new Numerec<>(5);
        System.out.println("Обратная величина ob: "+ ob.getNum());
        System.out.println("Дробная часть ob: "+ ob.getNum());

        Numerec<Double> ob2 = new Numerec<>(5.5);
        System.out.println("Обратная величина ob: "+ ob2.getNum());
        System.out.println("Дробная часть ob: "+ ob2.getNum());
    }
}
