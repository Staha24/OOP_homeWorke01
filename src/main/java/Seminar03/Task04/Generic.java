package Seminar03.Task04;

public class Generic {
    public static void main(String[] args) {


        MyInterface<Integer> I_test = (n, m) -> (n % m == 0);
        if (I_test.test(10,10));
        System.out.println("Десять является делителем десяти");

        MyInterface<Double> I_test2 = (n, m) -> (n % m == 0);
        if (I_test2.test(13.5, 13.5));
        System.out.println("13.5 является делителем 13.5");

        MyInterface<String> word = (n, m) -> (n.indexOf(m)  !=-1);
        String str = "Обобщенный интерфейс";
        if (word.test(str, "обобщенный"));
        System.out.println("Найдено");

    }
}
