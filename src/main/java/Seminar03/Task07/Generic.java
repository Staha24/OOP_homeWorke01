package Seminar03.Task07;

import java.util.function.UnaryOperator;

public class Generic {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = (x)->(x*x);
        System.out.println(unary.apply(8));

    }
}
