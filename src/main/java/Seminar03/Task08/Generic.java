package Seminar03.Task08;

import java.util.function.Function;

public class Generic {
    public static void main(String[] args) {
        Function<Integer, String> name = (x)->(String.valueOf(x)+" долларов ");//value.off предсиавляет число строкой
        System.out.println(name.apply(10));

    }
}
