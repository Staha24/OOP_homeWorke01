package Seminar03.Task09;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> funct  = (x)->System.out.printf("%d долларов\n",x);
        funct.accept(10);

    }
}
