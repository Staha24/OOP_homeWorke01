package Seminar03.Task06;
import java.util.function.BinaryOperator;
public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> bool2 = (x, y)->(x*y);
        System.out.println(bool2.apply(10,2));
    }
}
